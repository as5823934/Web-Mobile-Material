package ch5_pp;

public class Box {
    private double height, width, depth;
    private boolean full;

    public Box(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
        full = false;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    @Override
    public String toString (){
        return "You have a box " + height + " x " + width + " x " + height;
    }

}
