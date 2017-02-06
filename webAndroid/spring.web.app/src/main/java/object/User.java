package object;

public class User 
{
	private final int id;
	
	public User(int id)
	{
		System.out.println("User, id = " + id);
		
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
}
