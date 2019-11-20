package test;
import java.util.Scanner;
public class Book {
	private String title;
	private String author;
	private int page;
	private double price;
	public Book(){
		this.title="";
		this.author="";
	}
	public void Book(String title,String author,int page,double price ) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setPage(page);
		this.setPrice(price);
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getauthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public int getPage() {
		return this.page;
	}
	public void setPage(int page) {
		this.page=page;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("title:");
		this.setTitle(kb.nextLine());
		System.out.println("author:");
		this.setAuthor(kb.nextLine());
		System.out.println("page:");
		this.setPage(kb.nextInt());
		System.out.println("price:");
		this.setPrice(kb.nextDouble());
		System.out.println(toString());
		System.out.println("how much discount?\n");
		updatePrice(1-kb.nextDouble());
		System.out.println("Apter update "+toString());
	}
	public void updatePrice(double rate) {
		this.price=this.price*rate;
		/*double k;
		Scanner kb=new Scanner(System.in);
		System.out.println("how much discount?\n"+rate);
		k=(this.getPrice()-(this.getPrice()*rate))*10;
		System.out.println("after the books information:Book{ title="+this.getTitle()+","+"author="+this.getauthor()+","+"pages"+this.getPage()+","+"price:"+k+"}");*/
	}
	public String toString() {
		String string = "the books information:Book{ title="+this.getTitle()+","+"author="+this.getauthor()+","+"pages"+this.getPage()+","+"price:"+this.getPrice()+"}";
		return string;
	}
	
		
	public static void main(String[] args) {
		Book b=new Book();
		b.input();
	}
}
