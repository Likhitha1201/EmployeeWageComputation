class EmpWageComputation {
	// Method to calculate daily wage and total wage
	public static void calculateWage(int daysWorked, int dailyWage) {
		Map<Integer, Integer> dayWageMap = new HashMap<>();
		int totalWage = 0;

		// Store day and wage for each day
		for (int day = 1; day <= daysWorked; day++) {
			dayWageMap.put(day, dailyWage);
			totalWage += dailyWage;
		}

		// Display daily wage and total wage
		System.out.println("Day\tDaily Wage");
		for (Map.Entry<Integer, Integer> entry : dayWageMap.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}

		System.out.println("Total Wage: " + totalWage);
	}
	public static void main(String[] args) {
		System.out.println("===== WELCOME TO EMPLOYEE WAGE COMPUTATION ======");
		System.out.println("");
		// Example: 5 days worked with a daily wage of 100
		int daysWorked = 5;
		int dailyWage = 100;

		calculateWage(daysWorked, dailyWage);
	}
}
