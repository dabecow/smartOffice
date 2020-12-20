package org.f10.smartOffice.repository;

import org.f10.smartOffice.model.*;
import java.util.*;

public interface IResultRepository {
    Result[] getResults();
    void addResult(User user, String actionId, boolean isSuccess);
}
