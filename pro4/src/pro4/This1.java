package pro4;

/*	public class This1 {
	int a,b,c;
	
	This1(int a,int b){
		this.a=a;  		//this.a 代表成员变量int a
		this.b=b;
	}
	
	This1(int a,int b,int c){
		this(a,b);//构造器的调用必须放在第一句，这个也是this(a,b);等于this.a=a与this.b=b;
		this.c=c;
	}
	
	void sing() {
		
	}
	
	void eat() {
		this.sing();//调用本类中的sing()	;，其实写不写this.都可以，可以去掉
		System.out.println("妈妈喊你回家吃饭！");
	}
	
	public static void main(String[] args) {
		This1 h=new This1(2,3);
		h.eat();
	}
}	*/
public class This1{
	int id;
	String name;
	String pwd;

	public This1() { //可以不用，系统会自己创建
		
	}
	
	public This1(int id,String name) {
		System.out.println("正在初始化已经创建好的对象："+this); //打印地址
		this.id=id;//不写this，无法区分局部变量id和成员变量id
		this.name=name;
	}
	
	public void login() {
		System.out.println(this.name+"要登录！");//不写this效果一样
	}
	
	public static void main(String[] args) {
		This1 u1=new This1(101,"wj");
		System.out.println("打印wj对象:"+u1); //地址
		u1.login();
	}
}

























