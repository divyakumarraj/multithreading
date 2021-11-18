//runnable thread
//multithreading application

public class test44 implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setName("E custom  thread");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class rr
{
    public static void main(String[] args) {
        test44 obj=  new test44();
        Thread obj1= new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("E custom  thread");
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        });
        obj1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}
