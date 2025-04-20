
import java.util.ArrayList;
import java.util.List;

public class LiskovProblem {
    public static class Vehicle{
        public Integer getNumberOfWheels(){
            return 2;
        }
        public Boolean hasEngine(){
            return true;
        }
    }

    public static class Motorcycle extends Vehicle{

    }

    public static class Car extends Vehicle{
        @Override
        public Integer getNumberOfWheels(){
            return 4;
        }
    }

    // Problem part
    public static class Bicycle extends Vehicle{
        public Boolean hasEngine(){
            return null;
        }
    }

    public static void main(String[] args){
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Motorcycle());
        vehicleList.add(new Car());

        for(Vehicle vehicle:vehicleList){
            System.out.println(vehicle.hasEngine().toString());
        }

    }
}
