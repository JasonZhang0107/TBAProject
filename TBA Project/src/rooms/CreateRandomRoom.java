package rooms;

import rooms.Rooms;
public class CreateRandomRoom
{
	public static Rooms randomRoom()
	{
		int randomNum1 = (int)((Math.random()*10)+1);
		
		if(randomNum1 == 1)
		{
			return new MonsterRoom("dragon");
		}
		
		return new NormalRoom();
	}
}
