import java.util.Scanner;

public class validasi_rumus {
    public static void main(String[] args) {
        StackGeneric<String> stack = new StackGeneric<>(12);
        String input = "f(x)=(x-3)(x+9)";
        Scanner inp = new Scanner(input);

        inp.useDelimiter("");

        for (int i = 0; i < 12; i++) {
            String Char = inp.next();
            if(Char.equals("(")) {
                stack.push("(");
            } else if (Char.equals(")")) {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            System.out.println("VALID");
        } else {
            System.out.println("TIDAK VALID");
        }
    }

}

