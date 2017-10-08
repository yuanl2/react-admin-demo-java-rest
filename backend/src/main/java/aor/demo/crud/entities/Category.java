package aor.demo.crud.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Where(clause="published=1")
@TableGenerator(name="category", initialValue=0, allocationSize=50)
public class Category {
    @Id @GeneratedValue(strategy=GenerationType.TABLE, generator="category")
    public int id;
    public String name;
    public boolean published = true;


    public Category() {}

    @JsonCreator
    public Category(int id) {
        this.id = id;
    }
}