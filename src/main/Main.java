package main;

import java.util.Scanner;

import javax.management.timer.Timer;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int dignityVariable = 0; 
	static int lowDignity = -2; 
	static int highDignity = 2; 
	static Timer timer = new Timer(); 
		
	public static void main(String[] args) throws InterruptedException {

		String initialChoice; 
		
		System.out.println("Welcome to the Morality Pathway Adventure!");
		System.out.println("--------------------------------");
		Thread.sleep(2000);
		
		System.out.println("Here you'll be able to find a pathway"); 
	    System.out.println("that will lead you to the most moral life possible!");
		System.out.println("--------------------------------");
		Thread.sleep(2000);
		
		System.out.println("There are two choices, yes and no. Enter these"); 
	    System.out.println("based on the question you are asked.");
		System.out.println("--------------------------------");
		Thread.sleep(2000);
		
		System.out.println("ONLY yes or no SHOULD BE TYPED. MUST BE TYPED EXACTLY AS SHOWN.");
		System.out.println("--------------------------------");
		Thread.sleep(2000);
		
		System.out.println("-> Are you ready for some questions?");
		initialChoice = sc.nextLine(); 
		
		if(initialChoice.equals("yes") || initialChoice.contains("y")) {
			System.out.println("--------------------------------");
			System.out.println("Cool! Let's begin." );
			System.out.println("--------------------------------");
			Thread.sleep(2000);
			
			System.out.println("There are many ways to respect the dignity of others, by being curteous,"); 
			System.out.println("kind, and respectful to those around you. ");
			System.out.println("--------------------------------");
			Thread.sleep(2000); 
			
			System.out.println("You will now be asked a series of questions, please respond honestly..");
			System.out.println("--------------------------------");
			Thread.sleep(2000); 
			
			church(); 
			Thread.sleep(600);
			
			responsibilityCurteous();
			Thread.sleep(600);
			
			kind(); 
			Thread.sleep(600);
			
            moralityOpinionQuestion();
            Thread.sleep(1000); 
		}
		else if(initialChoice.equals("no") || initialChoice.contains("n")) {
			System.out.println("--------------------------------");
			System.out.println("Aww, too bad. Goodbye!");
			System.out.println("--------------------------------");
			Thread.sleep(2000);
			
			System.out.println("I hope you'll be able to find your own way in life and");
			System.out.println("live as Jesus wants you to, respecting human dignity and");
			System.out.println("encouraging others to do the same.");
			System.out.println("--------------------------------");
			
			System.exit(0);
		}
	}
	
	public static void church() throws InterruptedException{
		
		String churchChoice; 
		
		System.out.println("-> Do you go to church?");
		churchChoice = sc.nextLine(); 
		
		if(churchChoice.equals("yes") || churchChoice.contains("y")) {
			dignityVariable++; 
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
		}
		else if(responCurtChoice.equals("no") || responCurtChoice.contains("n")) {
			dignityVariable--; 
			try {
				kind(); 
				Thread.sleep(600);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
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
			System.out.println("Based on your responses to these questions, you are correct. You have respected");
			System.out.println("the dignity of others and have set wonderful examples for those around us.");
			System.out.println("--------------------------------");
			Thread.sleep(2000);
			
			System.out.println("You've done great. You are on the right track to Heaven and have been");
			System.out.println("the best version of yourself.");
			System.out.println("--------------------------------");
			
			System.exit(0); 
		}
		else if(finalQuestion.contains("y") && dignityVariable >= lowDignity) {
			System.out.println("--------------------------------");
			System.out.println("You've done good but you could use some work in the area's you've responded no to.");
			System.out.println("There is nothing you cannot do when you put your mind to it, the same");
			System.out.println("principle applies here. If you work towards making yourself the best version");
			System.out.println("of yourself by treating people correctly, fairly and respectfully, you can");
			System.out.println("reach Heaven with ease.");
			System.out.println("--------------------------------");
			Thread.sleep(3000);
			
			System.out.println("I hope these questions have helped you learn about what you need to fix in the");
			System.out.println("way you treat people, how you look at them, and how to fix it.");
			System.out.println("--------------------------------");
			
			System.exit(0); 
		}
		else if(finalQuestion.contains("n")) {
			System.out.println("--------------------------------");
			System.out.println("Based on these responses to your questions, you are lying to yourself.");
			System.out.println("You've proven that you're a wonderful person and that you have lived a moral,");
			System.out.println("respectful and wonderful life so far and I hope you can continue to do so.");
			System.out.println("--------------------------------");
			Thread.sleep(3000);
			
			System.out.println("You should work to help yourself realize such a thing as this, and if you do,");
			System.out.println("you might just inspire yourself to continue to do the good work you've");
			System.out.println("been doing.");
			System.out.println("--------------------------------");
			
			System.exit(0);
		}
	}
}
