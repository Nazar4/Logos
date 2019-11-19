package Homework7;

public abstract class Plane {

    int a = (int) (Math.random()*(88+1)) + 20;
    double b = 0 + Math.random()*1000;

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