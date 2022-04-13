import java.util.Random;
public abstract class AccountHolder {
	protected int ID;
	protected String address;
	
	public AccountHolder (int ID, String address) 
	{
		this.ID = ID;
		this.address = address;
	}
	public int getNextID()
	{
		return new Random().nextInt(1000001);
		
	}
	

}
