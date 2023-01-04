package chatBotWithJava;

public class NestedLoop {
    public static void main(String[]args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            for (int j = 1; j < 10; j++) {
                //System.out.println("j = " + j);
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
