package javaOopsCode;

public class ConstructorClass {
	
//class constructor can't give any return parameters
// when ever an object created the class constructor will be called implicitly	
	
	int a =2;
	
public ConstructorClass(String string) {
		// TODO Auto-generated constructor stub
	System.out.println("class constructor with argument : "+string );
	}

	public ConstructorClass() {
		System.out.println("class constructor");
		int a = 1;
		int c = a + this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorClass con = new ConstructorClass("constructor");
		ConstructorClass c = new ConstructorClass();
	}

}
