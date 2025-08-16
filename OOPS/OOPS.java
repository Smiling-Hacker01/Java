class StudentInfo{
    String name;
    String course;
    int rollno;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.course);
        System.out.println(this.rollno);
    }
}
class dog{
    public void bark(){
        System.out.println("Bow - Bow");
    }
}

public class OOPS{
    public static void main(String[] args){
        // System.out.println("This is Vishal Singh Kushwaha");
        StudentInfo s1 = new StudentInfo();
        s1.name = "vishal";
        s1.course = "Btech CSE";
        s1.rollno = 239077;
        s1.printInfo();
    }
}
