package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Employer extends AbstractEntity {


    @NotBlank(message = "Field is required.")
    @Size(max = 50, message = "Brah this field can't take any more characters. Better think of cutting this down a smidge.")
    private String location;

    public Employer() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
