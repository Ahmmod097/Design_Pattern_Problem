public class HeavyVehicles implements Vehicle{
    private String modelNo, eType;
    private int ePower, tireSize, vNumber = 30, weight ;

    HeavyVehicles(String modelNo, int ePower, int weight, int tireSize){
     
     this.modelNo = modelNo;
     this.eType = "Diesel Only";
     this.ePower = ePower;
     this.weight = weight;
     this.tireSize = tireSize;
    }

    public void getModelNumber(){
        System.out.println("The Model number is" + " " + modelNo);
    }

    public void getEngineType(){
        System.out.println("The Engine type is" + " " +eType);
    }

    public void getEnginePower(){
        System.out.println("The Engine power is" + " " +ePower + " " + "horsepower");
    }
    
    public void getWeight(){
        System.out.println("The weight of the vehicle is" + " " +weight + " " + "ton");
    }

    public void getTireSize(){
        System.out.println("The Tire Size is" + " " +tireSize + " " + "inch");
    }

    public void getVisitorNumber(){
        System.out.println("There are" + " " +vNumber + " " + "visitors in the showroom");
    }

    public void display(){
       System.out.println("------------------");
       System.out.println("This is a Heavy Vehicle");
       getModelNumber();
       getEngineType();
       getEnginePower();
       getWeight();
       getTireSize();        
       getVisitorNumber();
       System.out.println("------------------");
    }
}
