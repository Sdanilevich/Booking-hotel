package by.htp.booking.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name="apartment")
public class Apartment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="nameEn")
    private String nameEn;

    @Column(name="description")
    private String description;

    @Column(name="descriptionEn")
    private String descriptionEn;

    @Column(name="roomSize")
    private double roomSize;

    @Column(name="countGuest")
    private int countGuest;

    @ManyToOne(fetch=FetchType.LAZY, cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="hotelId")
    private Hotel hotel;

    @Column(name = "price")
    private double price;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "apartmentfacility", joinColumns = { @JoinColumn(name = "apartmentId") }, inverseJoinColumns = { @JoinColumn(name = "facilityId") })
    private Set<Facility> facilities = new HashSet<Facility>(0);


    public Apartment(){}
    public Apartment(String name, String description,
                     int countGuest, double roomSize, double price){
        this.name = name;
        this.description = description;
        this.countGuest = countGuest;
        this.roomSize = roomSize;
        this.price = price;
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

    public int getCountGuest() {
        return countGuest;
    }

    public void setCountGuest(int countGuest) {
        this.countGuest = countGuest;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(double roomSize) {
        this.roomSize = roomSize;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Set<Facility> getFacilities() {
        return this.facilities;
    }

    public void setFacilities(Set<Facility> facilities) {
        this.facilities = facilities;
    }

    public String getAddress(){
//        if (hotelId!=0) {
//            Hotel hotel = hotelService.getHotelById(hotelId);
//            if (hotel != null) {
//                return hotel.getAddress();
//            }
//            return "";
//        }
        return "";
    }

    public String getAddressEn(){
//        if (hotelId!=0) {
//            Hotel hotel = hotelService.getHotelById(hotelId);
//            if (hotel != null) {
//                return hotel.getAddressEn();
//            }
//            return "";
//        }
        return "";
    }

    public String getHotelName(){
//        if (hotelId!=0) {
//            Hotel hotel = hotelService.getHotelById(hotelId);
//            if (hotel != null) {
//                return hotel.getName();
//            }
//            return "";
//        }
        return "";
    }

    public String getHotelNameEn(){
//        if (hotelId!=0) {
//            Hotel hotel = hotelService.getHotelById(hotelId);
//            if (hotel != null) {
//                return hotel.getNameEn();
//            }
//            return "";
//        }
        return "";
    }



    public List<Facility> getListFacility(){

        //return apartmentFacilityService.getListFacilityForApartment(id);
        return null;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object){
            return true;
        }
        if (object == null ){
            return false;
        }
        if(getClass() != object.getClass()){
            return false;
        }
        Apartment apartment = (Apartment) object;
        return this.id == apartment.id &&
                this.hotel.equals(apartment.hotel) &&
                this.roomSize == apartment.roomSize &&
                this.countGuest == apartment.countGuest &&
                Double.compare(apartment.price, this.price) == 0 &&
                apartment.name.equals(this.name) &&
                apartment.description.equals(this.description)&&
                apartment.nameEn.equals(this.nameEn) &&
                apartment.descriptionEn.equals(this.descriptionEn);
    }

    @Override
    public int hashCode() {
        int rez = 1;
        rez = rez*15 + rez*id;
        rez = rez*15 + (name==null ? 0: name.hashCode()) *rez;
        rez = rez*15 + (nameEn==null ? 0: nameEn.hashCode()) *rez;
        rez = rez*15 + (description==null ? 0: description.hashCode()) *rez;
        rez = rez*15 + (descriptionEn==null ? 0: descriptionEn.hashCode()) *rez;
        rez = rez*15 + rez*(int)roomSize;
        rez = rez*15 + rez*countGuest;
        rez = rez*15 + (hotel==null ? 0: hotel.hashCode()) *rez;
        rez = rez*15 + rez*(int)price;
        return rez;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", roomSize=" + roomSize +
                ", countGuest=" + countGuest +
                ", hotel=" + hotel +
                ", price=" + price +
                '}';
    }
}
