package by.htp.booking.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="country")
public class Country  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="nameEn")
    private String nameEn;

    public Country(){}

    public Country(String name){
        this.name = name;
    }
    public Country(String name, String nameEn){
        this.name = name;
        this.nameEn = nameEn;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null){
            return false;
        }
        if(getClass() != o.getClass()){
            return false;
        }
        Country country = (Country) o;
        if (id != country.id){
            return false;
        }
        if (!name.equals(country.name)){
            return false;
        }

        if (!nameEn.equals(country.nameEn)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int rez = 1;
        rez = rez*15 + rez*id;
        rez = rez*15 + (name==null ? 0: name.hashCode()) *rez;
        rez = rez*15 + (nameEn==null ? 0: nameEn.hashCode()) *rez;
        return rez;    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
