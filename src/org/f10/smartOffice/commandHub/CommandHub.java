package org.f10.smartOffice.commandHub;

//Class Holder Singleton

import org.f10.smartOffice.controller.javaImplementation.CommandController;
import org.f10.smartOffice.controller.base.ICommandController;
import org.f10.smartOffice.controller.base.IUserController;
import org.f10.smartOffice.controller.javaImplementation.UserController;

public class CommandHub {

    private final ICommandController iCommandController;
    private final IUserController iUserController;

    private CommandHub() {
        iCommandController = new CommandController();
        iUserController = new UserController();
    }

    public static class CommandHubHolder {
        public static final CommandHub HOLDER_INSTANCE = new CommandHub();
    }

    public static CommandHub getInstance() {
        return CommandHubHolder.HOLDER_INSTANCE;
    }

    public ICommandController getiCommandController() {
        return iCommandController;
    }

    public IUserController getiUserController() {
        return iUserController;
    }
}
