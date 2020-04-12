package examples.sets.hashsets;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HashSetExampler {
    public static void main(String[] args) {
        Set<String> students = new HashSet<>();
        students.add("Иван");
        students.add("Андрей");
        System.out.println(students);

        System.out.println(students.size());

        if (students.contains("Иван")) {
            System.out.println("Иван в группе");
        }

        if (!students.contains("Петя")) {
            System.out.println("Петя не в группе");
        }

        for (String student : students) {
            System.out.println(student);
        }
    }

    /**
     * Метод исключающий одинаковые элементы из коллекции
     */
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
