package pro4;

	class Point{
	double x,y;
									//可以不加public
 public Point(double a,double b) {   //6-9行是构造方法，Point是构造名称，需要和类名class Point一致
	 x=a;							//这个默认有返回值return，不要多此一举写出来，可以写return ;
	 y=b;
 }
 public double getDis(Point c) {//getDis是方法名
	 return Math.sqrt((x-c.x)*(x-c.y)+(y-c.y)*(y-c.y));
 }
}



public class GzaoQi {
	public static void main(String[] args) {
		Point c1=new Point(3.0,4.0);
		Point c2=new Point(0.0,0.0);
		System.out.println(c1.getDis(c2)); //把c2传到10行的Point c里面
	}
}      


















