import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListOfStringUsingLengthOfString {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Onkar");
        list.add("Onkr");
        list.add("Oar");
        list.add("Or");

        Comparator<String> com = new Comparator<String>() {

            public int compare(String i, String j) {
                if (i.length() > j.length()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(list, com);
        System.out.println(list);
    }
}
