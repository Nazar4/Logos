package Homework7;

public class Su27 extends ManagementOfPlane implements SpecialOpportunities {

    double d = 0 + Math.random()*10;
    double k = Math.random();

    public int maxSpeed;

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