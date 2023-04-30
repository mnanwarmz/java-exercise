import java.util.*;

public class PensionPlanner {
	private double pensionTarget;
	private double currentSaving;
	private double annualSalary;
	private double monthlySaving;
	private double interestRate;
	private double semiAnnualRaise = 0.03;

	public PensionPlanner(double pensionTarget, double currentSaving, double annualSalary,
			double monthlySaving, double interestRate) {
		this.pensionTarget = pensionTarget;
		this.currentSaving = currentSaving;
		this.annualSalary = annualSalary;
		this.monthlySaving = monthlySaving;
		this.interestRate = interestRate;
	}

	public int getWorkingMonth() {
		double monthlyInterestRate = interestRate / 12;
		double monthlyIncome = annualSalary / 12;
		double monthlyContribution = monthlyIncome * monthlySaving;
		int months = 0;
		currentSaving = 0;
		while (currentSaving < pensionTarget) {
			months++;
			System.out.println("Monthly Income :" + monthlyIncome);
			System.out.println("Raise :" + monthlyIncome * semiAnnualRaise);
			if (months > 0) {
				if (months % 6 == 0) {
					monthlyIncome += monthlyIncome * semiAnnualRaise;
					monthlyContribution = monthlyIncome * monthlySaving;
				}
			}
			currentSaving += currentSaving * monthlyInterestRate;
			currentSaving += monthlyContribution;
			System.out.println("Months :" + months);
			System.out.println("Current Saving" + currentSaving);
		}
		return months;
	}

	public double getSemiAnnualRaise() {
		return semiAnnualRaise;
	}

	public void setSemiAnnualRaise(double semiAnnualRaise) {
		this.semiAnnualRaise = semiAnnualRaise;
	}

	public double getPensionTarget() {
		return pensionTarget;
	}

	public void setPensionTarget(double pensionTarget) {
		this.pensionTarget = pensionTarget;
	}

	public double getCurrentSaving() {
		return currentSaving;
	}

	public void setCurrentSaving(double currentSaving) {
		this.currentSaving = currentSaving;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double getMonthlySaving() {
		return monthlySaving;
	}

	public void setMonthlySaving(double monthlySaving) {
		this.monthlySaving = monthlySaving;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}