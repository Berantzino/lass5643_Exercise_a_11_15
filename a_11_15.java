import java.util.*;

public class a_11_15 {

    /*
    15. Write a method maxOccurrences that accepts a list of integers as a parameter and returns the number of times the
    most frequently occurring integer (the “mode”) occurs in the list. Solve this problem using a map as auxiliary storage.
    If the list is empty, return 0.
     */

    public static void main(String[] args) {

        List<Integer> testList = new LinkedList<>();

        testList.add(1);
        testList.add(1);
        testList.add(2);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(4);
        testList.add(4);
        testList.add(5);

        System.out.println("Result should be 3: " + maxOccurrences(testList));


    }

    public static int maxOccurrences(List<Integer> list) {

        // creates the map needed for storage
        Map<Integer, Integer> countMap = new HashMap<>();

        // creates the iterator for the list
        Iterator<Integer> iter = list.iterator();

        // runs as long as the iteration has more elements
        while (iter.hasNext()) {

            int element = iter.next();

            if (countMap.containsKey(element)) {

                countMap.put(element, countMap.get(element) + 1);
            } else {

                countMap.put(element, 1);
            }
        }

        // create a set that contains the keys from countMap
        Set<Integer> setOfKeys = countMap.keySet();

        // Creates the iterator for the setOfKeys
        Iterator<Integer> iter2 = setOfKeys.iterator();

        // initializes the int to return
        int maxOccurrences = 0;

        // runs as long as the iteration has more elements
        while (iter2.hasNext()) {

            // Sets the current element in the iterator to the countMapKey
            int countMapKey = iter2.next();

            // if the value of the key is bigger than maxOccurrences it replaces it with the value
            if (countMap.get(countMapKey) > maxOccurrences) {

                maxOccurrences = countMap.get(countMapKey);
            }
        }

        return maxOccurrences;
    }
}
