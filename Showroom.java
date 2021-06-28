import java.util.ArrayList;

public class Showroom {
    public static void main(String args[]){
        ArrayList<Vehicle>vehicles = new ArrayList<Vehicle>();
        Vehicle obj1 = new NormalVehicles("4S3BMHB68B3286050", 180, 15);
        
        Vehicle obj2 = new NormalVehicles("5S3BNHB68B3286050", 200, 16);
        Vehicle obj3 = new NormalVehicles("6S3BMHB68C3286050", 170, 14);

        Vehicle obj4 = new SportsVehicles("12S3BMHB68B3286150", 190, 15);
        Vehicle obj5 = new SportsVehicles("15S3BMJB68B3286050", 210, 17);
        Vehicle obj6 = new HeavyVehicles("17S3BMHD68B3286050", 178, 2, 14);
        Vehicle obj7 = new HeavyVehicles("18S3BMHK68B3286050", 188, 3, 13);

        vehicles.add(obj1);
        vehicles.add(obj2);
        vehicles.add(obj3);
        vehicles.add(obj4);
        vehicles.add(obj5);
        vehicles.add(obj6);
        vehicles.add(obj7);
        
        System.out.println("Currently available vehicles in the showroom");
        System.out.println("-------------------------");
        
        for(int i=0;i<vehicles.size();i++){
            vehicles.get(i).display();
        }

        vehicles.remove(obj2);

        System.out.println("Currently available vehicles in the showroom");
        System.out.println("-------------------------");
        
        for(int i=0;i<vehicles.size();i++){
            vehicles.get(i).display();
        }

    }
    
}
