package pro4;

/*		public class Gzao2 {
	int id;
	String name;
	String pwd;
	
	public Gzao2() {
		
	}
	public Gzao2(int id,String name) {
		super();    //���췽���ĵ�һ������super()
		this.id=id;  //this��ʾ�����õĶ���
		this.name=name;
	}
	public Gzao2(int id,String name,String pwd) {
		this.id=id;
		this.name=name;
		this.pwd=pwd;
	}
	
	public static void main(String[] args) {
		Gzao2 u1=new Gzao2();
		Gzao2 u2=new Gzao2(101,"����");
		Gzao2 u3=new Gzao2(102,"������","123456qq");
	}	
}		*/
public class Gzao2{
	int id;
	String name;
	int age;
	
	public Gzao2() {
		
	}
	
	public Gzao2(int id,String name) {
		super();
		this.id=id;
		this.name=name;
	}
	
	public Gzao2(int id,int age) {
		this.id=id;
		this.age=age;
	}
	
	public int aaa(int id,int age) {
		return id+age;
	}
	
	public static void main(String[] args) {
		Gzao2 k=new Gzao2();
		Gzao2 n=new Gzao2(1001,"����");
		Gzao2 m=new Gzao2(1002,21);
		System.out.print(k.aaa(1002,21));
	}
}






















