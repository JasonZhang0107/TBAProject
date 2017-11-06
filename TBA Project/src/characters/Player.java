package characters;

public class Player extends Character
{
	public Player(int x, int y, int health) 
	{
		super(x, y, health);
	}
	/*
	 *Description: Allows the user to move on the map
	 *Parameters: User inputed direction they wish to go in, up, down, left, right
	 *Returns: New coordinates of the user depending on what direction they chose
	 */
	public void characterMove(String direction)
	{
		if(direction.equals("up") && getX() != 0)
		{
			setX(getX() - 1);
		}
		else if(direction.equals("down") && getX() != 4)
		{
			setX(getX() + 1);
		}
		else if(direction.equals("left") && getY() != 0)
		{
			setY(getY() - 1);
		}
		else if(direction.equals("right") && getY() != 4)
		{
			setY(getY() + 1);
		}
		else
		{
			System.out.print("You have entered an invalid move, please try again");
		}
	}
}
