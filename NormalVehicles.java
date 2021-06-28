public class NormalVehicles implements Vehicle{
    private String modelNo, eType;
    private int ePower, tireSize, vNumber = 30 ;

    NormalVehicles(String modelNo, int ePower, int tireSize){
     
     this.modelNo = modelNo;
     this.eType = "Diesel, Oil or Gas";
     this.ePower = ePower;
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

    public void getTireSize(){
        System.out.println("The Tire Size is" + " " +tireSize + " " + "inch");
    }

    public void getVisitorNumber(){
        System.out.println("There are" + " " +vNumber + " " + "visitors in the showroom");
    }

    public void display(){
       System.out.println("------------------");
       System.out.println("This is a Normal Vehicle");
       getModelNumber();
       getEngineType();
       getEnginePower();
       getTireSize();        
       getVisitorNumber();
       System.out.println("------------------");
    }
    
}
