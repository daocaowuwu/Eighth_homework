package S;

import java.util.Scanner;
import java.util.TreeSet;
//д�ļ�Ҫ��������������������ļ���Reader
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StudentSet {

	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		TreeSet<Student> StudentSet=new TreeSet<Student>();
		System.out.println("����ѧ����Ϣ����exit��ʾ�������룺");
		while(!input.hasNext("exit"))
		{
			Student student=new Student();
			student.setstudentnumber(input.nextInt());
			student.setname(input.next());
			student.setold(input.nextInt());
			StudentSet.add(student);
		}
		BufferedWriter BW=new BufferedWriter(new FileWriter("D:\\PYTHON\\test.txt"));//  ��ַ˫"\\"
		for(Student s:StudentSet) //ע�⣡����
		{
			System.out.println("ѧ��ѧ�ţ�"+s.getstudentnumber()+" ѧ��������"+s.getname()+" ѧ�����䣺"+s.getold());
			BW.write("ѧ��ѧ�ţ�"+s.getstudentnumber()+" ѧ��������"+s.getname()+" ѧ�����䣺"+s.getold());//���Դ��س�
			BW.newLine();//���"\r\n"
			BW.flush();
		}
		input.close();
		BW.close();
	}

}
