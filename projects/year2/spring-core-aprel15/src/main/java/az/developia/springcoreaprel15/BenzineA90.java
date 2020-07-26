package az.developia.springcoreaprel15;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("benzineA90")
public class BenzineA90 extends Benzine {

	@Override
	public void firing() {
	System.out.println("i am firing a90");

	}

}
