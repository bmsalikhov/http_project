package views;

import domain.ReceiverService;

import java.util.Scanner;

public class CreateUserAppView extends AppView {
    public CreateUserAppView(ReceiverService service) {
        super("Create User", service);
    }

    @Override
    public void showView() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the first name: ");
        String firstName = scanner.nextLine();
        System.out.print("enter the last name: ");
        String lastName = scanner.nextLine();
        System.out.print("enter the email: ");
        String email = scanner.nextLine();
        service.createUser(firstName, lastName, email);
    }
}
