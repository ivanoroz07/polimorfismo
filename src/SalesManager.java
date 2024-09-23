import java.util.HashMap;

public class SalesManager extends SalesRep {
	HashMap <Integer, SalesRep> salesTeam = new HashMap<>();
	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
		// TODO Auto-generated constructor stub
	}
	
	public double calculateComission() {
	    double totalCommission = 0.0;
	    for (SalesRep salesRep : salesTeam.values()) {
	        totalCommission += salesRep.calculateComission();
	    }
	    return totalCommission * 0.03;
	}
	
	 public void addsaleTeam(int resgistration, SalesRep salesRep) {
	        salesTeam.put(registration, salesRep);
	    }
}
