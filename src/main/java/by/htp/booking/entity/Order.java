package by.htp.booking.entity;

import by.htp.booking.service.impl.ApartmentService;
import by.htp.booking.service.impl.HotelService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "`order`")
public class Order  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch=FetchType.LAZY, cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="userId")
    private User user;

    @ManyToOne(fetch=FetchType.LAZY, cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="apartmentId")
    private Apartment apartment;

    @Column(name = "beginDate")
    private long beginDate;

    @Column(name = "endDate")
    private long endDate;

    @Column(name = "countDay")
    private int countDay;

    @Column(name = "price")
    private double price;

    @Column(name = "total")
    private double total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public long getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(long beginDate) {
        this.beginDate = beginDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }

    public int getCountDay() {
        return countDay;
    }

    public void setCountDay(int countDay) {
        this.countDay = countDay;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getApartmentName(){

        return apartment.getName();
    }
    public String getApartmentNameEn(){
        return apartment.getNameEn();
    }
    public String getAddress(){
        return apartment.getHotel().getAddress();
    }
    public String getAddressEn(){
        return apartment.getHotel().getAddressEn();
    }

    public String getHotelName(){
        return apartment.getHotel().getName();
    }
    public String getHotelNameEn(){
        return apartment.getHotel().getNameEn();
    }

    public String getBeginDateFormat(){
        Date date = new Date(beginDate);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        return dateFormat.format(date);
    }

    public String getEndDateFormat(){
        Date date = new Date(endDate);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        return dateFormat.format(date);
    }

    public int getCountGuest(){
        return apartment.getCountGuest();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id &&
                user.equals(order.user) &&
                apartment.equals(order.apartment) &&
                countDay == order.countDay &&
                Double.compare(order.price, price) == 0 &&
                Double.compare(order.total, total) == 0 &&
                Objects.equals(beginDate, order.beginDate) &&
                Objects.equals(endDate, order.endDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, user, apartment, beginDate, endDate, countDay, price, total);
    }
}
