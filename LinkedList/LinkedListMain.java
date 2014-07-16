class LinkedListMain
{
	public static void main(String args[])
	{
		LinkedList list =  new LinkedList();
		list.insertFirst(10);
		list.display();
		list.insertLast(90);
		list.display();
		list.insertBefore(5,10);
		list.display();
		list.insertAfter(7,5);
		list.display();

		list.insertBefore(100,34);
	}
}