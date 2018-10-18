package by.htp.booking.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "city")
public class City implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="nameEn")
    private String nameEn;
    @ManyToOne(fetch=FetchType.LAZY, cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="countryId")
    private Country country;

    public City(){}

    public City(String name){
        this.name = name;
    }

    public City(String name, String nameEn){
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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null){
            return  false;
        }
        if(getClass() != o.getClass()){
            return false;
        }
        City city = (City) o;
        if (id != city.id){
            return false;
        }
        if (!country.equals(city.country)){
            return false;
        }
        if (!name.equals(city.name)){
            return false;
        }

        if (!nameEn.equals(city.nameEn)){
            return false;
        }
        return  true;
    }

    @Override
    public int hashCode() {
        int rez = 1;
        rez = rez*15 + rez*id;
        rez = rez*15 + (name==null ? 0: name.hashCode()) *rez;
        rez = rez*15 + (nameEn==null ? 0: nameEn.hashCode()) *rez;
        rez = rez*15 + (country==null ? 0: country.hashCode()) *rez;
        return rez;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                '}';
    }
}
