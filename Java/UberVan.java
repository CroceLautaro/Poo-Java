
import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {

    Map<String, ArrayList<String>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    
    public UberVan(String license, Account driver){
        super(license, driver);
    }   
     
    @Override
    public void setPassenger(int passenger) {
        if (passenger == 6) {
            this.passenger = passenger;
        } else
            System.out.println("error de pasajeros");
    }
    @Override
    void printDataCar() {
        super.printDataCar();
    }
}
