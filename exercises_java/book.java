class Author{
    String name,email;
    char gender;
    public Author(String name,String email,char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public void displayAuthorDetails()
    {
        System.out.println(name+" "+email+" "+gender);
    }
}
 class Book{
    String bname;
    float price;
    int qty;
    Author a;
    public Book(String bname,float price,int qty,Author a)
    {
        this.bname=bname;
        this.price=price;
        this.qty=qty;
        this.a=a;
    }
    public void displayBookInfo()
    {
        System.out.println("Book Name = "+bname);
        System.out.println("Author Name = "+a.name);
        System.out.println("Gender = "+a.gender);
        System.out.println("Price = "+price);
        System.out.println("Quantity = "+qty);
        
    }
}
class WiproProg{
    public static void main(String args[])
    {
        Author a1=new Author("John","john@gmail.com",'M');
        Book b1=new Book("Java Programming",250.0f,150,a1);
        b1.displayBookInfo();
    }
}
