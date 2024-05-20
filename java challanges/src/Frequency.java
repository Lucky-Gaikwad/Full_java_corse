import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,4,56,7,8,8);
        System.out.println(Collections.frequency(list, 1));
        System.out.println(Collections.frequency(list,8));
    }
}
