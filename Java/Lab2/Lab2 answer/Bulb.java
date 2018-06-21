package ch5_pp;

public class Bulb {
    private boolean power;

    public Bulb(boolean light){
        power = light;
    }

    public void turnOn(){
        power = true;
    }

    public void turnOff(){
        power = false;
    }

    public String getPower(){
        if(power){
            return "On";
        }
        else{
            return "Off";
        }
    }
}
