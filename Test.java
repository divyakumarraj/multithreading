public class Test {
    public static void main(String[] args) {
        Thread obj =Thread.currentThread();
        obj.setName("dp");
        System.out.println(obj.isAlive());//is running state so print the value true otherwise false
        System.out.println(obj.getName());//get the name of thread
        System.out.println(obj.isDaemon());//background thread is daemon thread
        obj.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj.getId());
        System.out.println(obj.getPriority());//get the priority of the thread which is fixed
        System.out.println(obj.getState());//find the state means thread life cycle
        System.out.println(obj.getStackTrace());
      //  System.out.println(10/0);
    }
}
