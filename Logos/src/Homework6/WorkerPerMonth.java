package Homework6;

public class WorkerPerMonth implements Salary {
	 private static int monthlSalary;

	    public WorkerPerMonth(int monthlySalary) {
	        this.monthlSalary = monthlSalary;
	    }

	    @Override
	    public int getSalary(int number) {
	        return monthlSalary;
	 }
}

