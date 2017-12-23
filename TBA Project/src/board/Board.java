package board;

import characters.Character;
import rooms.Rooms;

public class Board 
{
	private static Rooms[][] map;
	private Character player1;
	private int num1;
	private int num2;
	
	//Default constructor
	public Board(Character player1)
	{
		this.player1 = player1;
		this.num1 = 5;
		this.num2 = 5;
		this.map = map;
	}
	//overloaded constructor 1
	public Board(Character player1, int num1, int num2)
	{
		this.player1 = player1;
		this.num1 = num1;
		this.num2 = num2;
		this.map = map;
	}
	//overloaded constructor 2
	public Board(Character player1, int num1, int num2, Rooms[][] newMap)
	{
		this.player1 = player1;
		this.num1 = num1;
		this.num2 = num2;
		this.map = newMap;
	}
	/*
	public Room[][] getMap()
	{
		return map;
	}
	public void setMap(Room[][] map)
	{
		this.map = map;
	}
	public void printMap()
	{
		for(int j=0; j<map.length; j++)
		{
			for(int i=0; i<map[0].length; i++)
			{
				map[j][i].print();
			}
			System.out.println();
		}
	}
	*/
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
	//Overloaded method that takes parameters for how big to make the board
	public static void drawBoard(Character player1, int num1, int num2)
	{
		for(int x=0; x<num1; x++)
		{
			System.out.println();
			for(int y=0; y<num2; y++)
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
	//Overloaded method that takes parameters to make the board random
	public static void drawBoard(Character player1, String yesOrNo)
	{
		int num1 = (int) ((Math.random()*6)+1);
		int num2 = (int) ((Math.random()*6)+1);
		
		if(yesOrNo.equals("yes"))
		{
			for(int x=0; x<num1; x++)
			{
				System.out.println();
				for(int y=0; y<num2; y++)
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
		else
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
}
