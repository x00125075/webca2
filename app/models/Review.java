package models;

import java.util.*;


import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity

public class Review extends Model{

    @Id
    private Long id;
    private String name;
    @Constraints.Required
    private String review;

    public Review(){

    }

    public Review(Long id, String name, String review){
        this.id = id;
        this.name = name;
        this.review = review;
    }

    public static Finder<Long,Review> find = new Finder<Long,Review>(Review.class);

    public static List<Product> findAll() {
        return Product.find.all();
    }

    public Long getID(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getName(){
        return name;
    }

    public void setId(String name){
        this.name = name;
    }

    public Long getReview(){
        return review;
    }

    public void setReview(String review){
        this.review = review;
    }


}
