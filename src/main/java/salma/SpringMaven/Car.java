package salma.SpringMaven;

import org.springframework.stereotype.Component;

@Component
public class Car  implements Vehicle{
	
	public void drive() {
		System.out.println("Successfully driving car...");
	}
}
