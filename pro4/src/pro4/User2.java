package pro4;

public class User2 {
	int id;
	String name;
	String pwd;
	static String company="����д��";//��˾����,Ҳ�Ǿ�̬����
	
	public User2(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public void login() {
		//printCompany();
		System.out.println("��¼:"+name);
	}
	public static void printCompany() {
		//login();   //���÷Ǿ�̬��Ա������ͻᱨ��
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		User2 u=new User2(101,"wj");
		User2.printCompany();
        User2.company = "��������үү";//����static���ε�7�У������������ã����ö���
        User2.printCompany();
        u.login();
	}
}
