import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    while (true){
        try {
            System.out.println("Enter name");
            String name = scanner.nextLine();
            System.out.println("Enter age");
            int age = scanner.nextInt();
            scanner.nextLine();

            User user = new User();
            user.setName(name);
            user.setAge(age);
            System.out.println("User" + user);
        }catch (RuntimeException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
            }
        }
    }
}
