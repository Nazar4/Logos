package Homework7;

import java.util.Random;

public class Su27 extends ManagementOfPlane implements SpecialOpportunities {
    Random random = new Random();

    double d = 0 + Math.random()*10;
    double k = Math.random();

    public int maxSpeed;
    public String color;

    public void type(int maxSpeed, String color){
        this.color = color;
        this.maxSpeed = maxSpeed + 1000;
    }

    @Override
    public void turboNitro() {
        System.out.println(maxSpeed + 300);
    }

    @Override
    public void technologyStealth() {
        System.out.println("Plane is in stealth for " + k);
    }

    @Override
    public void nuclearHit() {
        System.out.println("Plane is using nuclearHit:" + d);
    }


}