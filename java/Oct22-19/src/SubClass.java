
public class SubClass extends SuperClass {
	String s="Subclass variable";
	
	SubClass(){
		super();
		System.out.println("Sub class constructor");
	}
	void getSdata() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("******************************");
		super.SuperClassMethod();
		SuperClassMethod();
	}
}
