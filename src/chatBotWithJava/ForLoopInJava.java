package chatBotWithJava;

public class ForLoopInJava {
    public static void main(String[]args) {
        int startIncl = 1, endEcl = 11;
        int sum = 0;
        for (int i = startIncl; i < endEcl; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }
}
