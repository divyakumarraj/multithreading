public class NumberDelay {
    public static void main(String[] args) {

        for(int i = 1; i <=10; i++) {
            if (i==6)
            try {
                Thread.sleep(5000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);

        }
    }
}
