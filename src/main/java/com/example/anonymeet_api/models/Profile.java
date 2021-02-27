package com.example.anonymeet_api.models;

import java.util.List;

public class Profile {

    private Integer id;
    private String pseudo;
    private Integer age;
    private String gender;
    private List<Interest> insterests;

    public Profile() {
    }

    public Profile(Integer id, String pseudo, Integer age, String gender, List<Interest> insterests) {
        this.id = id;
        this.pseudo = pseudo;
        this.age = age;
        this.gender = gender;
        this.insterests = insterests;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Interest> getInsterests() {
        return insterests;
    }

    public void setInsterests(List<Interest> insterests) {
        this.insterests = insterests;
    }
}
