import java.util.ArrayList;

/**
 * Created by Rita on 2016-11-21.
 */
public class Garden {
    public ArrayList<Plant> garden;

    public Garden() {
        garden = new ArrayList<>();
    }

    public void watering(double waterAvailable) {
        System.out.println("Watering with " + (int) waterAvailable);
        ArrayList<Plant> thirstyPlants = new ArrayList<>();
        for (Plant plant : garden) {
            if (plant.isThirsty) {
                thirstyPlants.add(plant);
            }
        }
        for (Plant plant : thirstyPlants) {
            plant.changeThirsty(waterAvailable/thirstyPlants.size());
        }
    }
}
