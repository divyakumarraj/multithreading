class ThreeThreads extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreeThreads t = new ThreeThreads();
        t.setPriority(MAX_PRIORITY);
        ThreeThreads t2 = new ThreeThreads();
        t2.setPriority(MIN_PRIORITY);
        ThreeThreads t3 = new ThreeThreads();
        t3.setPriority(NORM_PRIORITY);
        t.start();
        t2.start();
        t3.start();
    }
}
