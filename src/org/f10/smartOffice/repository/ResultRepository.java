package org.f10.smartOffice.repository;

import org.f10.smartOffice.model.Result;
import org.f10.smartOffice.model.User;

import java.util.ArrayList;
import java.util.Date;

public class ResultRepository implements IResultRepository{
    private ArrayList<Result> results;

    public ResultRepository(){
        results = new ArrayList<>();
    }
    @Override
    public Result[] getResults() {
        return results.toArray(Result[]::new);
    }

    @Override
    public void addResult(User user, String actionId, boolean isSuccess) {
        results.add(new Result(user, new Date(), actionId, isSuccess));
    }
}
