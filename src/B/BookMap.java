package B;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class BookMap {

	public static void main(String[] args) { //ӳ��ʵ��
		Scanner input=new Scanner(System.in);
		String booknumber;
		int i=1;
		BookProperty Book;
		HashMap<String,BookProperty> BookMap=new HashMap<String,BookProperty>();
		System.out.println("������ı�š����������ۡ������磬��#��־�������룺");
		while(!input.hasNext("#"))
		{
			booknumber=input.next();
			Book=new BookProperty();
			Book.setname(input.next());
			Book.setsingleprice(input.nextDouble());
			Book.setpublishhouse(input.next());
			BookMap.put(booknumber, Book);
		}
		//Mapû�е�����������������ת��Set
		//entrySet()������Map����ת�ɼ�ֵ�Թ��ɵļ���
		Set<Entry<String, BookProperty>> entry=BookMap.entrySet();
		//������ʹ�÷���
		Iterator iter=entry.iterator();
		while(iter.hasNext())  //���������������
		{
			//������ת���ɼ�ֵ��,�������java.util.Map.Enter
			Map.Entry enter=(Map.Entry)iter.next();
			String s=(String)(enter.getKey());
			Book=(BookProperty)(enter.getValue());
			
			System.out.print("���ǵ�"+i+"����: "+"��ţ� "+s);
			i+=1;
			System.out.println(" ������ "+Book.getname()+"  "+"���ۣ�"+Book.getsingleprice()+"  "+"�����̣� "+Book.getpublishhouse());
	
		}
		input.close();

	}

}
