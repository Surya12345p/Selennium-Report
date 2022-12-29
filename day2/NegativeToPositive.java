package day2;

public class NegativeToPositive {
	
public static void main(String[] args) {
	
	int number= -60;
	if (number<0) {
		int x=number;
		int y=x+(2*(-1*x));
		System.out.println("The number"+ number+" is converted to "+y);
	}
	else {
		System.out.println(number+" Its already Positive number");
	}
}
}