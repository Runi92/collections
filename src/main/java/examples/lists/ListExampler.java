package examples.lists;

import examples.sets.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс-пример для работы с List
 * Самостоятельно: проверить работу всех методов из List
 */
public class ListExampler {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        User firstUser = new User("Иван", "Иванов");
        User secondUser = new User("Иван", "Иванов");
        User thirdUser = new User("Петр", "Петров");

        users.add(firstUser);
        users.add(secondUser);
        users.add(thirdUser);

        System.out.println(users.get(2));
        System.out.println(users.indexOf(firstUser));

    }
}
