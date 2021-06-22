interface Animal
{
	public abstract void sound(String s1);
}
interface Dog extends Animal
{
	public abstract void Food(String s2);
	
}
public class Interface_ex5 implements Dog{
	public void sound(String s1)
	{
		System.out.println(s1);
	}
	public void food(String s2)
	{
		System.out.println(s2);
	}

	public static void main(String[] args) {
		Interface_ex5 obj=new Interface_ex5();
		obj.sound("Bark");
		obj.food("Pedigre");
		
	}
	
	}


