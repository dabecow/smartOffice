package org.f10.smartOffice.controller.base;

import org.f10.smartOffice.model.Result;
import org.f10.smartOffice.model.User;

import java.util.ArrayList;

public interface IResultController {
    ArrayList<Result> getResults();
    void addResult(User user, String actionId, boolean isSuccess);

}
