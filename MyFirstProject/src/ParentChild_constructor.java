class ParentChild_Constructor{
	ParentChild_Constructor()
	{
		System.out.println("parent class constructor");
	}
}
 class Child1 extends ParentChild_Constructor
{ 
    int b;

    Child1()
	{
		System.out.println("child class constructor");
	}
	Child1(int a)
	{
		b=a;
	}
	void disp()
	{
		System.out.println(b);
	}

public static void main(String args[])
{
    Child1 obj1=new Child1();
    Child1 obj2=new Child1(8);
    obj2.disp();
}
}