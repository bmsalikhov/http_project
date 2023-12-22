package app;

import domain.ReceiverService;
import views.*;

public class AppBuilder {
    ReceiverService service;
    AppView appView;

    public AppBuilder(ReceiverService service) {
        this.service = service;
        this.appView = generateAppViews();
    }

    private AppView generateAppViews() {
        AppView createUserAppView = new CreateUserAppView(service);
        AppView lookUsersListAppView = new LookUsersListAppView(service);
        AppView lookCreatedUsersListAppView = new LookCreatedUsersListAppView(service);
        AppView deleteUserAppView = new DeleteUserAppView(service);
        AppView mainMenuAppView = new MainMenuAppView(service);
        mainMenuAppView.addChildView(lookUsersListAppView);
        mainMenuAppView.addChildView(lookCreatedUsersListAppView);
        mainMenuAppView.addChildView(deleteUserAppView);
        mainMenuAppView.addChildView(createUserAppView);
        return mainMenuAppView;
    }

    public void run() {
        appView.showView();
    }
}
