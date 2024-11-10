package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

@Entity
public class Skill extends AbstractEntity {

    @NotNull
    @Size(min=5, max=255, message="Description must be between 5 and 255 characters.")
    private String description;

    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
