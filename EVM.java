
import java.util.Scanner;
class EvmMachine{

    int bjp=0,cg=0,aap=0,other=0;

     public void VotingCounter(int num,Scanner sc){
            for(int i=1;i<=num;i++){
            System.out.print("Enter Your Vote :");
            int vote=sc.nextInt();
            if(vote==1){
                System.out.print("Vote give to BJP");
                bjp++;
            } else if (vote==2) {
                 System.out.print("Vote give to Congress");
                cg++;
                
            }else if(vote==3){
                 System.out.print("Vote give to AAP");
                aap++;
            }else if(vote==4){
                 System.out.print("Vote give to others");
                other++;
            }else{
                System.out.print("NOTA");
               
            }
            System.out.println();
        
        }
        }

       public void displayVotesList(){
         System.out.println("-------------------------Votes List------------------------------------ ");
        System.out.println("BJP : "+bjp);
        System.out.println("CONGRESS: "+cg);
        System.out.println("AAP : "+aap);
        System.out.println("OTHERS: "+other);

       }

        public void countingVotes(){
            System.err.println();
            if(bjp>cg&&bjp>aap&&bjp>other){
            System.out.print("BJP is Winner");
        }else if(cg>bjp&&cg>aap&&cg>other){
            System.out.print("Congress is Winner");
        }else if(aap>cg&&aap>bjp&&aap>other){
                System.out.print("Aam Adami Party is Winner");
        }else if(other>cg&&other>bjp&&other>aap){
             System.out.print("Others is Winner");

        }else{
            System.out.print("All Parties Take equal Votes");
        }   
        }
}

class EVM{
    public static void main(String[] args){
        EvmMachine call=new EvmMachine();
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter number of Voters: ");
        int num=sc.nextInt();

        call.VotingCounter(num, sc);
        call.displayVotesList();
        call.countingVotes();
        
      
       
       

    }

 
}