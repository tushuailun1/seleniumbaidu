package pro4;

public class JingTaiK {
	int id;
	String name;
	static String company;
	
	static {
		//  name="lxa"; 不能调用普通的变量，这是错误的
		company="wjdage";
		pco();
	}
	
	public static void pco() {
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		JingTaiK aaa=new JingTaiK();
		aaa=null; //19、20行可以和起来写成JingTaiK aaa=null;
	}
}
