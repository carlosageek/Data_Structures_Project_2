package p1;

public class Main {

    public static void main(String[] args) {
        new Method1();
        sleep();
        new Method2();
        sleep();
        new Method3();
    }
    private static void sleep(){
        try {
            Thread.sleep(500);                 //1000 milliseconds is one second.
        } catch(InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
