package javaPrograms;

interface A1
{
	final int a=1;
	public static void show()
	{
		//System.out.println("Interface A1");
	}
}

interface B1
{
	final int a=1;
	public static void show()
	{
		//System.out.println("Interface B1");
	}
}

class C implements A1,B1
{
	public static void show()
	{
		System.out.println("C");
		//System.out.println(a);
	}
	
	public static void show1()
	{
		System.out.println("C");
		//System.out.println(a);
	}
}

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		c.show();
		c.show1();
		C.show1();

	}

}
