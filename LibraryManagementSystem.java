
import java.util.ArrayList;
import java.util.Scanner;

class Book{
    private int bookId;
    private String name;
    private String author;
    private double price;
    private boolean isIssued;
    //Getter
    public int getBookId(){
        return bookId;
    }
    public String getBookName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
     public boolean getIsIssued(){
        return isIssued;
    }
    
    //Setter 
     public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setIsIssued(boolean isIssued) {
        this.isIssued = isIssued;
    }
    public Book(String name,String author,double price,int bookId){
        this.name=name;
        this.author=author;
        this.price=price;
        this.bookId=bookId;
        this.isIssued=false;
    }
   public void displayBook(){
        System.out.println("Book ID: "+getBookId());
        System.out.println("Book Name: "+getBookName());
        System.out.println("Book Price: "+getPrice());
        System.out.println("Book Author: "+getAuthor());
    //    if(getIsIssued()){
    //     System.out.println("Status Issued");
    //    }else{
    //     System.out.println("status Available");
    //    }
       System.out.println("--------------------------------------------------------------------------------------------------------------");

    }
}
/*--------------------------------------------------------Library Class ---------------------------------------------------------------------------*/
class Library{
    Scanner sc=new Scanner(System.in);
    ArrayList<Book> books=new ArrayList<>();

    public void addBook(){
        System.out.print("Enter Book ID: ");
        int bookId=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Author Name: ");
        String authorName=sc.nextLine();
        System.out.print("Enter Book Price: ");
        double price=sc.nextDouble();
       Book book=new Book(name, authorName, price, bookId);
       books.add(book);
       System.out.println("Book Added Successfully.");

    }
    public void showAllBooks(){
        if(books.isEmpty()){
            System.out.println("No Books Available.");
            return;
        
            ///Exit from function
        }else{
          for(Book book:books){
            book.displayBook();
          }
        }  
    }

    public void searchBook(){
        System.out.println("Enter Book ID: ");
        int Id=sc.nextInt();
        boolean found=false;
        for(Book book : books){
            if(book.getBookId()==Id){
                book.displayBook();
                found=true;
                break;

            }
        }
        if(!found){
            System.out.println("Book Not Found. ");
        }

    }

   public void issueBook(){
        System.out.println("Enter Book ID: ");
        int ID=sc.nextInt();
        boolean found=false;
        for(Book book:books){
            if(book.getBookId()==ID){
                found=true;
                book.setIsIssued(true);
                System.out.println("Book Issued SuccessFully. ");
            }else{
                System.out.println("Book Is Already Issued. ");
            }
            break;
        }
        if(!found){
            System.out.println("Book Not Found.");
        }
    };
    public void returnBook(){
        System.out.print("Enter Book ID: ");
        int id=sc.nextInt();
        boolean found=false;
        for(Book book:books){
            if(book.getBookId()==id){
                found=true;
                if(book.getIsIssued()){
                    book.setIsIssued(false);
                    System.out.println("Book Returned Successfully. ");
                }else{
                    System.out.println("Book is Already Available. ");
                }
                break;

            }
            if(!found){
                System.out.println("Book Not Found. ");
            }
        }
    };
    public void deleteBook(){
        System.out.println("Enter Book ID: ");
         int id=sc.nextInt();
         boolean found=false;
         for(int i=0;i<books.size();i++){
            if(books.get(i).getBookId()==id){
                books.remove(i);
                found=true;
                System.out.println("Book Deleted SuccessFully. ");
                break;
            }

         }
         if(!found){
            System.out.println("Book Not Found");
         }
    }
}
public class LibraryManagementSystem{
   
   
    public static void main(String[] args){
        Library library=new Library();
      Scanner sc=new Scanner(System.in);
      Book book=new Book("Tell a lie", "Jaswinder", 500,1);
      library.books.add(book);
    
       int choice;
      do {   
    System.out.println("==============================================================================================");
    System.out.println("                                  LIBRARY MANAGEMENT SYSTEM                                  ");
    System.out.println("==============================================================================================");
    System.out.println("1. Add Book\n2. Show All Books\n3. Search Book\n4. Issue book\n5. Return Book\n6. Delete Book\n7. Exit");
    System.out.print("Enter Your Choice: ");
     choice=sc.nextInt();
     switch (choice) {
             case 1:library.addBook();
             break;
             case 2:library.showAllBooks();
             break;
             case 3:library.searchBook();
             break;
             case 4:library.issueBook();
             break;
             case 5:library.returnBook();
             break;
             case 6:library.deleteBook();
             break;
             case 7:System.out.print("Thankyou!");
             break;

         default:
             System.out.println("Invalid Choice");
     }
          
      } while (choice!=7);

 
    

    }
  

}
