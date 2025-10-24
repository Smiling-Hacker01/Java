public class CompileTimePolymorphism{
    void add(int a , int b){
        System.out.println(a+b);
    }
    void add(float a, float b){
       System.out.println(a+b);
    }
    void add(double  d1, double d2){
       System.out.println(d1+d2);
    }
    void add(String s1, String s2){
          System.out.println(s1.concat(s2));
    }
    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();
        obj.add(3, 5);
        obj.add(4.678, 8.897);
        obj.add("Vishal", " Singh Kushwahwa");
        obj.add(9.0, 8.8);
    }
}