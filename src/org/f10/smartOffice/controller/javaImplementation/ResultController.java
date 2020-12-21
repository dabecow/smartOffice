package org.f10.smartOffice.controller.javaImplementation;

import org.f10.smartOffice.controller.base.IResultController;
import org.f10.smartOffice.model.javaImplementation.Result;
import org.f10.smartOffice.model.javaImplementation.Storage;
import org.f10.smartOffice.model.javaImplementation.User;

import java.util.ArrayList;
import java.util.Date;

public class ResultController implements IResultController {

    @Override
    public Result addResult(User user, String actionId, boolean isSuccess) {
        return  Storage.getInstance().getiResultStorage().addResult(user, actionId, isSuccess);
    }
}
