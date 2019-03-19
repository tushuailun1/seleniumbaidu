package pro4;

public class Student1 {
	Coom camp;
	
	void stud() {
		System.out.println("你的电脑品牌是:"+camp.bland);
	}
	public static void main(String[] args) {
		Student1 st=new Student1();
		Coom c1=new Coom();
		c1.bland="联想品牌";
		st.camp=c1;
		st.stud();
	}
}
class Coom{
	String bland;
}