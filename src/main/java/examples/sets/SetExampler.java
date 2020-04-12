package examples.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * Класс-пример для работы с Set
 * Самостоятельно: проверить работу всех методов из Set
 */
public class SetExampler {
    public static void main(String[] args) {
        Set<User> someSet = new HashSet();
        User firstUser = new User("Иван", "Иванов");
        User secondUser = new User("Петр", "Петров");
        User thirdUser = new User("Андрей", "Андреев");
        someSet.add(firstUser);
        someSet.add(secondUser);
        someSet.add(thirdUser);
        for (int i = 0; i < 100; i++) {
            System.out.println(someSet.toString());
        }
    }
}
