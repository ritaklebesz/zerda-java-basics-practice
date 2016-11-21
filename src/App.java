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
        System.out.println(garden.toString());
        System.out.println("Watering with 40");
        garden.watering(40);
        System.out.println(garden.toString());
        System.out.println("Watering with 70");
        garden.watering(70);
        System.out.println(garden.toString());
    }


}
