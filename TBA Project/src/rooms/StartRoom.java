package rooms;

public class StartRoom
{
	private int x;
	private int y;
	public boolean hasFound = true;
	
	public StartRoom(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public String roomType()
	{
		return "Start";
	}
	public String roomID()
	{
		return "S";
	}
	public void hasFound()
	{
		hasFound = true;
	}
	public void print()
	{
		if(hasFound == false)
		{
			System.out.print("[     ]");
		}
		else
		{
			System.out.print("[  X  ]");
		}
	}
	public String description()
	{
		return "This is where you begin your journey.\n Type a direction to move.";
	}
}
