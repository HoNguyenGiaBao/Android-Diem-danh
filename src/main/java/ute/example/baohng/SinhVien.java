package ute.example.baohng;

public class SinhVien {
    private String name, age, email, phone, svClass;

    public SinhVien(){
    }
    public SinhVien(String name, String age, String email, String phone, String svClass){
        this.name = name;
        this.name = age;
        this.name = email;
        this.name = phone;
        this.svClass = svClass;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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

    public String getSvClass() {
        return svClass;
    }

    public void setSvClass(String svClass) {
        this.svClass = svClass;
    }
}
