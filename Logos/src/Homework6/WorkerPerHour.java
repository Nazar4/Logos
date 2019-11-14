package Homework6;

public class WorkerPerHour implements Salary{
	private final int SalaryForHour;

    public WorkerPerHour(int salaryForHour) {
        SalaryForHour = salaryForHour;
    }

@Override
public int getSalary(int numberOfHours) {
    return SalaryForHour * numberOfHours;
    }

}



