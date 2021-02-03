package org.launchcode.javawebdevtechjobspersistent.models;

import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message = "Field is required.")
    @Size(max = 100, message = "Brah this field can't take any more characters. Better think of cutting this down a smidge.")
    private String name;

    /**
     * Each (subclass)(child)(or any class extending AbstractEntity) will inherit the 'name' field*/
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}