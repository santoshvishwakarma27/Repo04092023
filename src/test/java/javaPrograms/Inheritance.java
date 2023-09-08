package javaPrograms;

class A
{
	int a=7;
	public void show()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int a=12;
	public void show()
	{
		System.out.println(a);		
		//System.out.println(super.a);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//B b=(B) new A();
		A b=new B();
		b.show();

	}

}
