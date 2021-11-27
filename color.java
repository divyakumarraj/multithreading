import java.util.Random;

public class color {
    public static void main(String[] args) {
        String s[] = {"blue","black","green","white","red"};
        int a;
        Random obj = new Random();
        for (var i = 0; i <s.length ; i++)
        {
            a= obj.nextInt(5);
            if(s[i].equals("red"))
            {
                break;
            }
            else
            {
                switch (a)
                {
                    case 1:
                        System.out.println(s[i]);
                    case 2:
                        System.out.println(s[i]);
                }
            }
        }

    }
}
