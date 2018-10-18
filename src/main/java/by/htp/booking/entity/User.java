package by.htp.booking.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="login")
    private String login;
    @Column(name="password")
    private String password;

    public User(){}

    public User(String name, String login, String password, String email) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.email = email;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(name, user.name) &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password)&&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        int rez = 1;
        rez = rez*15 + rez*id;
        rez = rez*15 + (name==null ? 0: name.hashCode()) *rez;
        rez = rez*15 + (login==null ? 0: login.hashCode()) *rez;
        rez = rez*15 + (password==null ? 0: password.hashCode()) *rez;
        rez = rez*15 + (email==null ? 0: email.hashCode()) *rez;
        return rez;
    }
}
