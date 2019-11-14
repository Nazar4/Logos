package Homework7;

import java.util.Random;

public abstract class Plane {

    Random random = new Random();

    public double width;
    public double lenght;
    public double weight;

    int a = (int) (Math.random()*(88+1)) + 20;
    double b = 0 + Math.random()*1000;

    public void size(double weight, double width, double lenght){
        this.weight = weight;
        this.width = width;
        this.lenght = lenght;
    }

    void startUpEngines(int t){
        System.out.println(t);
    }

    void planeTakeoff(double b){
        System.out.println(b);
    }

    void planeBoarding(){
        System.out.println("Plane is going to land");
    }


}