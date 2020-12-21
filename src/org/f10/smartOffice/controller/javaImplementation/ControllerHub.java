package org.f10.smartOffice.controller.javaImplementation;

import org.f10.smartOffice.controller.base.ICommandController;
import org.f10.smartOffice.controller.base.IControllerHub;
import org.f10.smartOffice.controller.base.IResultController;
import org.f10.smartOffice.controller.base.IUserController;

public class ControllerHub implements IControllerHub {
    IUserController iUserController;
    IResultController iResultController;

    @Override
    public IResultController getiResultController() {
        return iResultController;
    }

    @Override
    public IUserController getiUserController() {
        return iUserController;
    }
}
