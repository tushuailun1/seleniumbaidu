package pro4;

	class Point{
	double x,y;
									//���Բ���public
 public Point(double a,double b) {   //6-9���ǹ��췽����Point�ǹ������ƣ���Ҫ������class Pointһ��
	 x=a;							//���Ĭ���з���ֵreturn����Ҫ���һ��д����������дreturn ;
	 y=b;
 }
 public double getDis(Point c) {//getDis�Ƿ�����
	 return Math.sqrt((x-c.x)*(x-c.y)+(y-c.y)*(y-c.y));
 }
}



public class GzaoQi {
	public static void main(String[] args) {
		Point c1=new Point(3.0,4.0);
		Point c2=new Point(0.0,0.0);
		System.out.println(c1.getDis(c2)); //��c2����10�е�Point c����
	}
}      


















