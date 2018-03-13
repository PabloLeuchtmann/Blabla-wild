package fr.wcs.blablawild;

/**
 * Created by wilder on 12/03/18.
 */

public class VehiclesCar extends VehiclesAbstract {

    int kilometers;

    public int getKilometers (){
        return kilometers;
    }

    public VehiclesCar(String brand, String model,int kilometers) {
        this.kilometers = kilometers;
        setBrand(brand);
        setModel(model);

    }
    public String getDescription () {

        return brand + " , " + model + " , " + kilometers;

    }
}


