package models;

import java.util.*;
import javax.persistance.*;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Product extends Model{

public class Review {

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
}