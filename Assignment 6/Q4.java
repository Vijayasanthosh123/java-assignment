import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;

        while (i <= 3) {
            System.out.print("Enter password: ");
            String p = s.nextLine();

            if (p.equals("1234")) {
                System.out.println("Login Successful");
                break;
            }

            System.out.println("Invalid Password");
            i++;
        }
        s.close();
    }
}
