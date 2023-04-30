import java.util.*;

public class Quiz2 {

	public static void main(String[] a) {

		// Part A: Retirement planning
		// test case 1
		double pensionTarget = 240000;
		double currentSaving = 0;
		double annualSalary = 40000;
		double monthlySaving = 0.1;
		double interestRate = 0.04;

		PensionPlanner fp = new PensionPlanner(pensionTarget, currentSaving,
				annualSalary, monthlySaving, interestRate);

		// // System.out.println("Example: Test case 1 working months: " +
		// // fp.getWorkingMonth());
		// assert fp.getWorkingMonth() == 368 : "Failed test case 1";

		// // test case 2
		// // System.out.println(fp.getCurrentSaving());
		// fp.setPensionTarget(500000);
		// fp.setAnnualSalary(40000);
		// fp.setMonthlySaving(0.2);
		// assert fp.getWorkingMonth() == 377 : "Failed test case 2";

		// // test case 3
		// fp.setPensionTarget(500000);
		// fp.setAnnualSalary(80000);
		// fp.setMonthlySaving(0.15);
		// assert fp.getWorkingMonth() == 295 : "Failed test case 3";

		// Part B: Saving with a raise
		// test case 4
		double semiAnnualRaise = 0.03;
		fp.setPensionTarget(240000);
		fp.setAnnualSalary(40000);
		fp.setMonthlySaving(0.1);
		fp.setSemiAnnualRaise(semiAnnualRaise);
		assert fp.getWorkingMonth() == 255 : "Failed test case 4";

		// test case 5
		fp.setPensionTarget(500000);
		fp.setAnnualSalary(40000);
		fp.setMonthlySaving(0.2);
		fp.setSemiAnnualRaise(0.06);
		assert fp.getWorkingMonth() == 199 : "Failed test case 5";
		// test case 6
		fp.setPensionTarget(500000);
		fp.setAnnualSalary(80000);
		fp.setMonthlySaving(0.15);
		fp.setSemiAnnualRaise(0.05);
		assert fp.getWorkingMonth() == 179 : "Failed test case 6";
	}
}
