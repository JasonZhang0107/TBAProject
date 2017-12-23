package game;

import java.util.Scanner;

import board.Board;
import characters.Character;
import characters.Player;
import rooms.CreateRandomRoom;
import rooms.RiddleRoom;
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
		
		int row = 3;
		int column = 3;
		roomArray = new Rooms[row][column];
		
		for(int x=0; x<row; x++)
		{
			for(int y=0; y<column; y++)
			{
				roomArray[x][y] = CreateRandomRoom.randomRoom(x, y);
			}
		}
		
		//Constructor that takes in parameters for size of board
		//Board.drawBoard(player1, row, column);
		
		//Constructor that draws a default board of row and column 5
		//Board.drawBoard(player1);
		
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
						//prints the question on screen
						System.out.println(roomArray[player1.getX()][player1.getY()].question());
						
						//check to see if riddle has been false, initially it is false
						boolean riddlePassed = false;
						
						while (riddlePassed == false)
						{
							Scanner riddle1 = new Scanner(System.in);
							String riddleAnswer = riddle1.nextLine();
							if(riddleAnswer.equals(roomArray[player1.getX()][player1.getY()].answer()))
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