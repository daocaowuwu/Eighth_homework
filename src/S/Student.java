package S;

public class Student implements Comparable { //普通类实现接口Comparable的compareTo方法，使自定义类有序
	private String name; //姓名
	private int studentnumber;  //学号
	private int old;  //年龄
	
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
	
	public int compareTo(Object o) {  //返回值为int，参数为Object类，实参向上转型
		if(!(o instanceof Student))
			throw new RuntimeException("不是Student对象");
		Student s=(Student)o;  //将o向下转型为自定义类对象
		if (this.old>s.old) //this的属性大就返回1，正序排序！！！
			return 1;
		if (this.old==s.old) //如果年纪一样大就按名字正序排序
			return this.name.compareTo(s.name);
		return -1;    //this小就返回-1
	}
	

}
