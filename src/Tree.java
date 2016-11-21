/**
 * Created by Rita on 2016-11-21.
 */
public class Tree extends Plant {
    public Tree(String color) {
        super(color);
        type = "Tree";
    }

    @Override
    public void changeThirsty(double waterGiven) {
        if (waterState + waterGiven*0.4 >= 10) {
            isThirsty = false;
        }
    }
}
