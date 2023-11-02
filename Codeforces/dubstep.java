import java.util.*; 
public class dubstep  
{ 
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dubstepRemix = scanner.nextLine();
        
        String[] words = dubstepRemix.split("WUB");
        ArrayList<String> originalWords = new ArrayList<>();
        
        for (String word : words) {
            if (!word.isEmpty()) {
                originalWords.add(word);
            }
        }
        
        String originalSong = String.join(" ", originalWords);
        System.out.println(originalSong);
    }
}
