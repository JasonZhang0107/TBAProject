package rooms;

public class RiddleRoom implements Rooms
{
	private int x;
	private int y;
	private boolean hasFound = false;
	
	public RiddleRoom(int x, int y)
	{
		this.x = x;
		this.y = y;
		
		int randomNum = (int)((Math.random()*3)+1);
		
		if(randomNum == 1)
		{
			this.question = "Mary’s father has 5 daughters – Nana, Nene, Nini, Nono. What is the fifth daughters name?";
			this.answer = "Mary";
		}
		if(randomNum == 2)
		{
			this.question = "What starts with a ‘P’, ends with an ‘E’ and has thousands of letters?";
			this.answer = "The Post Office";
		}
		if(randomNum == 3)
		{
			this.question = "How many months have 28 days?";
			this.answer = "12";
		}
	}
	public String roomType()
	{
		return "Riddle";
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
}