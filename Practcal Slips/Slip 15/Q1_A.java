// Write a java program to display each alphabet after 2 seconds between ‘a’ to ‘z’.

public class Q1_A{
    public static void main(String[] args) {
        try {
            for(char i = 'a'; i <= 'z'; i++) {
                System.out.println(i);
                Thread.sleep(2000);
            }
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}