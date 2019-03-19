package pro4;

public class User2 {
	int id;
	String name;
	String pwd;
	static String company="北京写堂";//公司名称,也是静态变量
	
	public User2(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public void login() {
		//printCompany();
		System.out.println("登录:"+name);
	}
	public static void printCompany() {
		//login();   //调用非静态成员，编译就会报错
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		User2 u=new User2(101,"wj");
		User2.printCompany();
        User2.company = "北京阿里爷爷";//用了static修饰第7行，就用类名调用，不用对象
        User2.printCompany();
        u.login();
	}
}
