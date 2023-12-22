package dto;

public class UserDto {
    final String firstName;
    final String lastName;
    final String email;

    public UserDto(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
