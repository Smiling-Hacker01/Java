package OOPS.NewOOPS.Inheritance;

    interface EngineType{
        void engine();
    }
    interface FuelType{
        void fuel();
    }
    interface vehicleType{
        void type();
    }
    class vehicle implements EngineType, FuelType,vehicleType{
        @Override
        public void engine(){
            System.out.println("Engine type depends on the vehicle company");
        }
        @Override
        public void fuel(){
            System.out.println("Uses both petrol and diesel as a fuel");
        }
        @Override
        public void type(){
            System.out.println("Vehicle type is four wheeler");
        }
    }

public class MultipleInheritanceUsingInterface {
    public static void main(String[] args) {
        vehicle v1 = new vehicle();
        v1.engine();
        v1.fuel();
        v1.type();
    }
}           
