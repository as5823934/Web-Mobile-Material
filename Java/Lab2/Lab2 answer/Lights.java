package ch5_pp;

public class Lights {
    public static void main(String[] args) {
        Bulb my_switch1 = new Bulb(true);
        Bulb my_switch2 = new Bulb(false);

        System.out.println("The light is : " + my_switch1.getPower());
        System.out.println("The light is : " + my_switch2.getPower());
    }
}
