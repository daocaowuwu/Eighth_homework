package S;

public class Student implements Comparable { //��ͨ��ʵ�ֽӿ�Comparable��compareTo������ʹ�Զ���������
	private String name; //����
	private int studentnumber;  //ѧ��
	private int old;  //����
	
	Student(){
		
	}

	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	
	public int getstudentnumber() {
		return studentnumber;
	}
	public void setstudentnumber(int studentnumber) {
		this.studentnumber=studentnumber;
	}
	
	public int getold() {
		return old;
	}
	public void setold(int old) {
		this.old=old;
	}
	
	public int compareTo(Object o) {  //����ֵΪint������ΪObject�࣬ʵ������ת��
		if(!(o instanceof Student))
			throw new RuntimeException("����Student����");
		Student s=(Student)o;  //��o����ת��Ϊ�Զ��������
		if (this.old>s.old) //this�����Դ�ͷ���1���������򣡣���
			return 1;
		if (this.old==s.old) //������һ����Ͱ�������������
			return this.name.compareTo(s.name);
		return -1;    //thisС�ͷ���-1
	}
	

}
