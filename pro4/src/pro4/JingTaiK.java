package pro4;

public class JingTaiK {
	int id;
	String name;
	static String company;
	
	static {
		//  name="lxa"; ���ܵ�����ͨ�ı��������Ǵ����
		company="wjdage";
		pco();
	}
	
	public static void pco() {
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		JingTaiK aaa=new JingTaiK();
		aaa=null; //19��20�п��Ժ�����д��JingTaiK aaa=null;
	}
}
