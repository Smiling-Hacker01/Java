package OOPS.NewOOPS.Inheritance;

//single level inheritance
class Animal {
    public void sound(){
        System.out.println("All animals make sound");
    }
}
class cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat meows");
    }
}

// multi level inheritance
  class farmer{
    public void material(){
        System.out.println("Farmer collect material from his field");
    }
  }
  class vendors extends farmer{
     @Override
     public void material(){
        System.out.println("Vendors get material from Farmers");
     }
  }

  class people extends vendors{
    @Override
    public void material(){
        System.out.println("We got material from the vendors");
    }
  }
  //Hirarchica inheritance ( same base class of multiple derived class)

  class DirectSeeling extends farmer{
     public void material(){
        System.out.println("Some people get material Directly from the farmers");
     }
    }
 //Hybrid Inheritance (mixup of inheritance and classes)

     interface engine {
        void startEngine();
     }
     interface FuelType{
        void fuel();
     }

     class vehicle{
        public void wheels(){
            System.out.println("Vehicle has 4 wheels");
        }
     }

     class CAR extends vehicle implements engine, FuelType{
        @Override
           public void startEngine(){
            System.out.println("Starts using key");
           }
           @Override
           public void fuel(){
            System.out.println("Uses diesel and petrol as fuel");
           }
           @Override
           public void wheels(){
             System.out.println("Car has 4 wheels");
           }
     }
public class Inherit {
    public static void main(String[] args) {
        //single level inheritance
        Animal c1 = new cat();
        c1.sound();
        //multilevelInheritance
        people p1 = new people();
        p1.material();
        //hierarhical inheritance
        DirectSeeling d1 = new DirectSeeling();
        d1.material();
        //hybrid inheritance
        CAR V1 = new CAR();
        V1.startEngine();
        V1.fuel();
        V1.wheels();

    }
}
