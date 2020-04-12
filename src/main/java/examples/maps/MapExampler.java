package examples.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс-пример для работы с Map
 * Самостоятельно: проверить работу всех методов из Map
 */
public class MapExampler {
    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();
        users.put(3, "Иван");
        users.put(1, "Петр");
        users.put(0, "Катя");
        System.out.println(users);

        System.out.println(users.get(2));

        users.remove(1);

        System.out.println(users);

    }
}
