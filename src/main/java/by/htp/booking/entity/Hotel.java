package by.htp.booking.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "hotel")
public class Hotel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "address")
    private String address;
    @Column(name = "nameEn")
    private String nameEn;
    @Column(name = "descriptionEn")
    private String descriptionEn;
    @Column(name = "addressEn")
    private String addressEn;


    @ManyToOne(fetch=FetchType.LAZY, cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="cityId")
    private City city;

    public Hotel(){}

    public Hotel(String name,String description, String address){
        this.name = name;
        this.description = description;
        this.address = address;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getAddressEn() {
        return addressEn;
    }

    public void setAddressEn(String addressEn) {
        this.addressEn = addressEn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return id == hotel.id &&
                city == hotel.city &&
                Objects.equals(name, hotel.name)&&
                Objects.equals(description, hotel.description);
    }

    @Override
    public int hashCode() {
        int rez = 1;
        rez = rez*15 + rez*id;
        rez = rez*15 + (name==null ? 0: name.hashCode()) *rez;
        rez = rez*15 + (nameEn==null ? 0: nameEn.hashCode()) *rez;
        rez = rez*15 + (description==null ? 0: description.hashCode()) *rez;
        rez = rez*15 + (descriptionEn==null ? 0: descriptionEn.hashCode()) *rez;
        rez = rez*15 + (city==null ? 0: city.hashCode()) *rez;
        rez = rez*15 + (address==null ? 0: address.hashCode()) *rez;
        rez = rez*15 + (addressEn==null ? 0: addressEn.hashCode()) *rez;
        return rez;    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city=" + city +
                ", address='" + address + '\'' +
                '}';
    }
}
