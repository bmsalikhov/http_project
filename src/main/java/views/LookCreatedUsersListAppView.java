package views;

import domain.ReceiverService;

public class LookCreatedUsersListAppView extends AppView {
    public LookCreatedUsersListAppView(ReceiverService service) {
        super("Looking yourown users", service);
    }

    @Override
    public void showView() {
        service.fetchCreated();
    }
}
