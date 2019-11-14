package Homework6;

public class WorkerPerMonth implements Salary {
	 private final int monthlSalary;

	    public WorkerPerMonth(int monthlySalary) {
	        this.monthlSalary = monthlySalary;
	    }

	    @Override
	    public int getSalary(int number) {
	        return monthlSalary;
	 }
}

