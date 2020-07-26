package az.developia.springcoreaprel15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="mersedes")
public class Mercedes extends Car {
	@Autowired
	@Qualifier("benzineA95")
	private Benzine benzine;
	
	@Override
	public void driving() {
		 System.out.println("i am mercedes");
		 benzine.firing();
	}

}
