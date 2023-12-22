package models;

public class UserDetail {
    final String id;
    final String firstName;
    final String lastName;
    final String email;


    public UserDetail(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("id: ").append(id);
        builder.append(" name: ").append(firstName).append(" ").append(lastName);
        if (email != null) builder.append(" email: ").append(email);
        return builder.toString();
    }
}
