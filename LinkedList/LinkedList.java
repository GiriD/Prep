class LinkedList
{
	public Node first;

	LinkedList()
	{
		first =  null;
	}

	void insertFirst(int data)
	{
		Node node =  new Node(data);
		if(first==null)
			first = node;
		else
		{
			node.next = first;
			first = node;
		}
	}

	void insertLast(int data)
	{
		Node node = new Node(data);
		Node current = first;
		if(first==null)
		{
			first = node;
			return;
		}
		while(current.next!=null)
		{
			current=current.next;	
		}
		current.next = node;			
	}

	void insertAfter(int data, int key)
	{
		Node node = new Node(data);
		Node current = first;

		if(first ==  null)
		{
			System.out.println("Empty List");
			return;
		}
		while(current!=null)
		{
			if(current.getData()==key)
				break;
			current = current.next;
		}
		if(current == null)
		{
			System.out.println("Key not found...");
			return;
		}
		node.next = current.next;
		current.next = node;		
	}

	void insertBefore(int data, int key)
	{
		Node node = new Node(data);
		Node current = first, previous = null;
		if(first == null)
		{
			System.out.println("Empty list");
			return;
		}
		while(current!=null)
		{
			if(current.getData()==key)
				break;
			previous = current;
			current =  current.next;
		}
		if(current == null)
		{
			System.out.println("Key not found...");
			return;
		}
		else if(current == first)
		{
			node.next = first;
			first = node;
		}
		else
		{
			previous.next = node;
			node.next =  current;
		}
	}

	void display()
	{
		Node current = first;
		if(first == null)
		{
			System.out.println("Empty List");
			return;
		}
		while(current!=null)
		{
			System.out.print(" -> " + current.getData());
			current =  current.next;
		}
		System.out.println();
	}

	void delete(int data)
	{
		Node current = first;
		Node previous = null;
		while(current!=null)
		{
			if(current.getData() == data)
				break;

			previous = current;
			current = current.next;
		}
		if(current == null)
		{
			System.out.println("Node not found.");
		}
		else if(current == first)
		{
			first = first.next;
		}
		else
		{
			previous.next = current.next;
		}
	}

	Node mtolast(int m)
	{
		Node slow, fast;
		slow=fast=first;

		for(int i=m;i>1;i--)
		{
			if(fast!=null)
			{
				fast=fast.next;
			}
			else
			{
				return null;
			}
		}

		while(fast.next!=null)
		{
			slow=slow.next;
			fast = fast.next;
		}
		return slow;
	}

	void createCycle()
	{
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 =  new Node(30);
		n1.next = n2;
		n2.next = n3;
		n3.next = n2;
		first = n1;
		//display();
	}

	boolean isCycle()
	{
		Node slow,fast;
		slow=fast=first;

		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
				return true;
		}
		return false;
	}

	int lengthofcycle()
	{
		Node slow,fast;
		slow=fast=first;

		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
			{
				int count = 1;
				slow= slow.next;
				fast = fast.next.next;
				while(slow != fast)
				{
					slow= slow.next;
					fast = fast.next.next;
					count++;					
				}
				return count;

			}
		}
		return 0;
	}

	Node returnStart()
	{
		Node slow,fast;
		slow=fast=first;

		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
			{
				fast = first;
				while(slow != fast)
				{
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}
		}
		return null;
	}
}