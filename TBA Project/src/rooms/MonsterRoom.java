package rooms;

public class MonsterRoom implements Rooms
{
	private int x;
	private int y;
	private boolean hasFound = false;
	private String monster;
	
	public MonsterRoom(String monster)
	{
		this.x = x;
		this.y = y;
		this.monster = monster;
	}
	public String roomType()
	{
		return "Monster";
	}
	public String roomID()
	{
		return "M";
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
			System.out.print("[  M  ]");
		}
	}
	public String description()
	{
		return "You have entered a new room, it is a monster room.\nType another direction";
	}
	public String monsterName()
	{
		return monster;
	}
}