import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("Daniil");
        strings.add("Artemiy");
        strings.add("Ivan");
        strings.add("Maxim");
        strings.add("Sergey");
        List<String> stringList = new ArrayList<>();
        stringList.add("Tatsiana");
        stringList.add("Svetlana");
        stringList.add("Valentina");
        strings.addAll(stringList);
        strings.BubbleSort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < strings.getSize(); i++) {
            System.out.println(strings.get(i));
        }

    }
}