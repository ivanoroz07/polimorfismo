
public class SalesRep extends Employee{
	double salesMade;
	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		// TODO Auto-generated constructor stub
		this.salesMade = salesMade;
	}

	   public double calculateComission(){
		      return 0.1*salesMade;
		   }

	@Override
	public String toString() {
		return "SalesRep [salesMade=" + salesMade + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", registration=" + registration + ", age=" + age + ", daysWorked=" + daysWorked
				+ ", vacationDaysTaken=" + vacationDaysTaken + ", salary=" + salary + ", yearsWorked=" + yearsWorked
				+ "]";
	}
	
	
}
