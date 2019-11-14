package Homework6;

public class Application {

    public static void main(String[] args) {
        WorkerPerMonth workerPerMonth = new WorkerPerMonth(31);
        WorkerPerHour workerPerHour = new WorkerPerHour(223);
        System.out.println(workerPerHour.getSalary(10));
        System.out.println(workerPerMonth.getSalary(98));

    }
}
