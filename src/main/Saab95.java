import java.awt.*;

public class Saab95 extends Car{

    public boolean turboOn;

    public Saab95(){
        this.setNrDoors(2);
        this.setColor(Color.red);
        this.setEnginePower(125);
        turboOn = false;
        this.setModelName("Saab95");
        stopEngine();
    }

    public void setTurboOn(){
        turboOn = true;
    }

    public void setTurboOff(){
        turboOn = false;
    }

    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
}