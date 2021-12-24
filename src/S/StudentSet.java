package S;

import java.util.Scanner;
import java.util.TreeSet;
//写文件要引入下面三个类包，读文件就Reader
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StudentSet {

	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		TreeSet<Student> StudentSet=new TreeSet<Student>();
		System.out.println("输入学生信息，以exit以示结束输入：");
		while(!input.hasNext("exit"))
		{
			Student student=new Student();
			student.setstudentnumber(input.nextInt());
			student.setname(input.next());
			student.setold(input.nextInt());
			StudentSet.add(student);
		}
		BufferedWriter BW=new BufferedWriter(new FileWriter("D:\\PYTHON\\test.txt"));//  地址双"\\"
		for(Student s:StudentSet) //注意！！！
		{
			System.out.println("学生学号："+s.getstudentnumber()+" 学生姓名："+s.getname()+" 学生年龄："+s.getold());
			BW.write("学生学号："+s.getstudentnumber()+" 学生姓名："+s.getname()+" 学生年龄："+s.getold());//不自带回车
			BW.newLine();//输出"\r\n"
			BW.flush();
		}
		input.close();
		BW.close();
	}

}
