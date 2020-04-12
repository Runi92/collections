package examples.sets.linkedhashsets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExampler {
    public static void main(String[] args) {
        Set<String> students = new LinkedHashSet<>();
        students.add("Иван");
        students.add("Андрей");
        System.out.println(students);
        students.remove("Андрей");
        System.out.println(students);
    }
}
