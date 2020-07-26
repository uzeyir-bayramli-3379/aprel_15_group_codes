package az.developia.springcoreaprel15;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Product {
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@PostConstruct
public void initial(){
	System.out.println("burada Product sinifinden obyekt yarandiqdan sonra lazim olan islernisi gore bilersiz");
}


@PreDestroy
public void destroy(){
	System.out.println("isler bitdi bazani bagla, fayllari bagla");
}


}
