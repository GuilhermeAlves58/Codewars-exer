package Codewars_ex.rankUp;

import java.util.ArrayList;
import java.util.List;
public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> resultList = new ArrayList<>();
            for (int value : a) {
                boolean toRemove = false;
                for (int remove : b) {
                    if (value == remove) {
                        toRemove = true;
                        break;
                    }
                }
                if (!toRemove) {
                    resultList.add(value);
                }
            }

            int[] resultArray = new int[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                resultArray[i] = resultList.get(i);
            }

            return resultArray;
        }
    }
