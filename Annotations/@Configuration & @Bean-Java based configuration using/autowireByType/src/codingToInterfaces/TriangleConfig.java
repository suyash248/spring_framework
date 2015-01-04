package codingToInterfaces;

import org.springframework.context.annotation.*;

@Configuration
public class TriangleConfig {
	@Bean
	public Triangle triangle(){
		return new Triangle();
	}
}
