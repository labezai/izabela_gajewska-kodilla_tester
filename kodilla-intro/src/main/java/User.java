public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }
    public String getUserNames() {
        return this.name;
    }
    public int getUserAge() {
        return this.age;
    }
    public static void main(String[] args) {
        User zosia = new User("Zosia", 15);
        User kasia = new User("Kasia", 60);
        User ola = new User("Ola", 90);
        User magda = new User("Magda", 2);
        User kamila = new User("Kamila", 8);
        User laura = new User("Laura", 120);

        User[] users = {zosia, kasia, ola, magda, kamila, laura};
        int sum = 0;
        int average = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].getUserAge();
        }
        average = sum / users.length;
        for (int i = 0; i < users.length; i++) {
            if (average > users[i].age) {
                System.out.println("User named: " + users[i].getUserNames() + " is younger than age average.");
            }
        }
    }
}

