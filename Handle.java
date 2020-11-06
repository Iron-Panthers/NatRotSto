class Handle 
{
	/*Init different variables for the object*/
	
	//Type of handle
    public String handle_type;
    
    //Material of the handle
    public String handle_material;
    
    //Whether the handle has a grip
    public boolean has_grip;
    
    public Handle(String type, String mat, boolean grip)
    {
		//Set values to initialized variables
		handle_type = type;

		handle_material = mat;

		has_grip = grip;
	}
	
}
