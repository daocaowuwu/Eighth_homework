package B;

import java.util.Scanner;
import java.util.ArrayList;

public class Bookcreate {   //����ʵ��

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String booknumber;
		int i;
		BookProperty Book;
		ArrayList<String> bookNum=new ArrayList<String>();
		ArrayList<BookProperty> BP=new ArrayList<BookProperty>();
		System.out.println("������ı�š����������ۡ������磬��#��־�������룺");
		while(!input.hasNext("#")) //����һϵ�������Ϣ����#��־�������
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
			System.out.print("���ǵ�"+i+"����: "+"��ţ� "+bookNum.get(i-1));
			System.out.println(" ������ "+BP.get(i-1).getname()+"  "+"���ۣ�"+BP.get(i-1).getsingleprice()+"  "+"�����̣� "+BP.get(i-1).getpublishhouse());
		}

	}

}
