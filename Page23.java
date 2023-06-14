package net.hb.day31;

public class Page23 {

	public static void main(String[] args) {
	  int x=10;
	  int y=20;
	  System.out.println("교환후"); //printLine=printl소문자n
	  System.out.print("x=" + x +"\t");
	  System.out.print("y=" + y);
	  System.out.println(); //br태그역할
	  
	  int tmp = 0;
	  //페이지 24 그림및 소스참고
	  tmp = x;
	  x=y;
	  y=tmp;
	  System.out.println("교환후");
	  System.out.print("x=" + x +"\t");
	  System.out.print("y=" + y);
	  
	  
	}
}
