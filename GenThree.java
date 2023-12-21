/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int randFirst = (int)(Math.random() * (Math.abs(b - a))) + a;
		int randSecond = (int)(Math.random() * (Math.abs(b -a))) + a;
		int randThird = (int)(Math.random() * (Math.abs(b-a))) + a;
		int minimalNum =  Math.min((Math.min(randFirst, randSecond)), randThird);
		System.out.println(randFirst);
		System.out.println(randSecond);
		System.out.println(randThird);
		System.out.println("The minimal generated number was " + minimalNum);
	
	}
}
