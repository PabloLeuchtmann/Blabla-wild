package fr.wcs.blablawild;

/**
 * Created by wilder on 13/03/18.
 */

public class VehiclesPlane extends VehiclesAbstract {



        int speed;


        public int getHours () {return speed;}

        public VehiclesPlane(String brand, String model,int speed) {
            this.speed = speed;
            setBrand(brand);
            setModel(model);

        }

        @Override
        public String getDescription() {
            return brand + " , " + model + " , " + speed;
        }
    }


