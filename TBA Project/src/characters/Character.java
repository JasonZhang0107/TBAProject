package characters;

public abstract class Character
{
	private int x;
	private int y;
	private int health;
	
	public Character(int x, int y, int health)
	{
		this.x = x;
		this.y = y;
		this.health = health;
	}
	/*
	 *Description: Updates user coordinates to move
	 *Parameters: Direction user wants to move in
	 *Returns: Prints the direction the user chose, also changes the object's coordinates appropriately
	 */
	public void characterMove(String direction)
	{
		if(direction.equals("up") && getX() != 0)
		{
			setX(getX() - 1);
			System.out.print("You have moved up.");
		}
		else if(direction.equals("down") && getX() != 4)
		{
			setX(getX() + 1);
			System.out.print("You have moved down.");
		}
		else if(direction.equals("left") && getY() != 0)
		{
			setY(getY() - 1);
			System.out.print("You have moved left.");
		}
		else if(direction.equals("right") && getY() != 4)
		{
			setY(getY() + 1);
			System.out.print("You have moved right.");
		}
		else
		{
			System.out.print("You have entered an invalid move, please try again");
		}
	}
	public int getX() 
	{
		return x;
	}
	public void setX(int x) 
	{
		this.x = x;
	}
	public int getY() 
	{
		return y;
	}
	public void setY(int y) 
	{
		this.y = y;
	}
	/*
	 *Description: Checks to see if the game has ended
	 *Parameters: X ad Y coordinates of the player object, user response to question
	 *Returns: True is user responded no, otherwise false
	 */
	public boolean checkGameEnd(int x, int y, String response, int num1, int num2) 
	{
		if(response.equals("no"))
		{
			if(x == 4 && y == 4)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			if(x == num1 && y == num2)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	/*
	 *Description: Checks to see if user object has health of 0
	 *Parameters: User object's health
	 *Returns: True is health is 0, false if not
	 */
	public boolean dead(int health)
	{
		if(health == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int getHealth()
	{
		return health;
	}
	public void setHealth(int health)
	{
		this.health = health;
	}
}
