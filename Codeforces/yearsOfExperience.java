import java.util.*; 
public class yearsOfExperience { 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] years = new int[n];
		
		for (int i = 0; i < n; i++) {
		    years[i] = scanner.nextInt();
		}
		
		Arrays.sort(years);

		int entranceYear = years[n / 2];
		
		System.out.println(entranceYear);
    	}
}


