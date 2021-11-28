class Medical extends Thread
{
    public void run()
    {
        try {
            System.out.println("medical starts");
            Thread.sleep(3000);
            System.out.println("Medical compileted");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class Testdrive extends Thread
{
    public void run(){
        try {
            System.out.println("TEst drive");
            Thread.sleep(5000);
            System.out.println("Testdrive done");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class Signature extends Thread
{
    public void run()
    {
        try {
            System.out.println("Signature needed");
            Thread.sleep(2000);
            System.out.println("SIgnature done");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
public class LicenceDemo {
    public static void main(String[] args) throws InterruptedException {

        Medical m =new Medical();
        m.start();

        m.join();

        Testdrive t=new Testdrive();
        t.start();


        t.join();

        Signature s = new Signature();
        s.start();

    }
}
