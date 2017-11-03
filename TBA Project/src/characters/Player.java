package characters;

public class Player extends Character
{
	public Player(int x, int y, int health, int attackDamage) 
	{
		super(x, y, health, attackDamage);
	}
	public boolean checkGameEnd(int x, int y)
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
	public void characterMove(String direction)
	{
		if(direction.equals("up") && getX() != 0)
		{
			setX(getX() - 1);
		}
		if(direction.equals("down") && getX() != 4)
		{
			setX(getX() + 1);
		}
		if(direction.equals("left") && getY() != 0)
		{
			setY(getY() - 1);
		}
		if(direction.equals("right") && getY() != 4)
		{
			setY(getY() + 1);
		}
		else
		{
			System.out.print("You have entered an invalid move, please try again");
		}
	}
}
