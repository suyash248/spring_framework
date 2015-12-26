package codingToInterfaces;

import org.springframework.context.annotation.*;

@Configuration
@Import(PointConfig.class) // Beans defined in PointConfig will be included, So total 4 beans ('pointA','pointB','pointC','triangle')
public class CircleConfig { // are available here.
	@Bean
	public Circle circle(){
		return new Circle();
	}
}
