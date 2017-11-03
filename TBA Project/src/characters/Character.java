package characters;

public abstract class Character
{
	private int x;
	private int y;
	private int health;
	private int attackDamage;
	
	public Character(int x, int y, int health, int attackDamage)
	{
		this.x = x;
		this.y = y;
		this.health = health;
		this.attackDamage = attackDamage;
	}
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
	public boolean checkGameEnd(int x2, int y2) 
	{
		if(x2 == 4 && y2 == 4)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
