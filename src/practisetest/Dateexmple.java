package practisetest;

import java.util.Date;

public class Dateexmple {

String wife="Jyothika"	;
 static String name;
  static int a;
  static{
	  name="ramesh";
	   a=2;
  }

	public static void main(String[] args) {
		Date dt=new Date();
		//SimpleDateFormat 
		System.out.println("static variable "+Dateexmple.name);
		System.out.println(Dateexmple.a);
		Dateexmple fam=new Dateexmple();
        System.out.println("instance variable "+fam.wife);
        fam.arrangedMarriage();
        Dateexmple.loveMarraige();
        
	}
	public void arrangedMarriage()
	{
		System.out.println("instance variable from non static method "+wife);
	}
	
	public static void loveMarraige()
	{
		System.out.println("static var from static method "+name);
		//System.out.println(wife);
		
		
	}

}
