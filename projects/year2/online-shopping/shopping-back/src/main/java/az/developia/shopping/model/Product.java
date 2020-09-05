package az.developia.shopping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
	@Size(min=2,max=30,message="mehsulun adi 2 - 30 simvol ola biler")
private String name;
	@NotNull(message="qiymeti bos qoymaq olmaz")
	@Max(value=1000,message="qiymet maksimum 1000 ola biler")
	@Min(value=0,message="qiymet minimum 0 ola biler")
private Double price;
private String image;
private String description;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
 

}
