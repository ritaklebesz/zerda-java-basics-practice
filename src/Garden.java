import java.util.ArrayList;

/**
 * Created by Rita on 2016-11-21.
 */
public class Garden {
    public ArrayList<Plant> garden;

    public Garden() {
        garden = new ArrayList<>();
    }

    public void add(Plant plant) {
        garden.add(plant);
    }

    public Plant get(int index) {
        return garden.get(index);
    }

    public int size() {
        return garden.size();
    }

    public String toString() {
        String print = "";
        for (int i=0; i < garden.size(); i++) {
            print += garden.get(i).needWater() + "\n";
        }
        return print;
    }

    public void watering(double waterAvailable) {
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
