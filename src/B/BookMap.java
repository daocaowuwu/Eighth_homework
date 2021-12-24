package B;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class BookMap {

	public static void main(String[] args) { //映射实现
		Scanner input=new Scanner(System.in);
		String booknumber;
		int i=1;
		BookProperty Book;
		HashMap<String,BookProperty> BookMap=new HashMap<String,BookProperty>();
		System.out.println("输入书的编号、书名、单价、出版社，以#标志结束输入：");
		while(!input.hasNext("#"))
		{
			booknumber=input.next();
			Book=new BookProperty();
			Book.setname(input.next());
			Book.setsingleprice(input.nextDouble());
			Book.setpublishhouse(input.next());
			BookMap.put(booknumber, Book);
		}
		//Map没有迭代器方法，所以先转成Set
		//entrySet()方法将Map对象转成键值对构成的集合
		Set<Entry<String, BookProperty>> entry=BookMap.entrySet();
		//迭代器使用方法
		Iterator iter=entry.iterator();
		while(iter.hasNext())  //如果迭代器有输入
		{
			//将输入转换成键值对,引入类包java.util.Map.Enter
			Map.Entry enter=(Map.Entry)iter.next();
			String s=(String)(enter.getKey());
			Book=(BookProperty)(enter.getValue());
			
			System.out.print("这是第"+i+"本书: "+"编号： "+s);
			i+=1;
			System.out.println(" 书名： "+Book.getname()+"  "+"单价："+Book.getsingleprice()+"  "+"出版商： "+Book.getpublishhouse());
	
		}
		input.close();

	}

}
