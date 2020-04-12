package examples.sets;

public class User {
    private String name;
    private String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public boolean equals(Object object) {
        User user = (User) object;
        String currentFullName = this.name + " " + this.surname;
        String comparFullName = user.name + " " + user.surname;
        return currentFullName.equals(comparFullName);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public String toString() {
        return this.name + " " + this.surname;
    }
}
