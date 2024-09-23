
public class Main {
	public static void main(String[] args) {
		SalesRep armando = new SalesRep("Armando", "Perez", 3645, 28, 900, 12, 12542.0, 5, 3600);
		SalesRep aline = new SalesRep("Aline", "Lopez", 3625, 29, 800, 16, 12545.0, 4, 3500);
		SalesManager criatura = new SalesManager("Criatura", "Ser", 6666, 325, 222, 15, 32421.5, 32, 5000);
		System.out.println(armando);
		System.out.println("tiempor para retirarse: "+ aline.timeToRetirement());
		System.out.println("tiempo de vacaciones sobrante: " + armando.vacationTimeLeft());
		System.out.println("Bonus: $" + criatura.calculateBonus());
		System.out.println();
		System.err.println("/*/*///*/*/*/*/*/*/*/*/*");
		System.out.println("comision: $" + criatura.calculateComission());
		System.out.println("~~~~~~~~~~~~```````````````~~~~~~~~`~``~~`~");
		
		criatura.addsaleTeam(3645, armando);
		System.out.println("comission total: $" + criatura.calculateComission());
		
		
		
	    }//"string arg"
		
}
