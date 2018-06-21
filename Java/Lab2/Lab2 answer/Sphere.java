package ch5_pp;

public class Sphere {
    private double diameter, volume, area;
    //private final double PI = 3.141592;

    public Sphere(double diameter){
        this.diameter = diameter;
    }

    public void formula(){
        double radius;
        radius = diameter / 2;
        volume =  Math.PI * Math.pow(radius, 3) * 4/3;
        area = 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString(){

        return "Volume is : " + volume + "\nArea is : " + area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
