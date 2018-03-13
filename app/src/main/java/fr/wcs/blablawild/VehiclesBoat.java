package fr.wcs.blablawild;

/**
 * Created by wilder on 13/03/18.
 */

public class VehiclesBoat extends VehiclesAbstract {

    int hours;


    public int getHours () {return hours;}

    public VehiclesBoat(String brand, String model,int hours) {
        this.hours = hours;
        setBrand(brand);
        setModel(model);

    }

    @Override
    public String getDescription() {
        return brand + " , " + model + " , " + hours;
    }
}
