package pro4;

public class Stusent {
	Computer comp;//����һ��Computer��Ķ���Ϊcomp
	
	void stud() {
		System.out.println("����ѧϰ�У��벻Ҫ������!+ʹ�õĵ���Ϊ:"+comp.brand);
	}
	void play() {
		System.out.println("���ڴ���Ϸ��Ҫһ������");
	}
	
	//���췽�������ڴ��������Ķ����޲εĹ��췽��������ϵͳ�Զ�����
	Stusent(){
		
	}
	
	public static void main(String[] args) {
		Stusent st=new Stusent();//����һ������
		Computer c1=new Computer();
		c1.brand="����";
		st.comp=c1;
		st.play();
		st.stud();
	}
}
	class Computer{
		String brand;
	}

