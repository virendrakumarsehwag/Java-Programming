import java.util.*;

public class form3 {

    public static void main(String[] args) {
        int[] input1 = {5,123,12,45,62,77,89,23,12,14,11,14,12,90,89,12};
        int input2 = 16;
        String password = generatePassword(input1, input2);
        System.out.println("Password: " + password);
    }

    public static String generatePassword(int[] array, int size) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int leastOccurring = Integer.MAX_VALUE;
        int secondHighestOccurring = Integer.MIN_VALUE;
        int highestOccurring = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();

            if (frequency < leastOccurring) {
                leastOccurring = frequency;
            }

            if (frequency > highestOccurring) {
                secondHighestOccurring = highestOccurring;
                highestOccurring = frequency;
            } else if (frequency > secondHighestOccurring && frequency < highestOccurring) {
                secondHighestOccurring = frequency;
            }
        }

        int part1 = Integer.MAX_VALUE;
        int part2 = Integer.MIN_VALUE;
        int part3 = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();

            if (frequency == leastOccurring && num < part1) {
                part1 = num;
            }

            if (frequency == secondHighestOccurring && num > part2) {
                part2 = num;
            }

            if (frequency == highestOccurring) {
                part3 = num;
            }
        }

        return String.valueOf(part1) + String.valueOf(part2) + String.valueOf(part3);
    }
}