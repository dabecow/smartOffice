package org.f10.smartOffice.commandControl;

//singleton

import org.f10.smartOffice.model.User;

public class PermissionController {
    private PermissionController(){

    }
    public static class PermissionControllerHolder {
        public static final PermissionController HOLDER_INSTANCE = new PermissionController();
    }

    public static PermissionController getInstance() {
        return PermissionControllerHolder.HOLDER_INSTANCE;
    }

    public void addActionToQueue(User user, String action){

    }

    private void processQueue(){

    }
}
