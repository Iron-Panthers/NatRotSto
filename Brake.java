class Brake 
{
	//Init different variables for the object
    public String brake_type;
    
    //How strong of a break
    public int brake_stren;
    
    
    //Functions that tries to stop the bike
    public boolean attempt_brake()
    {
		if (brake_stren >= 10)
		{
			System.out.println("Brakes are working! Uses left: "+(brake_stren-10));
			brake_stren--;
			return true;
		}
		System.out.println("Oh no! Brakes are not working");
		return false;
	}
    
    public Brake(String type, int stren)
    {
		//Set values to initialized variables
		brake_type = type;
		
		brake_stren = stren;
	}
	
}
