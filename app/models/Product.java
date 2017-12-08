package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Product extends Model {

// Properties
@Id
private Long id;
@Constraints.Required
private String name;
@Constraints.Required
private String description;
@Constraints.Required
private int stock;
@Constraints.Required
private double price;

// Default Constructor

public Product() {

}

// Constructor to initialise object

public Product(Long id, String name, String description, int stock, double price) {

this.id = id;

this.name = name;

this.description = description;

this.stock = stock;

this.price = price;

}

public static final Finder<Long, Product> find = new Finder<>(Product.class);


public static final List<Product> findAll(){
    return Product.find.all();
}

// Accessor methods

public Long getId() {

return id;

}

public void setId(Long id) {

this.id = id;

}

public String getName() {

return name;

}

public void setName(String name) {

this.name = name;

}

public String getDesc() {
    
    return description;
    
    }
    
    public void setDesc(String description) {
    
    this.description = description;
    
    }

    public int getStock() {
        
        return stock;
        
        }
        
        public void setStock(int stock) {
        
        this.stock = stock;
        
        }

        public double getPrice() {
            
            return id;
            
            }
            
            public void setPrice(double price) {
            
            this.price = price;
            
            }

} 