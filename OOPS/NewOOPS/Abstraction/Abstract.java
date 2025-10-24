package OOPS.NewOOPS.Abstraction;

abstract class car{
    abstract void start();
}

class Tesla extends car {
    @Override
    void start(){
        System.out.println("Car starts with voice command");
    }
    void engineType(){
        System.out.println("It's an electric car");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Tesla t1 = new Tesla();
        t1.engineType();
        t1.start();
    }
}
