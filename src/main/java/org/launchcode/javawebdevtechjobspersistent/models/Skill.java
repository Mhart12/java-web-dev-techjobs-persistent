package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Field is required.")
    @Size(min=15, max=300)
    private String description;

    public Skill() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}