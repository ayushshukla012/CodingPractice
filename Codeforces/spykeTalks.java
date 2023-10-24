import java.util.*; 
public class spykeTalks
{ 
    public static void main(String[] args)  
    {
          Scanner input=new Scanner(System.in); 
          int secratory=input.nextInt();
          int counter = 0;
          Map<Integer, Integer> numberOfMap = new HashMap<>();
          
          
	  for (int i = 0; i < secratory; i++) {
		int spykeCalls = input.nextInt();
		if (numberOfMap.containsKey(spykeCalls)) {
			int count = numberOfMap.get(spykeCalls);
			numberOfMap.put(spykeCalls,count+1);
		} else {
			numberOfMap.put(spykeCalls,1);
		}
	  }
	  
	  
        for (Map.Entry<Integer, Integer> entry : numberOfMap.entrySet()) {
            int value = entry.getValue();
            if (value == 2) {
                counter += (value * (value - 1)) / 2;
            } else if (value >= 3) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(counter);

        input.close(); 
     }
}
