package rooms;

public class RiddleRoom implements Rooms
{
	private int x;
	private int y;
	private boolean hasFound = false;
	
	public RiddleRoom()
	{
		this.x = x;
		this.y = y;
	}
	public String roomType()
	{
		return "Riddle";
	}
	public String roomID()
	{
		return "R";
	}
	public void hasFound()
	{
		hasFound = true;
	}
	public void print()
	{
		if(hasFound == false)
		{
			System.out.print("[  RiddleRoom  ]");
		}
	}
	public String description()
	{
		return "You have entered a new room, this is the room of riddles. You must answer the riddle correctly in order to proceed.";
	}
	public int riddleNum()
	{
		return (int)((Math.random()*3)+1);
	}
}