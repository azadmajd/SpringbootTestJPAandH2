package ir.dataplatform.springbootjpasampleh2.model;

import javax.persistence.*;

@Entity
public class Phonebook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "phone_number")
    private String phoneNumber;

    public Phonebook(String fullname, String phoneNumber) {
        this.fullname = fullname;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
