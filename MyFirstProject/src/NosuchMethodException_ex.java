public class NosuchMethodException_ex {

	public void foo() {
		System.out.println("foo");
	}
	

	public static void main(String[] args) throws Exception{

		 NosuchMethodException_ex d = new  NosuchMethodException_ex();
		d.foo();
		d.bar();

	}

}