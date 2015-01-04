package codingToInterfaces;

import org.springframework.context.annotation.*;

@Configuration
public class CircleConfig {
	@Bean
	public Circle circle(){
		return new Circle();
	}
}
