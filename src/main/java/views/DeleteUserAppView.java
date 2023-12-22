package views;

import domain.ReceiverService;

import java.util.Scanner;

public class DeleteUserAppView extends AppView {
    public DeleteUserAppView(ReceiverService service) {
        super("Deleting user", service);
    }

    @Override
    public void showView() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the user id: ");
        String userId = scanner.nextLine();
        service.deleteUser(userId);
    }
}
