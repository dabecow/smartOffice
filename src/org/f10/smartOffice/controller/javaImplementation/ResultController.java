package org.f10.smartOffice.controller.javaImplementation;

import org.f10.smartOffice.controller.base.IResultController;
import org.f10.smartOffice.model.Result;
import org.f10.smartOffice.model.User;

import java.util.ArrayList;
import java.util.Date;

public class ResultController implements IResultController {
    ArrayList<Result> results;

    @Override
    public ArrayList<Result> getResults() {
        return results;
    }

    @Override
    public void addResult(User user, String actionId, boolean isSuccess) {
        Result result = new Result(user, new Date(), actionId, isSuccess);
        results.add(result);
    }
}
