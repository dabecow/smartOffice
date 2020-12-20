package org.f10.smartOffice.controller.base;

import org.f10.smartOffice.model.javaImplementation.Result;
import org.f10.smartOffice.model.javaImplementation.User;

import java.util.ArrayList;

public interface IResultController {
    Result addResult(User user, String actionId, boolean isSuccess);
}
