

class Bike 
{
    public static void main(String[] args) 
    {
		//The bike's handle
		Handle bike_handle = new Handle("Aero bars", "Aluminum", true);
		
		//The bike's brake
		Brake bike_brake = new Brake("V-Brales", 15);
		
		//The bike's wheel type
		Wheel bike_wheel = new Wheel("Clincher");
		
		for (int i = 0; i < 20; i++)
		{
			System.out.println(bike_brake.attempt_brake());
		}
        
    }
}
