package models;

public class UserDetail {
    final String id;
    final String firstName;
    final String lastName;
    final String email;


    public UserDetail(String id, String title, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "id: " + id +
                " name: " + firstName +
                " " + lastName +
                email != null ? " email: " + email : "";
    }
}
