package pro4;

/*	public class This1 {
	int a,b,c;
	
	This1(int a,int b){
		this.a=a;  		//this.a �����Ա����int a
		this.b=b;
	}
	
	This1(int a,int b,int c){
		this(a,b);//�������ĵ��ñ�����ڵ�һ�䣬���Ҳ��this(a,b);����this.a=a��this.b=b;
		this.c=c;
	}
	
	void sing() {
		
	}
	
	void eat() {
		this.sing();//���ñ����е�sing()	;����ʵд��дthis.�����ԣ�����ȥ��
		System.out.println("���躰��ؼҳԷ���");
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

	public This1() { //���Բ��ã�ϵͳ���Լ�����
		
	}
	
	public This1(int id,String name) {
		System.out.println("���ڳ�ʼ���Ѿ������õĶ���"+this); //��ӡ��ַ
		this.id=id;//��дthis���޷����־ֲ�����id�ͳ�Ա����id
		this.name=name;
	}
	
	public void login() {
		System.out.println(this.name+"Ҫ��¼��");//��дthisЧ��һ��
	}
	
	public static void main(String[] args) {
		This1 u1=new This1(101,"wj");
		System.out.println("��ӡwj����:"+u1); //��ַ
		u1.login();
	}
}

























