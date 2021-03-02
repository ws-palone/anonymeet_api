package com.example.anonymeet_api.models;

import com.sun.istack.Nullable;

import javax.persistence.*;

@Entity(name = "Profile")
@Table(
        uniqueConstraints = {
                @UniqueConstraint(name = "profile_pseudo_unique", columnNames = "pseudo"),
                @UniqueConstraint(name = "profile_email_unique", columnNames = "email")
        }
)
public class Profile {

    @Id
    @SequenceGenerator(
            name = "profile_sequence",
            sequenceName = "profile_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "profile_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "email",
            nullable = false
    )
    private String email;

    @Column(
            name = "pseudo",
            nullable = false
    )
    private String pseudo;

    @Column(
            name = "age",
            nullable = false
    )
    private Integer age;

    @Column(
            name = "gender",
            nullable = false
    )
    private String gender;

    @Nullable
    private String interest_1, interest_2, interest_3, interest_4, interest_5;

    public Profile() {
    }

    public Profile(String email, String pseudo, Integer age, String gender, String interest_1, String interest_2, String interest_3){
        this.email = email;
        this.pseudo = pseudo;
        this.age = age;
        this.gender = gender;
        this.interest_1 = interest_1;
        this.interest_2 = interest_2;
        this.interest_3 = interest_3;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getInterest_1() {
        return interest_1;
    }

    public void setInterest_1(String interest_1) {
        this.interest_1 = interest_1;
    }

    public String getInterest_2() {
        return interest_2;
    }

    public void setInterest_2(String interest_2) {
        this.interest_2 = interest_2;
    }

    public String getInterest_3() {
        return interest_3;
    }

    public void setInterest_3(String interest_3) {
        this.interest_3 = interest_3;
    }

    public String getInterest_4() {
        return interest_4;
    }

    public void setInterest_4(String interest_4) {
        this.interest_4 = interest_4;
    }

    public String getInterest_5() {
        return interest_5;
    }

    public void setInterest_5(String interest_5) {
        this.interest_5 = interest_5;
    }
}
