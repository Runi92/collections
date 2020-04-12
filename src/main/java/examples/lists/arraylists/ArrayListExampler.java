package examples.lists.arraylists;


import java.util.ArrayList;

public class ArrayListExampler {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<>();
        users.add("Ваня");
        users.add("Петя");
        users.add("Коля");

        System.out.println(users);

        System.out.println(users.get(2));

        System.out.println(users.indexOf("Ваня"));

        System.out.println(users.size());
    }
}
