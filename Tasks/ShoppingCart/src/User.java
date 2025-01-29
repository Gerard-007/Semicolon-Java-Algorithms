public abstract class User {
    private String name;
    private int age;
    private String email;
    private String phone;
    private Address address;
    private String password;

    public User(String name, int age, String email, String phone, Address address, String password) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.password = password;
    }
}
