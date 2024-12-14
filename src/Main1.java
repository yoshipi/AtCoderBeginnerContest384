import java.util.Optional;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Optional.ofNullable(sc).orElseThrow();

        String s = sc.nextLine();
        String[] splitResult = s.split(" ");

        s = sc.nextLine();
        char[] secondLineArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : secondLineArray) {
            if (c != splitResult[1].charAt(0)) {
                sb.append(splitResult[2]);
            } else {
                sb.append(c);
            }

        }
        System.out.println(sb.toString());
    }
}
