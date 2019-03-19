package cn.sxt;

import pro4.User4;  //表示导入了User4类，这样就不用加地址,如果要导入多个类，可以把User4换成*
					//这样就导入了这个包下面所有类，但是坏处是会降低编译速度，但不会降低运行速度
//如果遇到多个同名类，可以加地址指明
import static java.lang.Math.*;

public class test {
public static void main(String[] args) {
	//pro4.User4 aaa=new pro4.User4(); //要想使用其他包里面的类，可以加一个地址，但是这样写麻烦，可以加一个导入
	User4 aaa=new User4();
	
	System.out.println(Math.PI);  //这样写不用导入import static java.lang.Math.*;    静态导入 
	System.out.println(PI);//这样写要导入import static java.lang.Math.*;
	
	
	
}
}
