package rooms;

public abstract class roomsAbstractClass 
{
	private int x;
	private int y;
	private boolean goLeft;
	private boolean goRight;
	private boolean goUp;
	private boolean goDown;
	private boolean itemFound;
	private boolean monsterFound;
	private boolean playerFound;
	
	public roomsAbstractClass(int x, int y, boolean goLeft, boolean goRight, boolean goUp, boolean goDown, boolean itemFound, boolean monsterFound, boolean playerFound)
	{
		this.x = x;
		this.y = y;
		this.goLeft = goLeft;
		this.goRight = goRight;
		this.goUp = goUp;
		this.goDown = goDown;
		this.itemFound = itemFound;
		this.monsterFound = monsterFound;
		this.playerFound = playerFound;
	}
}