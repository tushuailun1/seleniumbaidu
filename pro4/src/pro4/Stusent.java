package pro4;

public class Stusent {
	Computer comp;//定义一个Computer类的对象为comp
	
	void stud() {
		System.out.println("我在学习中，请不要打扰我!+使用的电脑为:"+comp.brand);
	}
	void play() {
		System.out.println("我在打游戏，要一起来吗？");
	}
	
	//构造方法，用于创建这个类的对象，无参的构造方法可以由系统自动创建
	Stusent(){
		
	}
	
	public static void main(String[] args) {
		Stusent st=new Stusent();//创建一个对象
		Computer c1=new Computer();
		c1.brand="联想";
		st.comp=c1;
		st.play();
		st.stud();
	}
}
	class Computer{
		String brand;
	}

