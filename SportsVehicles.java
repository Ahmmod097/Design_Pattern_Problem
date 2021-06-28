public class SportsVehicles implements Vehicle{
    private String modelNo, eType;
    private int ePower, tireSize, vNumber = 50 ;
    private boolean hasTurbo;

    SportsVehicles(String modelNo, int ePower, int tireSize){
     
     
     this.modelNo = modelNo;
     this.eType = "Oil Only";
     this.hasTurbo = true;
     this.ePower = ePower;
     this.tireSize = tireSize;
    }

    public void getModelNumber(){
        System.out.println("The Model number is" + " " + modelNo);
    }

    public void getEngineType(){
        System.out.println("The Engine type is" + " " +eType);
    }

    public void checkTurbo(){
        System.out.println("The Engine has also turbo");
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
       System.out.println("This is a Sports Vehicle");
       getModelNumber();
       getEngineType();
       checkTurbo();
       getEnginePower();
       getTireSize();        
       getVisitorNumber();
       System.out.println("------------------");
    }
    
}

