class FlattenList
{
	Node head, tail;

	void createList()
	{
		Node n11 = new Node(5);
		head = n11;
		Node n12 = new Node(33);
		n11.next = n12;
		Node n13 =  new Node(17);
		n12.next = n13;
		Node n14 = new Node(2);
		n13.next = n14;
		Node n15 =  new Node(1);
		n14.next = n15;
		tail = n15;

		Node n21 = new Node(6);
		n11.child = n21;
		Node n22 =  new Node(25);
		n21.next = n22;
		Node n23 = new Node(6);
		n22.next = n23;
		Node n31 =  new Node(8);
		n22.child = n31;

		Node n41 = new Node(9);
		n23.child = n41;
		Node n42 =  new Node(7);
		n41.next = n42;

		Node n51 =  new Node(2);
		Node n52 = new Node(7);
		n51.next = n52;
		n14.child = n51;

	}

	void display()
	{
		Node current = head;
		while(current != tail)
		{
			System.out.print(" -->"+ current.getData());
			current =  current.next;
		}
		System.out.print(" -->"+ current.getData());
	}

	void flatten()
	{
		Node current = head;

		if(head == null)
			return;

		// Do while because while will not work for one node
		do{
			if(current.child !=null)
			{
				tail.next = current.child;
				Node childcurrent =  current.child;
				while(childcurrent.next != null)
				{
					childcurrent =  childcurrent.next;
				}
				tail =  childcurrent;
			}

			current =  current.next;
		}while(current!=tail);
	}
}
