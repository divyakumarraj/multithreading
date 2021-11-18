public class Myexp extends Thread{
    public void run()
    {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("MY threaad "+i);
//        }
        System.out.println(10/0);
    }
}
class Test56
{
    public static void main(String[] args){
        Myexp obj = new Myexp();
  //      Thread obj1 = new Myexp();
        obj.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread "+i);
        }
    }
}
