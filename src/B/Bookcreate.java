package B;

import java.util.Scanner;
import java.util.ArrayList;

public class Bookcreate {   //链表实现

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String booknumber;
		int i;
		BookProperty Book;
		ArrayList<String> bookNum=new ArrayList<String>();
		ArrayList<BookProperty> BP=new ArrayList<BookProperty>();
		System.out.println("输入书的编号、书名、单价、出版社，以#标志结束输入：");
		while(!input.hasNext("#")) //输入一系列书的信息，以#标志输入结束
		{
			booknumber=input.next();
			bookNum.add(booknumber);
			Book=new BookProperty();
			Book.setname(input.next());
			Book.setsingleprice(input.nextDouble());
			Book.setpublishhouse(input.next());
			BP.add(Book);
		}
		for (i=1;i<=bookNum.size();i++)
		{
			System.out.print("这是第"+i+"本书: "+"编号： "+bookNum.get(i-1));
			System.out.println(" 书名： "+BP.get(i-1).getname()+"  "+"单价："+BP.get(i-1).getsingleprice()+"  "+"出版商： "+BP.get(i-1).getpublishhouse());
		}

	}

}
