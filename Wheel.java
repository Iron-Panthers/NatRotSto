class Wheel 
{
	//Init different variables for the object
    public String wheel_type;
    
    //Is the wheel spinning?
    private boolean is_wheel_spinning;
    
    
    // Make the bike start spinning
    public void start_spinning()
    {
		System.out.println("Wheel has started spinning!");
		is_wheel_spinning = true;
	}
	
	
	// Action to stop the bike from spinning
	public void stop_spinning()
    {
		System.out.println("Wheel has stopped spinning!");
		is_wheel_spinning = false;
	}
	
	
    // Add a check for if the bike is actually spinning
    public boolean is_spinning()
    {
		if (is_wheel_spinning)	System.out.println("This wheel is actually spinning");
		else 	System.out.println("Oh well. This wheel isn't actually spinning.");
		return is_wheel_spinning;
	}
    
    public Wheel(String type)
    {
		//Set values to initialized variables
		wheel_type = type;
		
		is_wheel_spinning = true;
		
	}
	
	
}
