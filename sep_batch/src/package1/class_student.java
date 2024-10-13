package package1;

public class class_student {
int rollno,age;
public void display1()
{
	System.out.println("welcome to all of you");
}
public void display2()
{
	System.out.println("automation is very easy");
}
public static void main(String[] args) {
	class_student ref=new class_student();
	ref.display1();
	ref.display2();
	ref.rollno=12;
	ref.age=31;
	System.out.println("rollno="+ref.rollno);
	System.out.println("age="+ref.age);
}
}
