package Homework7;

public class ManagementOfPlane extends Plane{

        double a = Math.random();
        double l = Math.random();
        double n = Math.random();
        double m = Math.random();


        public void movingUp( double a){
            System.out.println(a);
        }

        public void movingDown( double l){
            System.out.println(l);
        }

        public void movingLeft( double n){
            System.out.println(n);
        }

        public void movingRight(double m){
            System.out.println(m);
        }

}