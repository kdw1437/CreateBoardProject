package argsTest;

public class ArgsTest {
    public static void main(String[] args) {
        // Check if any arguments are passed
        if (args.length > 0) {
            System.out.println("프로그램에 Argument가 들어감:");
            
            // Process each argument
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i+1) + ": " + args[i]);
            }
        } else {
            System.out.println("Argument가 프로그램에 들어가지 않음");
        }
    }
}
