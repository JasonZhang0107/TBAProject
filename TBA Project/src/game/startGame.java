package game;

import java.util.Scanner;

import characters.Character;
import characters.Player;
import rooms.CreateRandomRoom;
import rooms.NormalRoom;
import rooms.Rooms;
import characters.Character;
import characters.Player;

public class startGame 
{
	public static void main (String[] args)
	{
		//creates player
		Character player1 = new Player(0, 0, 100, 10);
		
		String response = "";
		
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
		while(gameWon != true)
		{
			if(player1.checkGameEnd(player1.getX(), player1.getY()))
			{
				System.out.println("Congrats you have finished the game");
				break;
			}
			else
			{
				System.out.print("Please choose a direction to go\n--------------------------------------\n");
				
				Scanner sc = new Scanner(System.in);
				
				String direction = sc.nextLine();
				
				player1.characterMove(direction);
			}
			for(int x=0; x<5; x++)
			{
				System.out.println();
				for(int y=0; y<5; y++)
				{
					if(player1.getX() == x && player1.getY() == y)
					{
						System.out.print("[  Y  ]");
					}
					else
					{
						System.out.print("[     ]");
					}
				}
				System.out.print("\n");
			}
		}
	}
}