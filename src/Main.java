import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static String[] array = { "ABCDE", "ABCD", "ABCE", "ABDE", "ACDE", "BCDE", "ABC", "ABD", "ABE", "ACD", "ACE",
            "ADE", "BCD", "BCE", "BDE", "CDE", "AB", "AC", "AD", "AE", "BC", "BD", "BE", "CD", "CE", "DE", "A", "B",
            "C",
            "D", "E" };

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.execute();
    }

    public void execute() {
        Scanner sc = new Scanner(System.in);
        Optional.ofNullable(sc).orElseThrow();

        String s = sc.nextLine();
        String[] firstLineArray = s.split(" ");
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', Integer.parseInt(firstLineArray[0]));
        map.put('B', Integer.parseInt(firstLineArray[1]));
        map.put('C', Integer.parseInt(firstLineArray[2]));
        map.put('D', Integer.parseInt(firstLineArray[3]));
        map.put('E', Integer.parseInt(firstLineArray[4]));

        List<InnterResult> list = new ArrayList<>();
        for (String string : array) {
            Integer sum = 0;
            for (Character c : string.toCharArray()) {
                sum += map.get(c);
            }
            InnterResult innterResult = new InnterResult();
            innterResult.setName(string);
            innterResult.setSum(sum);
            list.add(innterResult);
        }
        List<InnterResult> resultList = list.stream()
                .sorted(Comparator.comparing(InnterResult::getSum).reversed().thenComparing(InnterResult::getName))
                .collect(Collectors.toList());
        resultList.forEach(t -> System.out.println(t.getName()));

    }

    private class InnterResult {
        private String name;
        private Integer sum;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getSum() {
            return sum;
        }

        public void setSum(Integer sum) {
            this.sum = sum;
        }

    }

}
