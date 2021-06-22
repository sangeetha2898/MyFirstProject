abstract class Parent_class
{
	abstract public void method1();
	public void method2()
	{
		System.out.println("Non abstract method in Abstarct class");
	}
}
class  Abstract_class_Ex extends Parent_class
{
	public void method1()
	{
		System.out.println("Abstarct method is implemented in child class");
	}
	
	public static void main(String[] args) {
		Parent_class obj=new Abstract_class_Ex();
		obj.method1();
		obj.method2();

	}

}
