package main;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main {

	static Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {

		String initialChoice;
		
		System.out.println("Welcome to the Morality Pathway Adventure!");
		System.out.println("--------------------------------");
		System.out.println("Here you'll be able to find a pathway"); 
	    System.out.println("that will lead you to the most moral life possible!");
		System.out.println("--------------------------------");
		System.out.println("There are two choices, yes and no. Enter these"); 
	    System.out.println("based on the question you are asked.");
		System.out.println("--------------------------------");
		System.out.println("ONLY yes or no SHOULD BE TYPED. MUST BE TYPED EXACTLY AS SHOWN.");
		System.out.println("--------------------------------");
		
		System.out.println("-> Are you ready for some questions?");
		initialChoice = sc.nextLine(); 
		
		if(initialChoice.equals("yes")) {
			System.out.println("--------------------------------");
			System.out.println("Cool! Let's begin." );
			System.out.println("--------------------------------");
			System.out.println("There are many ways to respect the dignity of others, by being curteous,"); 
			System.out.println("kind, and respectful to those around you. ");
			System.out.println("--------------------------------");
			
			church(); 
			responsibilityCurteous();
			kind(); 
			moralityOpinonQuestion();
		}
		else if(initialChoice.equals("no")) {
			System.out.println("--------------------------------");
			System.out.println("Aww, too bad. Goodbye!");
			System.out.println("--------------------------------");
			System.out.println("I hope you'll be able to find your own way in life and");
			System.out.println("live as Jesus wants you to, respecting human dignity and");
			System.out.println("encouraging others to do the same.");
			System.out.println("--------------------------------");
			System.exit(0);
		}
	}
	
	public static void church() {
		String churchChoice; 
		
		System.out.println("-> Do you go to church?");
		churchChoice = sc.nextLine(); 
		
		if(churchChoice.equals("yes")) {
			System.out.println("--------------------------------");
			System.out.println("Good job, Jesus is proud! You are learning to live a moral life.");
			System.out.println("--------------------------------");
			System.out.println("Going to church can help us lead a better life, which in turn makes"); 
			System.out.println("everything better. Jesus wants us to go to Church as often as we can and");
			System.out.println("if you do, along with other things, you can reach Heaven.");
			System.out.println("--------------------------------");
		}
		else if(churchChoice.equals("no")) {
			System.out.println("That's a shame. Going to Church allows us to gain insight to the work");
			System.out.println("and intentions of God. Jesus intended for us to go to Church as often");
			System.out.println("as we can, you should follow his teachings!");
			System.out.println("--------------------------------");
			
			System.out.println("Thank you for playing! There are some things you need to work on, and I");
			System.out.println("recommend you do the following steps:");
			System.out.println("--------------------------------");
			
			System.exit(0); 
		}
	}
	public static void responsibilityCurteous() {
		String responCurtChoice;
		
		System.out.println("-> Have you been respectul and curteous to other people?");
		responCurtChoice = sc.nextLine(); 
		
		if(responCurtChoice.equals("yes")) {
			System.out.println("--------------------------------");
			System.out.println("Good job! Doing so sets an example for others to follow");
			System.out.println("and apply it to their own lives!");
			System.out.println("--------------------------------");
		}
		else if(responCurtChoice.equals("no")) {
			System.out.println("--------------------------------");
			System.out.println("Human dignity is one of the most amazing and important things God");
			System.out.println("has given us, and we should respect it by respecting others, treating");
			System.out.println("them like they should be treated.");
			System.out.println("--------------------------------");
			System.exit(0);
		}
	}
	public static void kind () {
		String kindChoice;
		
		System.out.println("-> Have you been kind to those around you?");
		kindChoice = sc.nextLine(); 
		
		if(kindChoice.equals("yes")) {
			System.out.println("--------------------------------");
			System.out.println("Good job! Doing so sets an example for others to follow"); 
			System.out.println("and apply to their own lives.");
			System.out.println("--------------------------------");
			System.out.println("Being kind increases and builds up the dignity of the person");
			System.out.println("who you're talking to. This in turn provides them with the courage");
			System.out.println("to do the same to others.");
			System.out.println("--------------------------------");
		}
		else if(kindChoice.equals("no")) {
			System.out.println("--------------------------------");
			System.out.println("-> That's not good, you should change that.");
			System.out.println("--------------------------------");
			System.out.println("Being kind to someone increases their dignity and influences them");
			System.out.println("to apply it to their own lives!");
			System.out.println("Thank you so much for playing and I hope you learn to change and to");
			System.out.println("follow the examples set by others.");
			System.out.println("--------------------------------");
			System.exit(0);
		}
	}
	public static void moralityOpinonQuestion() {
		String finalQuestion;
		
		System.out.println("-> Do you think you've lived a moral life?");
		finalQuestion = sc.nextLine(); 
		
		if(finalQuestion.equals("yes")) {
			System.out.println("--------------------------------");
			System.out.println("You've done great. You are on the right track to Heaven and have been");
			System.out.println("the best version of yourself.");
			System.out.println("--------------------------------");
		}
		else if(finalQuestion.equals("no")) {
			System.out.println("--------------------------------");
			System.out.println("Based on these responses to your questions, you are lying to yourself.");
			System.out.println("You've proven that you're a wonderful person and that you have lived a moral,");
			System.out.println("respectful and wonderful life so far and I hope you can continue to do so.");
			System.out.println("--------------------------------");
			System.exit(0);
		}
	}
}
