class CompareInt
{
	public static void main(String args[])
	{
		int a,b;
		a=-10;
		b=-10;
		//bitwise(a,b);
		trycatch(a,b);
	}

	public static void trycatch(int a, int b)
	{
		try{
			int temp = 1/(a-b);
			System.out.println("TC: Not Equal");
		}
		catch(ArithmeticException e){
			System.out.println("TC: Equal");
		}

	}

	public static void bitwise(int a, int b)
	{
		switch(a^~b){
			case -1: System.out.println("Bit: Equal"); break;
			default: System.out.println("Bit: Not Equal");
		}
	}
}