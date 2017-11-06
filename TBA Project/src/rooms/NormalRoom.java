package rooms;

public class NormalRoom implements Rooms
{
	private int x;
	private int y;
	public boolean hasFound = false;
	
	public NormalRoom()
	{
		this.x = x;
		this.y = y;
	}
	public String roomType()
	{
		return "Normal";
	}
	public String roomID()
	{
		return "N";
	}
	public void hasFound()
	{
		hasFound = true;
	}
	public void print()
	{
		if(hasFound == true)
		{
			System.out.print("[  NormalRoom  ]");
		}
	}
	public String description()
	{
		return "You have entered a new room, it is empty.\nType a direction to go in.";
	}
	public int riddleNum()
	{
		return 0;
	}
}
