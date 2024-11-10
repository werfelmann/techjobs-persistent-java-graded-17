package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @Size(min=5, max=100, message="Location must be between 5 and 100 characters.")
    private String location;

    @OneToMany(mappedBy = "employer")
    private final List<Job> jobs = new ArrayList<>();

    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(@NotEmpty @Size(max=100) String location) {
        this.location = location;
    }
}
