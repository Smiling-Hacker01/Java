package OOPS.NewOOPS.Abstraction;

interface vehicle{
    void start();
    void fuelType();
    void brake();

    //default method  // llowed after java 9 update
    default public void horn(){
       System.out.println("beep-beep");
    }
}
class FourWheeler implements vehicle{
     public void start(){
        System.out.println("Starts using a key");
     }
     public void fuelType(){
        System.out.println("Uses both petrol,diesel and electricity as fuel");
     }
     public void brake(){
        System.out.println("Stops using brakes");
     }
}

class TwoWheeler implements vehicle{
    public void start(){
        System.out.println("Starts using a button or kick");
    }
    public void fuelType(){
        System.out.println("Uses petrol and electricity as a fuel");
    }
    public void brake(){
        System.out.println("Stops using brakes");
    }
} 

public class AbstractUsingInterfaces {
    public static void main(String[] args) {
        FourWheeler f4 = new FourWheeler();
        TwoWheeler t2 = new TwoWheeler();
        f4.start();
        f4.brake();
        f4.fuelType();
        f4.horn();

        t2.start();
        t2.brake();
        t2.fuelType();
        t2.horn();
    }
}
