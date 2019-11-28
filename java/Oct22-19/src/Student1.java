
public class Student1 {
	String name;
	int id;
	int age;
	int mbno;
	String clgname;
	public Student1(String name, int id,int age,int mbno,String clgname) {
		this.name = name;
		this.id = id;
		this.age=age;
		this.mbno=mbno;
		this.clgname=clgname;
	}
	void printDetails() {
		System.out.println("Student name is " +name);
		System.out.println("Student id is " +id);
		System.out.println("Student age is " +age);
		System.out.println("Student mbno is " +mbno);
		System.out.println("Student clgname is " +clgname);
	}
		
	public static void main(String[] args) {
		Student1 s1 =  new Student1("madhu" , 123,26,99999,"Vcet");
		s1.printDetails();
		System.out.println("______________________________________");
		Student1 s2 =  new Student1("madhuri" , 124,22,999789,"Vcet");
		s2.printDetails();
		System.out.println("______________________________________");
		Student1 s3 =  new Student1("manasa" , 125,21,98099,"Vcet");
		s3.printDetails();
		System.out.println("______________________________________");
		Student1 s4 =  new Student1("maneesh" , 126,21,89799,"Vcet");
		s4.printDetails();
		System.out.println("______________________________________");
		Student1 s5 =  new Student1("namatha" , 127,21,90899,"Vcet");
		s5.printDetails();
		System.out.println("______________________________________");
		Student1 s6 =  new Student1("ankith" , 128,21,978909,"Vcet");
		s6.printDetails();
		System.out.println("______________________________________");
		Student1 s7 =  new Student1("akash" , 129,21,77899,"Vcet");
		s7.printDetails();
		System.out.println("______________________________________");
		Student1 s8 =  new Student1("raise" , 130,21,99099,"Vcet");
		s8.printDetails();
		System.out.println("______________________________________");
		Student1 s9 =  new Student1("shammu" , 131,21,908999,"Vcet");
		s9.printDetails();
		System.out.println("______________________________________");
		Student1 s10 =  new Student1("bindu" , 132,21,90099,"Vcet");
		s10.printDetails();
		System.out.println("______________________________________");
		
		
		
		
}
}
