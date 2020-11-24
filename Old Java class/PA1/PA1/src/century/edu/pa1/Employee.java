package century.edu.pa1;

import java.util.Random;

public class Employee {
	
	private String name;
	private int idnumber;
	private int hours;
	public final double FEDERAL_TAX_RATE = 0.2;
	public final double STATE_TAX_RATE = 0.09;
	public final double OVERTIME_RATE = 1.5;
	
	//Blank Constructor
	public Employee() {
		this.name = null;
		this.idnumber = 0;
		this.hours = 0;

	}
	//Constructor
	public Employee(String name, int idnum, int hours) {
		this.name = name;
		this.idnumber = idnum;
		this.hours = hours;

	}
	//All getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(int idnumber) {
		this.idnumber = idnumber;
	}
	
	public double getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	// Computes net pay for one pay period
	public double computeNetpay() {
		
		double payrate = 15.0;
		double netPay;
		double overpay;
		int overhours;
		double salary;
		double federalTax;
		double stateTax;
		
	//Calculates for overtime
		if (hours > 80) {
			overhours = hours - 80;
			overpay = overhours * payrate * OVERTIME_RATE;
			salary = payrate * 80;
			federalTax = (salary + overpay) * FEDERAL_TAX_RATE;
			stateTax = (salary + overpay) * STATE_TAX_RATE;
			netPay = (salary + overpay) - (federalTax + stateTax);
		}
		else {
			salary = payrate * hours;
			federalTax = salary * FEDERAL_TAX_RATE;
			stateTax = salary * STATE_TAX_RATE;
			netPay = salary - (federalTax + stateTax);
		}
		if (netPay == 0) {
			throw new ArithmeticException("Netpay cannot equal 0");
		}
		else {
		return netPay;
		}
	}
	
	//Method to compute yearly salary
	public double yearlySalary() {
        double yearlySalary;
        double payrate = 15.0;
        double salary = hours * payrate;
        yearlySalary = salary * 26;
        if (yearlySalary == 0) {
			throw new ArithmeticException("Netpay cannot equal 0");
		}
		else {
		return yearlySalary;
		}
    }
	//Method to raise the yearly salary by a percentage of one 
    public double yearlySalaryIncrease() {
        double yearlySalaryIncrease;
        yearlySalaryIncrease = (((yearlySalary() * (0.1)) + yearlySalary()));
        return yearlySalaryIncrease;
    }
 
    //Equals method that does nothing
    public boolean equals(Object object) {
        if(object instanceof Employee && ((Employee)object).computeNetpay() == this.computeNetpay()) {
            return true;
        } else {
            return false;
        }
    }
    
	//toString method
    @Override
	public String toString() {
		return "Employee [Name=" + name + ", Id Number=" + idnumber + ", Hours Worked=" + hours + ", Netpay="
				+ computeNetpay() + "]";
	}
   
	
	// Driver Method
	public static void main(String[] args) {
		
		Employee tmpEmployee = new Employee();
		Random random = new Random();
		//for loop to generate all 26 pay periods
		for (int i = 1; i <= 26; i++) {
		
		final int[] HOURS_WORKED = { 89, 80, 19, 73, 44, 99, 77, 0, 80, 70, 80, 87, 84, 82,
						80, 30, 89, 90, 100, 120, 0, 69, 99, 91, 83, 80};
		//Randomly picks an integer from HOURS_WORKED
		int hours = HOURS_WORKED[random.nextInt(HOURS_WORKED.length)];
		
		tmpEmployee.setName("john");
		tmpEmployee.setIdnumber(123);
		tmpEmployee.setHours(hours);
		
		
		System.out.println(tmpEmployee.toString());
		}
		System.out.println("Yearly Salary: " + tmpEmployee.yearlySalary());
		System.out.println("yearly Salary Increase: " + tmpEmployee.yearlySalaryIncrease());
		
	}
	
}