package org.springframework.samples.petclinic.care;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.PetType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Care extends BaseEntity{

    @NotEmpty
    @Size(min = 5, max = 30)
    @Column(unique = true)
    String name;

    @NotEmpty
    @Column
    String description;

    @NotEmpty
    @ManyToMany(cascade = CascadeType.ALL)
    Set<PetType> compatiblePetTypes;

}
