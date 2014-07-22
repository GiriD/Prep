class LinkedListMain
{
	public static void main(String args[])
	{
		LinkedList list =  new LinkedList();
		boolean cycletest = true;
		if(cycletest)
		{
			list.createCycle();
			System.out.println("Cycle: "+ list.isCycle());
			System.out.println("Start Node: "+ list.returnStart().getData());
			System.out.println("Length of Cycle: "+ list.lengthofcycle());
			return;
		}
		list.insertFirst(10);
		list.display();
		list.insertLast(90);
		list.display();
		list.insertBefore(5,10);
		list.display();
		list.insertAfter(7,5);
		list.display();

		list.insertBefore(100,34);
		list.delete(7);	
		list.display();	
		System.out.println(list.mtolast(1).getData());
	}
}