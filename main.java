// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Vehicle{
    String color;
    String type;
    int NoOfWheels;
    int PassengerNo;
    String CompanyName;
    String FuelType;
    void Vehicle(color){
    this.color = color;
    }
    void Vehicle(type){
    this.type = type;
    }
    void Vehicle(NoOfWheels){
    this.NoOfWheels = NoOfWheels;
    }
    void Vehicle(PassengerNo){
    this.PassengerNo = PassengerNo;
    }
    void Vehicle(CompanyName){
    this.CompanyName = CompanyName;
    }
    void Vehicle(FuelType){
    this.FuelType = FuelType;
    }
        public void Display(){
            System.out.println("This Vehicle is" + this.type + "which is " + this.color + "in color and having " + this.NoOfWheels + " wheels. This Vehicle is used by " + this.PassengerNo + ". This Vehicle uses " + this.FuelType + "as it's fuel");
        }
}

class MotorCycle extends Vehicle{
     MotorCycle(String color, String type, int NoOfWheels, int PassengerNo, String CompanyName, String FuelType){
    super(color);
    super(type);
    super(NoOfWheels);
    super(PassengerNo);
    super(CompanyName);
    super(FuelType);
   // final type = Motor-Cycle/ Scooter;
    //final NoOfWheels = 2;
  //  final PassengerNo = 2;
   /// Final FuelType = Pe
}
@Override 
 public void Display(){
            System.out.println("This Vehicle is" + super.type + "which is " + super.color + "in color and having " + super.NoOfWheels + " wheels. This Vehicle is used by " + super.PassengerNo + ". This Vehicle uses " + super.FuelType + "as it's fuel");
        }
    
}

public class main {
    public static void main(String[] args) {
        
        MotorCycle motorcycle = new MotorCycle("Red", "Motor-Cycle/ Scooter", 2, 2, "Honda", "Petrol");
        MotorCycle.Display();
    }
}
