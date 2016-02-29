package main;

import java.util.Scanner;

import javax.management.timer.Timer;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int dignityVariable = 0; 
	static int lowDignity = -3; 
	static int highDignity = 3; 
	static Timer timer = new Timer(); 
		
	public static void main(String[] args) throws InterruptedException {
		String initialChoice; 
		
		System.out.println("<> Welcome to the Morality guidance application!");
		Thread.sleep(2000);
		System.out.println("<> Here you will be able to discover the dignity you possess");
		System.out.println("and the morality you demonstrate to others..");
		Thread.sleep(2000);
		System.out.println("<> You'll be asked many questions and at the end, based");
		System.out.println("on your answers, given advice or reassurance.");
		Thread.sleep(2000);
		System.out.println("<> There are two answer choices, yes and no. Enter these"); 
	    System.out.println("based on the question you are asked.");
	    Thread.sleep(2000);
	    System.out.println("<> Have fun and goodluck!");
		System.out.println("--------------------------------");
		Thread.sleep(2000);
		
		System.out.println("-> Are you ready for some questions?");
		initialChoice = sc.nextLine(); 
		
		if(initialChoice.equals("yes") || initialChoice.contains("y")) {
			System.out.println("--------------------------------");
			System.out.println("<> Cool! Let's begin." );
			Thread.sleep(2000);
			System.out.println("<> There are many ways to respect the dignity of others, by being curteous,"); 
			System.out.println("kind, and respectful to those around you. ");
			Thread.sleep(2000); 
			System.out.println("<> You will now be asked a series of questions, please respond honestly...");
			System.out.println("--------------------------------");
			Thread.sleep(2000);
			
			try {
				church(); 
				Thread.sleep(600);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
		}
		else if(initialChoice.equals("no") || initialChoice.contains("n")) {
			System.out.println("<> Aww, too bad. Goodbye!");
			Thread.sleep(2000);
			
			System.out.println("<> I hope you'll be able to find your own way in life and");
			System.out.println("live as Jesus wants you to, respecting human dignity and");
			System.out.println("encouraging others to do the same.");
			System.out.println("----------------The End----------------");
			
			System.exit(0);
			
			try {
				church(); 
				Thread.sleep(600);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
	
	public static void church() throws InterruptedException{
		String churchChoice; 
		
		System.out.println("-> Do you go to church?");
		churchChoice = sc.nextLine(); 
		
		if(churchChoice.equals("yes") || churchChoice.contains("y")) {
			dignityVariable++; 
			try {
				responsibilityCurteous(); 
				Thread.sleep(600);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
		}
		else if(churchChoice.equals("no") || churchChoice.contains("n")) {
			dignityVariable--;
			try {
				responsibilityCurteous();
				Thread.sleep(600); 
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
	public static void responsibilityCurteous() throws InterruptedException {
		String responCurtChoice;
		
		System.out.println("-> Have you been respectul and curteous to other people?");
		responCurtChoice = sc.nextLine(); 
		
		if(responCurtChoice.equals("yes") || responCurtChoice.contains("y")) {
			dignityVariable++; 
			try {
				fundGood(); 
				Thread.sleep(600);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
		}
		else if(responCurtChoice.equals("no") || responCurtChoice.contains("n")) {
			dignityVariable--; 
			try {
				fundGood(); 
				Thread.sleep(600);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
	public static void fundGood() throws InterruptedException {
		String fundGoodChoice;
		
		System.out.println("-> Do you believe humans are fundamentally good?");
		fundGoodChoice = sc.nextLine(); 
		
		if(fundGoodChoice.equals("yes") || fundGoodChoice.contains("y")) {
			dignityVariable++; 
			try {
				trueToSelfChoice(); 
				Thread.sleep(600);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
		}
		else if(fundGoodChoice.equals("no") || fundGoodChoice.contains("n")) {
			dignityVariable--; 
			try {
				trueToSelfChoice(); 
				Thread.sleep(600);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
	public static void trueToSelfChoice() throws InterruptedException {
		String trueToSelfChoice; 
		
		System.out.println("-> Have you been true to yourself?");
		trueToSelfChoice = sc.nextLine(); 
		
		if(trueToSelfChoice.equals("yes") || trueToSelfChoice.contains("y")) {
			dignityVariable++; 
			try {
				kind(); 
				Thread.sleep(600);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
		}
		else if(trueToSelfChoice.equals("yes") || trueToSelfChoice.contains("n")) {
			dignityVariable--; 
			try {
				kind();
				Thread.sleep(600); 
			}
			catch(InterruptedException ex) {
				kind(); 
				Thread.sleep(600);
			}
			
		}
	}
	public static void kind () throws InterruptedException {
		String kindChoice;
		
		System.out.println("-> Have you been kind to those around you?");
		kindChoice = sc.nextLine(); 
		
		if(kindChoice.equals("yes") || kindChoice.contains("y")) {
			dignityVariable++; 
		}
		else if(kindChoice.equals("no") || kindChoice.contains("n")) {
			dignityVariable--;
			
			try {
				moralityOpinionQuestion();
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public static void moralityOpinionQuestion() throws InterruptedException {
		String finalQuestion;
		
		System.out.println("-> Do you think you've lived a moral life?");
		finalQuestion = sc.nextLine(); 		
		
		if(finalQuestion.contains("y") && dignityVariable >= highDignity) {
			System.out.println("--------------------------------");
			System.out.println("<> Based on your responses to these questions, you are correct. You have respected");
			System.out.println("the dignity of others and have set wonderful examples for those around us.");
			Thread.sleep(2000);
			System.out.println("<> You've done great. You are on the right track to Heaven and have been");
			System.out.println("the best version of yourself.");
			System.out.println("----------------The End----------------");
			
			System.exit(0); 
		}
		else if(finalQuestion.contains("y") && dignityVariable >= lowDignity) {
			System.out.println("--------------------------------");
			System.out.println("<> You've done good but you could use some work in the area's you've responded no to.");
			Thread.sleep(3000);
			System.out.println("<> There is nothing you cannot do when you put your mind to it, the same");
			System.out.println("principle applies here. If you work towards making yourself the best version");
			System.out.println("of yourself by treating people correctly, fairly and respectfully, you can");
			System.out.println("reach Heaven with ease.");
			Thread.sleep(3000);
			System.out.println("<> I hope these questions have helped you learn about what you need to fix in the");
			System.out.println("way you treat people, how you look at them, and how to fix it.");
			System.out.println("----------------The End----------------");
			
			System.exit(0); 
		}
		else if(finalQuestion.contains("n")) {
			System.out.println("--------------------------------");
			System.out.println("<> Based on your responses to these questions, you could use some work.");
			Thread.sleep(1000);
			System.out.println("<> You've done some things, both good and bad. Respecting others, being kind, ");
			System.out.println("and being the best person you can be are the best ways to live a moral life.");
			Thread.sleep(2000);
			System.out.println("<> Doing these things is the best way to not only increase your own dignity, but");
			System.out.println("increase the dignity of those around you. You are one of 7.1 billion people on Earth");
			System.out.println("and the only way you can make a difference is by being the difference you want to ");
			System.out.println("see in the world.");
			System.out.println("----------------The End----------------");
			
			System.exit(0);
		}
	}
}
