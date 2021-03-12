package com.example.anonymeet_api.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.Nullable;
import org.hibernate.annotations.Tables;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

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
            nullable = true
    )
    private String pseudo;

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(
            name = "age",
            nullable = true
    )
    private Date age;

    @Column(
            name = "gender",
            nullable = true
    )
    private String gender;

    @Column(
            name = "gender_orientation",
            nullable = true
    )
    private String genderOrientation;

    @Nullable
    private String interest_1, interest_2, interest_3, interest_4, interest_5;

    @Column(
            name = "longitude",
            nullable = true
    )
    private Double longitude;

    @Column(
            name = "latitude",
            nullable = true
    )
    private Double latitude;

    @Column(
            name = "image",
            nullable = true
    )
    private String image;

    public Profile() {
    }

    public Profile(String email, String pseudo, Date age, String gender, String genderOrientation, String image, String interest_1, String interest_2, String interest_3, Double longitude, Double latitude){
        this.email = email;
        this.pseudo = pseudo;
        this.age = age;
        this.gender = gender;
        this.genderOrientation = genderOrientation;
        this.image = image;
        this.interest_1 = interest_1;
        this.interest_2 = interest_2;
        this.interest_3 = interest_3;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
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

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenderOrientation() {
        return genderOrientation;
    }

    public void setGenderOrientation(String genderOrientation) {
        this.genderOrientation = genderOrientation;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
