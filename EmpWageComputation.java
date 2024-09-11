class EmpWageComputation {
	public static void main(String[] args) {
		System.out.println("===== WELCOME TO EMPLOYEE WAGE COMPUTATION ======");
		
		int wagePerHour = 20;
        int fullDay = 8;
        
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if(empCheck == 0)
        {
            System.out.print("Employee is Present");
            System.out.println("");
            System.out.print("The daily wage of Employee is : " + ( wagePerHour * fullDay ));
            System.out.println("");
        }
        else
        {
            System.out.print("Employee is Absent");
            System.out.println("");
            System.out.println("The daily wage of Employee is : 0 " );
            System.out.println("");
        }
	}
}
