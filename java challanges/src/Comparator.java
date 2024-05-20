import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Comparator {
    public static void main (String[] args) {
        List<String> list = Arrays.asList("Bear", "Lion", "Zebra", "Ant");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);
    }

//    public static void sortInDescending(List<String> stringList) {
//        Collections.sort(stringList);
//        Collections.reverse(stringList);
//    }

    // Using custom comparator
    public static void sortInDescending(List<String> stringList) {
        Collections.sort(stringList, new java.util.Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                //condition is, if first latter is small then return will -1
                // second is, if second latter is big then return will be +1
                // third is, if equals then return will be 0.
                if (a.equals(b)) {
                    return 0;
                } else if (a.charAt(0) < b.charAt(0)) {
                    return 1; // +1 is because of reversing
                } else {
                 return -1;
                }
            }
        });
    }
}
