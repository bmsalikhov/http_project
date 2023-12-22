package views;

import domain.ReceiverService;

import java.util.Scanner;

public class LookUsersListAppView extends AppView {
    public LookUsersListAppView(ReceiverService service) {
        super("Look users list", service);
    }

    @Override
    public void showView() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("enter page counts (from 1 to 999): ");
                int pageCounts = scanner.nextInt();
                if ((pageCounts < 1) || (pageCounts > 999)) throw new Exception();
                System.out.print("enter usersLimit (from 5 to 50): ");
                int limit = scanner.nextInt();
                if ((limit < 5) || (limit > 50)) throw new Exception();
                service.fetch(pageCounts, limit);
                break;
            } catch (Exception e) {
                System.out.println("try again: ");
            }
        }
    }
}
