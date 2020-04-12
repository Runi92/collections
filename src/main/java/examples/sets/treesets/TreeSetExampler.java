package examples.sets.treesets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExampler {
    public static void main(String[] args) {
        //TODO Реализовать компаратор в обратном алфавитном порядке
        Comparator<String> studentComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                } else if (o1.length() > o2.length()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        Set<String> students = new TreeSet<>(studentComparator);
        students.add("Витя");
        students.add("Андрей");
        students.add("Коля");
        students.add("Батыр");
        students.add("Петя");

        System.out.println(students);

    }
}
