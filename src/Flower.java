/**
 * Created by Rita on 2016-11-21.
 */
public class Flower extends Plant {

    public Flower(String color) {
        super(color);
        type = "Flower";
    }

    @Override
    public void changeThirsty(double waterGiven) {
        if (waterState + waterGiven*0.75 >= 5) {
            isThirsty = true;
        }
    }
}
