package GameTest;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test {

static ArrayList<Question> PreguntasL1 = new ArrayList<Question>();	
static ArrayList<Question> PreguntasL2 = new ArrayList<Question>();	
static ArrayList<Question> PreguntasL3 = new ArrayList<Question>();	
static ArrayList<Question> PreguntasL4 = new ArrayList<Question>();
static ArrayList<Question> PreguntasL5 = new ArrayList<Question>();	


	public static void main(String[] args) {			
		
		logIn();
		//Level 1 questions
		
		String q1 = "How many days are there in a normal year??\n"
		+ "(a)365\n(b)366\n(c)180\n(d)360";
		
		String q2 = "How many colors are there in a rainbow?\n"
				+ "(a)5\n(b)7\n(c)9\n(d)18";
		String q3 = "How many sides are there in a triangle?\n"
				+ "(a)4.5\n(b)4\n(c)3\n(d)18";
		String q4 = "Which animal is called King of Jungle?\n"
				+ "(a)Lion\n(b)Tiger\n(c)Mouse\n(d)Giraffe";
		String q5 = "How many primary colors are there?\n"
				+ "(a)5\n(b)7\n(c)9\n(d)3";
		
		// 
		PreguntasL1.add(new Question(q1, "a"));
		PreguntasL1.add(new Question(q2, "b"));
		PreguntasL1.add(new Question(q3, "c"));
		PreguntasL1.add(new Question(q4, "a"));
		PreguntasL1.add(new Question(q5, "d"));
		
		// Level 2 questions		
		
		String q6 = "Which is the tallest animal on the earth?\n"
				+ "(a)Elephant\n(b)ostrich\n(c)Whale\n(d)Giraffe";
				
		String q7 = "Who was the first man to walk on the moon?\n"
						+ "(a)Thoma Mann\n(b)Lance Armstrong\n(c) Neil Armstrong\n(d)Bruce Willis";
		String q8 = "Which is the fastest animal on the land?\n"
						+ "(a)Rabit\n(b)gazelle\n(c)Tiger\n(d)Cheetah";
		String q9 = "Which is the nearest star to planet earth?\n"
						+ "(a)Sun\n(b)Centauri \n(c)Moon\n(d)Mars";
		String q10 = "Which is the tallest mountain in the world?\n"
						+ "(a)Mount Everest\n(b)Burj Khalifa\n(c)Nepal\n(d)Colteger";
		
		PreguntasL2.add(new Question(q6, "d"));
		PreguntasL2.add(new Question(q7, "c"));
		PreguntasL2.add(new Question(q8, "d"));
		PreguntasL2.add(new Question(q9, "a"));
		PreguntasL2.add(new Question(q10, "a"));	
		
		//Level 3 questions 
		
		String q11 = "Which is the most sensitive organ in our body?\n"
				+ "(a)Penis\n(b)kidneys\n(c)Skin\n(d)liver";
				
		String q12 = "Which is the largest ocean in the world?\n"
						+ "(a)Atlantic\n(b)Pacific\n(c) Nile\n(d)Amazonas";
		String q13 = "Which is the largest country in the world?\n"
						+ "(a)India\n(b)USA\n(c)China\n(d)Russia";
		String q14 = "How many strings does a violin have\n"
						+ "(a)3\n(b)6\n(c)5\n(d)4";
		String q15 = "How many planets are there in our solar system?\n"
						+ "(a)9\n(b)8\n(c)7\n(d)9.5";
		
		PreguntasL3.add(new Question(q11, "c"));
		PreguntasL3.add(new Question(q12, "b"));
		PreguntasL3.add(new Question(q13, "d"));
		PreguntasL3.add(new Question(q14, "d"));
		PreguntasL3.add(new Question(q15, "b"));	
		
		
		//Level 4 questions 
		
		String q16 = "Who invented the telephone?\n"
				+ "(a)Fleming\n(b)Nicola Tesla\n(c)Graha Bell\n(d)Alba Edison";
				
		String q17 = "Which is the most widely spoken language in the world?\n"
						+ "(a)Chinese\n(b)English\n(c) Español\n(d)Arabic";
		String q18 = "During which year did World War I begin?\n"
						+ "(a)1929\n(b)1945\n(c)1914\n(d)1930";
		String q19 = "Which country gifted The Statue of Liberty to the United States?\n"
						+ "(a)Spain\n(b)Italy\n(c)France\n(d)Grand Britain";
		String q20 = "What is the name of the Greek God of music?\n"
						+ "(a)Zeus\n(b)Apollo\n(c)Demeter\n(d)Ares";
		
		PreguntasL4.add(new Question(q16, "c"));
		PreguntasL4.add(new Question(q17, "a"));
		PreguntasL4.add(new Question(q18, "c"));
		PreguntasL4.add(new Question(q19, "c"));
		PreguntasL4.add(new Question(q20, "b"));
		
		//Level 5 questions
		
		String q21 = "Which is the first element on the periodic table of elements?\n"
				+ "(a)Calcium\n(b)Argon\n(c)Carbon\n(d)Hydrogen";
				
		String q22 = "What is the largest joint in the human body?\n"
						+ "(a)knee\n(b)Foot\n(c)Hip\n(d)Anckle";
		String q23 = "How many teeth does a healthy adult have including the wisdom teeth?\n"
						+ "(a)16\n(b)28\n(c)24\n(d)32";
		String q24 = "Which gas is most abundant in the earth’s atmosphere?\n"
						+ "(a)Oxigen\n(b)Nitrogen\n(c)Argon\n(d)Ozone";
		String q25 = "Who is the first woman to go to space?\n"
						+ "(a)Valentina Tereshkova\n(b)Roberta Bondar\n(c)Jan Davis\n(d)Mae Jemison";
		
		
		PreguntasL5.add(new Question(q21, "d"));
		PreguntasL5.add(new Question(q22, "a"));
		PreguntasL5.add(new Question(q23, "d"));
		PreguntasL5.add(new Question(q24, "b"));
		PreguntasL5.add(new Question(q25, "a"));
								
		levelUp();
		
	}
	
	public static void logIn() {
		
		// In the intro we gather the name and password of the user, this initial data is storage in BD
		Scanner sc = new Scanner(System.in);		
		System.out.println("****Welcome to Who Wants to be Millionaire****\n\nPlease intoduce an Username: ");
		String userName = sc.nextLine();
		System.out.println("Introduce tu clave de acceso: ");
		String userPassword = sc.nextLine();
		
		ConectionBD c = new ConectionBD();
		c.agregar(userName, userPassword, 0);
		
		
		
	}
	
	
	
	public static int takeTest(ArrayList<Question> listaPreguntas) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int score = 0; 
		
		Scanner keyboardInput = new Scanner(System.in);
		
		Random random = new Random();		
		
		
		for (int i = 0; i < listaPreguntas.size(); i++ ) {
			
			int randomValue1 = random.nextInt(listaPreguntas.size());
			while (numbers.contains(randomValue1)) {
				randomValue1 = random.nextInt(listaPreguntas.size());
		    }
			numbers.add(randomValue1);
			
			System.out.println(randomValue1); 			
						
		      
			System.out.println(listaPreguntas.get(randomValue1).getQuery());
			String answer = keyboardInput.nextLine();
			if(answer.equals(listaPreguntas.get(randomValue1).getAnswer())) {
				score++;
				int points =100;
				System.out.println("Weel Done!\n");				
				ConectionBD c = new ConectionBD();
				c.actualizarPuntaje(points);
			}
			else{ 
				
				System.out.println("Wrong answer, the correct answer is: "+ listaPreguntas.get(randomValue1).getAnswer()); 
				System.out.println("You got " + score + "/"+ listaPreguntas.size() ); 				
				System.out.println("You got "+ score +" puntos");								
				ConectionBD c = new ConectionBD();
				c.actualizarPuntaje(0);
				return 0; 
				
			}
		}
		
		System.out.println("You got " + score + "/"+ listaPreguntas.size() ); 
			return 1;		
	}
	
	public static void levelUp() {
		
		Scanner sc = new Scanner(System.in);
		int resultado = takeTest(PreguntasL1); 
		
		
		
		
		if (resultado == 1) {
			System.out.println("Congratulations you have pass the first level\n\n If you want to continue press Y (Yes)?\n");
			String continuar = sc.nextLine();				
				System.out.println(continuar);
				
				if (continuar.equalsIgnoreCase("Y")) {
					 resultado = takeTest(PreguntasL2); 
					
					if (resultado == 1) {
						System.out.println("Congratulations you have pass the second level\n\n If you want to continue press Y (Yes)?\n");
						 continuar = sc.nextLine();				
						 if (continuar.equalsIgnoreCase("Y")) {
							 resultado = takeTest(PreguntasL3); 
							 
							 if (resultado ==1) {
								 System.out.println("Congratulations you have pass the third level\n\n If you want to continue press Y (Yes)?\n");
								 continuar = sc.nextLine();				
								 if (continuar.equalsIgnoreCase("Y")) {
									 resultado = takeTest(PreguntasL4);
									 if (resultado ==1) {
										 System.out.println("Congratulations you have pass the forth level\n\n If you want to continue press Y (Yes)?\n");
										 continuar = sc.nextLine();				
										 if (continuar.equalsIgnoreCase("Y")) {
											 resultado = takeTest(PreguntasL5);
											 System.out.println("**** Bravo! you have answer all the questions correctly ****");
										 }
									 }
								 }
							 }
						 }
					}
				
				}
		}		
	}

}
