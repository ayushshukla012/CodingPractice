import java.util.Scanner;

public class queueAtTheSchool {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int queueLength = input.nextInt();
        int timeSteps = input.nextInt();
        String queue = input.next();

        String result = calculateQueueAfterTime(queue, timeSteps);
        System.out.println(result);
        input.close();
    }

    public static String calculateQueueAfterTime(String queue, int timeSteps) {
        char[] queueArray = queue.toCharArray();
        int queueLength = queueArray.length;

        for (int t = 0; t < timeSteps; t++) {
            for (int i = 0; i < queueLength - 1; i++) {
                if (queueArray[i] == 'B' && queueArray[i + 1] == 'G') {
                    queueArray[i] = 'G';
                    queueArray[i + 1] = 'B';
                    i++;
                }
            }
        }

        return new String(queueArray);
    }
}

