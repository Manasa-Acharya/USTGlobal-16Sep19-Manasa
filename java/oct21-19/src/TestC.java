
public class TestC {
public static void main(String[] args) {
	Person.color= "white";
	Person.sleep();
	System.out.println("Person color "+Person.color);
	System.out.println("************************************");
Person p1 = new Person();
p1.age=28;
p1.name= "Tejasvi";
System.out.println("Person p1 age " +p1.age);
System.out.println("Person p1 name " +p1.name);
p1.color = "white";
p1.sleep();
System.out.println("Person 1 color "+p1.color);
 System.out.println("****************************");
 
 Person p2 = new Person();
 p2.age=22;
 p2.name="aaaaaaa";
 System.out.println("Person p2 age " +p2.age);
 System.out.println("Person p2 name " +p2.name);
 
 System.out.println("****************************");

}
}
