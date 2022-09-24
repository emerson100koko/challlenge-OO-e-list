package entities;

public class taxpayer {

	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;
	private double mont;
	
	public taxpayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpending, double mont) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
		this.mont = mont;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public double getMont() {
		return mont;
	}

	public void setMont(double mont) {
		this.mont = mont;
	}

	public double salaryTax() {
		mont = this.salaryIncome / 12;
		if (mont <= 3000) {
			return this.salaryIncome * 0.00;
		}else if (mont <= 5000) {
			return this.salaryIncome * 0.10;	
		}else {
			return this.salaryIncome * 0.20;
		}
	}
	
	public double servicesTax() {
			return servicesIncome * 0.15;
		}
	
	public double capitalTax() {
			return capitalIncome * 0.20;
		}
	
	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}
	
	public double taxRebate() {
		double deductibleExpense,maxDeductible;
		deductibleExpense = healthSpending + educationSpending;
		maxDeductible = 0.30 * grossTax();
		
		if (deductibleExpense > maxDeductible) {
			return maxDeductible;
		}else {
			return deductibleExpense;
		}
	}
	
	public double netTax() {
		return grossTax() - taxRebate();
	}
}
