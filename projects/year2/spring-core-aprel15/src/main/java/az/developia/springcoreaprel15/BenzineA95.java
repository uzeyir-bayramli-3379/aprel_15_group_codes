package az.developia.springcoreaprel15;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("benzineA95")
public class BenzineA95 extends Benzine {

	@Override
	public void firing() {
	System.out.println("i am firing a95");

	}

}
