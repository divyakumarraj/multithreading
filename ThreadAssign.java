public class ThreadAssign {
    public static void main(String[] args) {
        Thread t = new Thread("scooby"){
            public void run(){
                System.out.println(Thread.currentThread().getName());
            }
        };
        Thread t2 = new Thread("Shaggy"){
            public void run(){
                System.out.println(Thread.currentThread().getName());
            }
            
            
        };
        t.start();
        t2.start();
    }
}
