package board;

import characters.Character;

public class Board 
{
	public static void drawBoard(Character player1)
	{
		for(int x=0; x<5; x++)
		{
			System.out.println();
			for(int y=0; y<5; y++)
			{
				if(player1.getX() == x && player1.getY() == y)
				{
					System.out.print("[  X  ]");
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
