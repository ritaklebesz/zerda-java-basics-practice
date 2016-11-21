/**
 * Created by Rita on 2016-11-21.
 */
public class App {
    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.add(new Flower("purple"));
        garden.add(new Flower("blue"));
        garden.add(new Tree("purple"));
        garden.add(new Tree("orange"));
        garden.printGarden();
        garden.watering(40);
        garden.printGarden();
        garden.watering(70);
        garden.printGarden();
    }


}
