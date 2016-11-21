/**
 * Created by Rita on 2016-11-21.
 */
public abstract class Plant {
    protected String color;
    protected int waterState;
    protected boolean isThirsty;
    protected String type;

    public Plant(String color) {
        this.color = color;
        waterState = 0;
        isThirsty = true;
    }

    public abstract void changeThirsty(double waterGiven);

    public String needWater() {
        String needwater = "";
        if (isThirsty) {
            needwater = " needs ";
        } else {
            needwater = " doesnt need ";
        }
        return "The " + color + " " + type + needwater + "water";
    }

    public boolean isThirsty() {
        return isThirsty;
    }
}
