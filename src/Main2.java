import java.util.Optional;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Optional.ofNullable(sc).orElseThrow();

        String s = sc.nextLine();
        String[] firstLineArray = s.split(" ");

        int contestInt = Integer.parseInt(firstLineArray[0]);
        int currentRate = Integer.parseInt(firstLineArray[1]);

        for (int i = 0; i < contestInt; i++) {
            s = sc.nextLine();
            String[] currentLineArray = s.split(" ");
            int div = Integer.parseInt(currentLineArray[0]);
            int addRate = Integer.parseInt(currentLineArray[1]);

            if (div == 1 && (1600 <= currentRate && currentRate <= 2799)) {
                currentRate += addRate;
            } else if (div == 2 && (1200 <= currentRate && currentRate <= 2399)) {
                currentRate += addRate;
            }
        }
        System.out.println(currentRate);
    }

}
