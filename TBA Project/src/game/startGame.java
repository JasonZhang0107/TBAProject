package game;

import java.util.Scanner;

import characters.Character;
import characters.Player;
import rooms.CreateRandomRoom;
import rooms.NormalRoom;
import rooms.Rooms;

public class startGame 
{
	public static void main (String[] args)
	{
		
		drawMap();
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
			//string for response
			String response = "";
			
			//creates player
			Character player1 = new Player(0, 0, 100, 10);
			
			for(int x=0; x<5; x++)
			{
				System.out.println();
				for(int y=0; y<5; y++)
				{
					if(player1.getX() == x && player1.getY() == y)
					{
						System.out.print("[  Y  ]");
					}
					System.out.print("[  X  ]");
				}
				System.out.print("\n");
			}
			
			if(player1.checkGameEnd(player1.getX(), player1.getY()))
			{
				response = ("Congrats you have finished the game");
			}
			else
			{
				System.out.print("Please choose a direction to go\n--------------------------------------\n");
				
				Scanner sc = new Scanner(System.in);
				
				String direction = sc.nextLine();
				
				player1.characterMove("direction");
			}
		}
	}
	public static void drawMap()
	{
	/*
	 * for(int x=0; x<5; x++)
		{
			for(int y=0; y<5; y++)
			{
				if(player1.getX == x && player1.getY == y)
				{
					System.out.print("[  Y  ]");
				}
				System.out.print("[  X  ]");
			}
			System.out.print("\n");
		}
	 */
	}
}
