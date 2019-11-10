package Homework6;

public class WorkerPerHour implements Salary{
	private static int SalaryForHour;

    public WorkerPerHour(int salaryForHour) {
        SalaryForHour = salaryForHour;
    }

@Override
public int getSalary(int numberOfHours) {
    return SalaryForHour * numberOfHours;
    }

}



