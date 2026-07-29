import java.util.Scanner;
class Find_WeekNameByNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number from 1 to 7: ");
        int a=sc.nextInt();
        if(a>0&&a<=7){
            switch(a){
                case 1:System.out.print("Monday");
                break;
                case 2:System.out.print("Tuesday");
                break;
                case 3:System.out.print("Wednesday");
                break;
                case 4:System.out.print("Thursday");
                break;
                case 5:System.out.print("Friday");
                break;
                case 6:System.out.print("Saturday");
                break;
                case 7:System.out.print("Sunday");
                break;

            }
            }else{
                System.out.print("Invaild Number");
            }
            sc.close();
        }
    }
