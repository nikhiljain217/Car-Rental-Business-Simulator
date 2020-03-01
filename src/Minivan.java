
public class Minivan extends Car {

	public Minivan(String licenseId,String name)
	{
		this.licenseId=licenseId;
		this.name = name;
		this.rent = 120;
	}
	
	@Override
	public int getRent(int days) {
		return rent*days;
	}
	
	public String getDescription()
	{
		return this.name;
	
	}
}
