package in.ineuron.Game;
import java.util.*;
	class guesser{
		int guessNum;

	int guess() {
		guessNum=(int)(Math.random()*10);
		
		return guessNum;
		}
	}
	class player{
		int playerNum;
		int guess() {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the player guesse Number");
			playerNum=s.nextInt();
		return playerNum;
		

		}
	}
	class empire{
		int guessNum1;
		int playerNum1;
		int playerNum2;
		int playerNum3;
		
		void guessingbyguesser()
		{
			while(true) {
			guesser guess=new guesser();
		
			guessNum1=guess.guess();
		
			player p1=new player();
			player p2=new player();
			player p3=new player();
		
			playerNum1=p1.guess();
		
			playerNum2=p2.guess();
			
			playerNum3=p3.guess();
			
			 if(guessNum1==playerNum1) {
				 if(guessNum1==playerNum1&&guessNum1==playerNum2&&guessNum1==playerNum3) {
						System.out.println("all players are winners");
					}
					else if(guessNum1==playerNum1&&guessNum1==playerNum2) {
						System.out.println("player 1 & 2  are winners");
					}
					else {
				System.out.println("player 1 is winner");
					}
				 System.out.println("The Number is "+ guessNum1);
				 break;
			}
			else if (guessNum1==playerNum2) {
				if(guessNum1==playerNum2&&guessNum1==playerNum3)
				System.out.println("player 2 & 3 are winners");
				
				else {
					System.out.println("player 2 is winner");
					
				}
				 System.out.println("The Number is "+ guessNum1);
				break;
			}
			else if(guessNum1==playerNum3) {
				System.out.println("player 3 is winner");
				 System.out.println("The Number is "+ guessNum1);
				break;
			}
			 if(guessNum1!=playerNum1&&guessNum1!=playerNum2&&guessNum1!=playerNum3) {
				System.out.println("ALL ARE LOST!!  PLAY AGAIN");
			 }
			 System.out.println("The Number is "+ guessNum1);
			}
	}

	}

	public class Game{

		public static void main(String[] args) {
			
			empire E=new empire();
			E.guessingbyguesser();
			}
	 }	
