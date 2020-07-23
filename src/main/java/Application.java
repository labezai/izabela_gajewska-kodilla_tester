public class Application {
    public static void main(String[] args) {

        Person adam = new Person("Adam", 40.5, 178);

        if (adam.name != null) {
            System.out.println("User is older than 30 and higher than 160cm.");
        } else {
            System.out.println("User is younger than 30 and lower than 160cm.");
        }
    }
}