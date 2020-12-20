package org.f10.smartOffice.controller.base;

import org.f10.smartOffice.model.Result;
import org.f10.smartOffice.model.User;

public interface ICommandController {
    Result addActionToQueue(User user, String action);
}
