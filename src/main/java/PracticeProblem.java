import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
	}

	public static void q1() {
     Scanner scanner=new Scanner(System.in);
	 String a;
	 System.out.print("Input a sentence: ");
	 a=scanner.nextLine();
	 System.out.println(a.contains("on"));
		//Write question 1 code here
	}

	public static void q2() {
		Scanner scanner=new Scanner(System.in);
        String a;
		System.out.print("Input the word mango: ");
		a=scanner.nextLine();
		System.out.println((a.equalsIgnoreCase("mango")));

		//Write question 2 code here
	}

	public static void q3() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Input a word: ");
		String a=scanner.nextLine();
		System.out.print("Input a letter: ");
		String b=scanner.nextLine();
		System.out.println(a.indexOf(b));
		System.out.println(a.lastIndexOf(b));
		//Write question 3 code here
	}

	public static void q4() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String b=scanner.nextLine();
        System.out.println("Your sentence is "+b.length()+" characters long");

		//Write question 4 code here
	}

	public static void q5() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String a=scanner.nextLine();
		System.out.print("Input a word to replace: ");
		String b= scanner.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String c=scanner.nextLine();
		System.out.println(a.replaceAll(b,c));


		//Write question 5 code here
	}

	public static void q6() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String a=scanner.nextLine();
		a=a.toUpperCase();
     	System.out.println(a.trim());
        a=a.toLowerCase();
		System.out.println(a.trim());
		

		//Write question 6 code here
	}

	public static void q7() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Input a word: ");
		String a=scanner.nextLine();
		System.out.println(a.substring(0,4));
		System.out.println(a.substring(a.length()-4));
		//Write question 7 code here
	}

	public static void q8() {
		//Write question 8 code here
	}

}
