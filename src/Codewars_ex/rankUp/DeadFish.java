package Codewars_ex.rankUp;

import java.util.ArrayList;
import java.util.List;

    public class DeadFish {
        public static int[] parse(String data) {
            int value = 0;
            List<Integer> output = new ArrayList<>();

            for (char command : data.toCharArray()) {
                switch (command) {
                    case 'i':
                        value++;
                        break;
                    case 'd':
                        value--;
                        break;
                    case 's':
                        value *= value;
                        break;
                    case 'o':
                        output.add(value);
                        break;
                    // Other characters are ignored
                }
            }

            // Convert List<Integer> to int[]
            return output.stream().mapToInt(i -> i).toArray();
        }

        // Optional main method for testing
        public static void main(String[] args) {
            int[] result1 = parse("iiisdoso"); // Should print [8, 64]
            int[] result2 = parse("iiisdosodddddiso"); // Should print [8, 64, 3600]

            for (int i : result1) {
                System.out.print(i + " ");
            }
            System.out.println();

            for (int i : result2) {
                System.out.print(i + " ");
            }
        }
    }

}
