import java.util.ArrayList;
import java.util.List;

class Book{
	
	
	int id;
	String name,author,publisher;
	int quantity;
	
	
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
	
}


public class ListIterator {

	public static void main(String[] args) {
		
		List<Book> list=new ArrayList<Book>();
		
		Book b1=new Book(11,"c","hs","cc",9);
		Book b2=new Book(12,"c++","cs","ccccccc",11);
		Book b3=new Book(13,"java","rs","ccccccccccc",	19);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for(Book b:list) {
			System.out.println(b.id+ "\t" + b.name+ "\t" + b.author+ "\t" + b.publisher+ "\t" + b.quantity);
		}

	}

}
