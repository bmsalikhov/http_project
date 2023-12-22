package views;

import domain.ReceiverService;

import java.util.ArrayList;
import java.util.Scanner;

public class AppView {
    final String title;
    private final ArrayList<AppView> appViewList;
    ReceiverService service;

    public AppView(String title, ReceiverService service) {
        this.title = title;
        this.appViewList = new ArrayList<>();
        this.service = service;
    }

    public void addChildView(AppView view) {
        appViewList.add(view);
    }

    public void showView() {
        System.out.println("---" + title + "----");
        for (int i = 0; i < appViewList.size(); i++) {
            System.out.println(i + " - " + appViewList.get(i).title);
        }
        System.out.println("5 - exit");
        makeAChoice();
    }

    public void makeAChoice() {
        System.out.print("enter the number: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int ch = scanner.nextInt();
                if (ch == 5) System.exit(0);
                appViewList.get(ch).showView();
                showView();
            } catch (Exception e) {
                System.out.println("try again: ");
            }
        }
    }

}
