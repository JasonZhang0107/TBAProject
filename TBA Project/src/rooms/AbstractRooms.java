package rooms;

public abstract class AbstractRooms 
{
	private int x;
	private int y;
	private boolean itemFound;
	private boolean monsterFound;
	private boolean playerFound;
	private String roomType;
	
	public AbstractRooms(int x, int y, boolean playerFound, boolean monsterFound, boolean itemFound, String roomType)
	{
		this.x = x;
		this.y = y;
		this.itemFound = itemFound;
		this.monsterFound = monsterFound;
		this.playerFound = playerFound;
	}
	public int returnX()
	{
		return x;
	}
}