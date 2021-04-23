import java.util.*;
class Main
{
    public static void main(String[] args) 
    {
        int count;
        String temp;
        Scanner scan = new Scanner(System.in);
        count = scan.nextInt();
        String str[] = new String[count];
        scan.nextLine();
        for(int i = 0; i < count; i++)
        {
            str[i] = scan.next();
        }
        //for (int i = 0; i < count; i++) 
       // {
             
       // }
        for (int i = count-1; i >=0; i--) 
        {
            System.out.print(str[i] + " ");
        }
    }
}

   