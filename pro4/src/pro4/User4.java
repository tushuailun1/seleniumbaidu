package pro4;

public class User4 {
	int id;
	String name="wj";
	
	public void test01(User4 u) {
		u.name="lxz";  //��ӡ
	}
	
	public void test02(User4 u) {
		u=new User4();  //�������µ�ַ�����ı䲻��ԭ��ַ
		u.name="sq";
	}
	
	public static void main(String[] args) {
		User4 u1=new User4();	
		u1.name="my";
		u1.test01(u1);
		System.out.println(u1.name);
		
		u1.test02(u1);
		System.out.println(u1.name);
		
	}
}
