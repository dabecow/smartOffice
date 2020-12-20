package org.f10.smartOffice.controller.base;

import org.f10.smartOffice.model.javaImplementation.Result;
import org.f10.smartOffice.model.javaImplementation.User;

public interface ICommandController {
    Result addActionToQueue(User user, String action);
}
