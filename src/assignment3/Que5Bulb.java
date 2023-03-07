package assignment3;
//Sahi hai yaa galat hai humein nahi pata
public class Que5Bulb {
    public static Que5Bulb instance= new Que5Bulb();
    private Que5Bulb(){}
    public static Que5Bulb getInstance(){
        return instance;
    }
    public void LightOn(){
        System.out.println("Light is on");
    }
    public void LightOff(){
        System.out.println("Light is Off");
    }
}


