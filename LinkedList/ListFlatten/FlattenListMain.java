class FlattenListMain
{
	public static void main(String args[])
	{
		FlattenList list = new FlattenList();
		list.createList();
		list.display();
		list.flatten();
		System.out.println("\n");
		list.display();
	}
}