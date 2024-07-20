package model;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private String email;
    private String phone;
    private LocalDate localDate;

    public Person() {
    }

    public Person(String name, String email, String phone, LocalDate localDate) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.localDate = localDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return ", Tên: " + name
                + ", Email: " + email
                + ", Số điện thoại: " + phone
                + ", Ngày sinh: " + localDate;
    }

}
