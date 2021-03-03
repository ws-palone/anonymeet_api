package com.example.anonymeet_api.models;

import javax.persistence.*;

@Entity(name = "Interest")
@Table(
        uniqueConstraints = {
            @UniqueConstraint(name = "interest_name_unique", columnNames = "name")
        }
)
public class Interest {

    @Id
    @SequenceGenerator(
            name = "interest_sequence",
            sequenceName = "interest_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "interest_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Integer id;

    @Column(
            name = "name",
            nullable = false
    )
    private String name;

    public Interest (){
    }

    public Interest (String name){
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
