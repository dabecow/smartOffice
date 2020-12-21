package org.f10.smartOffice.model.javaImplementation;

import org.f10.smartOffice.model.base.IResultStorage;

import java.util.ArrayList;
import java.util.Date;

public class ResultStorage implements IResultStorage {
    private ArrayList<Result> results;

    public ResultStorage(){
        results = new ArrayList<>();
    }

    @Override
    public Result[] getResults() {
        return results.toArray(Result[]::new);
    }

    @Override
    public Result addResult(User user, String actionID, boolean isSuccess) {
        Result result = new Result(user, new Date(), actionID, isSuccess);
        results.add(result);
        return result;
    }
}
