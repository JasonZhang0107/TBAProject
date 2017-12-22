package game;

import java.util.Scanner;

import board.Board;
import characters.Character;
import characters.Player;
import rooms.CreateRandomRoom;
import rooms.Rooms;

public class startGame 
{
	public static void main (String[] args)
	{
		//creates player
		Character player1 = new Player(0, 0, 3);
		
		//Used to determine when the while loop stops to end game
		boolean gameWon = false;
		
		Rooms[][] roomArray;
		System.out.println();
		roomArray = new Rooms[5][5];
		for(int x=0; x<5; x++)
		{
			for(int y=0; y<5; y++)
			{
				roomArray[x][y] = CreateRandomRoom.randomRoom();
			}
		}
		
		Board.drawBoard(player1);
		
		System.out.println("Would you like the map to be randomized, yes or no");
		
		Scanner scan = new Scanner(System.in);
		
		String response = scan.nextLine();
		
		System.out.println("You have woken up and found yourself in a maze, there are many rooms to explore. Try to find your way out.");
		
		int num1 =(int) ((Math.random()*4)+1);
		int num2 =(int) ((Math.random()*4)+1);
		
		while(gameWon != true)
		{
			
			if(player1.checkGameEnd(player1.getX(), player1.getY(), response, num1, num2))
			{
				System.out.println("After a hard effort, you have finally managed to leave the maze.");
				gameWon = true;
				break;
			}
			else
			{
				System.out.println(roomArray[player1.getX()][player1.getY()].description());
				if(roomArray[player1.getX()][player1.getY()] instanceof RiddleRoom)
				{
					if(roomArray[player1.getX()][player1.getY()].riddleNum() == 1)
					{
						String question = "Mary’s father has 5 daughters – Nana, Nene, Nini, Nono. What is the fifth daughters name?";
						String answer = "Mary";
						
						System.out.println(question);
						
						boolean riddlePassed = false;
						
						while (riddlePassed == false)
						{
							Scanner riddle1 = new Scanner(System.in);
							String riddleAnswer = riddle1.nextLine();
							if(riddleAnswer.equals(answer))
							{
								riddlePassed = true;
								player1.setHealth(player1.getHealth() + 1);
								System.out.println("That is correct. You have gained 1 health for your correct answer. You may now leave the room.\nType a new direction to do so.");
								Scanner sc1 = new Scanner(System.in);
								
								String direction = sc1.nextLine();
								
								player1.characterMove(direction);
								
								Board.drawBoard(player1);
								break;
							}
							else
							{
								player1.setHealth(player1.getHealth() - 1);
								if(player1.dead(player1.getHealth()))
								{
									System.out.println("You have been killed in the room for giving too many wrong answers");
								}
								else
								{
									System.out.println("That is incorrect. You have taken 1 damage for the incorrect answer. " +player1.getHealth()+ " health left.\nTry again.");
								}
							}
						}
					}
					else if(roomArray[player1.getX()][player1.getY()].riddleNum() == 2)
					{
						String question = "What starts with a ‘P’, ends with an ‘E’ and has thousands of letters?";
						String answer = "The Post Office";
						
						System.out.println(question);
						
						boolean riddlePassed = false;
						
						while (riddlePassed == false)
						{
							Scanner riddle2 = new Scanner(System.in);
							String riddleAnswer = riddle2.nextLine();
							if(riddleAnswer.equals(answer))
							{
								riddlePassed = true;
								player1.setHealth(player1.getHealth() + 1);
								System.out.println("That is correct. You have gained 1 health for your correct answer. You may now leave the room.\nType a new direction to do so.");
								Scanner sc2 = new Scanner(System.in);
								
								String direction = sc2.nextLine();
								
								player1.characterMove(direction);
								
								Board.drawBoard(player1);
								break;
							}
							else
							{
								player1.setHealth(player1.getHealth() - 1);
								if(player1.dead(player1.getHealth()))
								{
									System.out.println("You have been killed in the room for giving too many wrong answers");
								}
								else
								{
									System.out.println("That is incorrect. You have taken 1 damage for the incorrect answer. " +player1.getHealth()+ " health left.\nTry again.");
								}
							}
						}
					}
					else if(roomArray[player1.getX()][player1.getY()].riddleNum() == 3)
					{
						String question = "How many months have 28 days?";
						String answer = "12";
						
						System.out.println(question);
						
						boolean riddlePassed = false;
						
						while (riddlePassed == false)
						{
							Scanner riddle3 = new Scanner(System.in);
							String riddleAnswer = riddle3.nextLine();
							if(riddleAnswer.equals(answer))
							{
								riddlePassed = true;
								player1.setHealth(player1.getHealth() + 1);
								System.out.println("That is correct. You have gained 1 health for your correct answer. You may now leave the room.\nType a new direction to do so.");
								Scanner sc3 = new Scanner(System.in);
								
								String direction = sc3.nextLine();
								
								player1.characterMove(direction);
								
								Board.drawBoard(player1);
								break;
							}
							else
							{
								player1.setHealth(player1.getHealth() - 1);
								if(player1.dead(player1.getHealth()))
								{
									System.out.println("You have been killed in the room for giving too many wrong answers");
								}
								else
								{
									System.out.println("That is incorrect. You have taken 1 damage for the incorrect answer. " +player1.getHealth()+ " health left.\nTry again.");
								}
							}
						}
					}
				}
				else
				{
					Scanner sc = new Scanner(System.in);
					
					String direction = sc.nextLine();
					
					player1.characterMove(direction);
					
					Board.drawBoard(player1);
				}
			}
		}
	}
}