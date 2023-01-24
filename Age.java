import java.util.Scanner;

public class Age
{
    public static void main(String arg[]) 
    {
     
        Scanner sc =new Scanner (System.in);
        int n, age = 0, child = 0, teen = 0, youth=0, old=0;
        System.out.println("Enter no of persons : ");
        n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            System.out.println("Enter your age : ");
            age = sc.nextInt();
            
            if(age<14){
                child++;
            }
            else if (age<20){
                teen++;
            }

            else if (age<40)
            {
                youth++;
            }
            else{
                old++;
            }
        }
        System.out.println("Total No of Child : "+child);
        System.out.println("Total No of Teen : "+teen);
        System.out.println("Total No of youth : "+youth);
        System.out.println("Total No of old : "+old);
    }
}
