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
}