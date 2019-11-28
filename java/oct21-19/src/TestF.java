
public class TestF {
public static void main(String[] args) {
	Student.cname = "VCET";
	Student s1 =  new Student();
	s1.name = "Manasa";
	s1.usn = 4;
	System.out.println(" College name is " + Student.cname);
	System.out.println("Name is " + s1.name);
	System.out.println("ID is " + s1.usn);

}
}
