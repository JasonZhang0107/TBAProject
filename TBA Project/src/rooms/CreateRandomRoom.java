package rooms;

import rooms.Rooms;
public class CreateRandomRoom
{
	/*
	 * Description: Creates an object to be inputed into my 2 dimensional array
	 * Parameters: None
	 * Return: An object that is defined by RiddleRoom or NormalRoom
	 */
	public static Rooms randomRoom(int x, int y)
	{
		int randomNum1 = (int)((Math.random()*5)+1);
		
		if(randomNum1 == 1)
		{
			return new RiddleRoom(x, y);
		}
		return new NormalRoom(x, y);
	}
}
