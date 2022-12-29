package week1.day1;

public class Mobile {
	
public void makeCall() {
	
String mobileModel="Redmi Y10";

float mobileWeight=15.3f;

System.out.println(mobileModel);

System.out.println(mobileWeight);
}
public void sendMsg() {
	
boolean FullCharged =true;
int mobileCost =28000;
System.out.println(FullCharged);
System.out.println(mobileCost);
}
public static void main(String[] args) {
	System.out.println("This is My Mobile");
	Mobile obj=new Mobile();
	obj.makeCall();
	obj.sendMsg();
	
	
}
}
