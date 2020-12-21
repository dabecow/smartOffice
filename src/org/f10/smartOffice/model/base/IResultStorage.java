package org.f10.smartOffice.model.base;
import org.f10.smartOffice.model.javaImplementation.Result;
import org.f10.smartOffice.model.javaImplementation.User;

import java.util.*;

public interface IResultStorage {
    Result[] getResults();
    Result addResult(User user, String actionID, boolean isSuccess);
}
