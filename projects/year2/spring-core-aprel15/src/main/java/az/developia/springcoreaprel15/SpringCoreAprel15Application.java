package az.developia.springcoreaprel15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
// config
// comp scan
// enab auto cong
public class SpringCoreAprel15Application {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringCoreAprel15Application.class, args);
		//Product p = (Product) appContext.getBean("product");
		//p.setName("apple");
		//System.out.println(p.getName());

		//Product p1 = (Product) appContext.getBean("product");

		//System.out.println(p1.getName());

		// Spring application context
		// ioc
		// DI

		// bean, component
		
		
		BMW bmw = (BMW) appContext.getBean("BMW");
		
		bmw.driving();
	
		
BMW bmw2 =   appContext.getBean(BMW.class);
		
		bmw2.driving();
	
		
		
		
		Mercedes mercedes = (Mercedes) appContext.getBean("mersedes");
		
		mercedes.driving();
		
		System.out.println(appContext.containsBean("mersedes"));
		String[] beans=appContext.getBeanDefinitionNames();
		System.out.println("-----------------------------");
		for (String bean : beans) {
			System.out.println(bean);
		}
		System.out.println("-----------------------------");
		
		
		System.out.println(beans.length);
		
		
		
		
	}

}
