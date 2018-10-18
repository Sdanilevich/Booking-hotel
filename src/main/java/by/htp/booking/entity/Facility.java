package by.htp.booking.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "facility")
public class Facility implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="nameEn")
    private String nameEn;

    public Facility(){}

    public Facility(String name){
        this.name = name;
    }
    public Facility(String name, String nameEn){
        this.name = name;
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

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return id == facility.id &&
                Objects.equals(name, facility.name)&&
                Objects.equals(nameEn, facility.nameEn);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, nameEn);
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
