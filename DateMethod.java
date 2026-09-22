public class DateMethod {

	public static void printAmerican(String day, int date, String month, int year) {
		
		System.out.println("American format" + ": " +  day + ", " + month + date + ", " + year);
	
	}
	
	public static void printAmerican(String day, int date, String month, int year) {
		
		System.out.println("European format" + ": " + day + " " + date + " " + month + " " + year);
		
	}
	
	public static void main (String[] args) {
		
		System.out.printAmerican("Tuesday", 22, "September", 2026);
		System.out.printEuropean("Tuesday", 22, "September", 2026);
			
	}

}
