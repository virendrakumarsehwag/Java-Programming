import java.util.Arrays;
import java.util.Scanner;

public class sample33 {

    public static String getTown(String[] peopleNames) {
        Arrays.sort(peopleNames, (s1, s2) -> s1.length() - s2.length());

        String x = peopleNames[0];
        int k = x.length();
        String sub = "";
        while (k != 0) {
            sub = x.substring(0, k);
            boolean flag = true;
            for (int i = 1; i < peopleNames.length; i++) {
                if (!peopleNames[i].toLowerCase().contains(sub.toLowerCase())) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return sub.toLowerCase();
            }
            k--;
        }

        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split(" ");
        scanner.close();

        String result = getTown(names);
        System.out.println(result);
    }
}

