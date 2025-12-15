import java.util.Scanner;
public class Politics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tvk=0,dmk=0,admk=0,bjp=0;
        int vote;
        System.out.println("vote for the party");
        System.out.println("1:tvk");
        System.out.println("2:dmk");
        System.out.println("3:admk");
         System.out.println("4:bjp");
         while(true){
            vote=sc.nextInt();
            if(vote==-1){
                break;}
         
         if (vote == 1) 
            {
                tvk++;
            }
        else if (vote == 2) 
            {
                dmk++;
            } 
        else if (vote == 3) 
            {
                admk++;
            } 
        else if (vote == 4) 
            {
                bjp++;
            } 
        else  
            {
                System.out.println("Invalid vote");
            }
        }
        System.out.println("Party A votes: " + tvk);
        System.out.println("Party B votes: " + dmk);
        System.out.println("Party C votes: " + admk);
        System.out.println("Party D votes: " + bjp);

         if (tvk> dmk && tvk > admk && tvk > bjp) {
            System.out.println("TVK Wins");
        } else if (dmk > tvk && dmk>admk && dmk>bjp) {
            System.out.println(" DMK Wins");
        } else if (admk > tvk && admk > dmk && admk > dmk) {
            System.out.println("ADMK Wins");
        } else if (bjp > tvk && bjp > dmk&& bjp > admk) {
            System.out.println(" Wins");
        } else {
            System.out.println("Election Result is a Tie");
        }

        }
    }
    

