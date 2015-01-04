package codingToInterfaces;

import org.springframework.context.annotation.*;

@Configuration
public class PointConfig {

	@Bean
	public Point pointA(){
		return new Point(10,20);
	}
	@Bean
	public Point pointB(){
		return new Point(40,50);
	}
	@Bean
	public Point pointC(){
		return new Point(70,80);
	}
}
