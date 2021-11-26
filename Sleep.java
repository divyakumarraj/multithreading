public class Sleep {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i <= 5; i++) {
            //try{
                Thread.sleep(2000);
                System.out.println(i);
            //}
//            catch (Exception e)
//            {
//                System.out.println(e);
//            }
        }
    }
}
