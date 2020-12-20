package org.f10.smartOffice.controller.javaImplementation;

import org.f10.smartOffice.model.javaImplementation.User;
import org.f10.smartOffice.controller.base.IControllerHub;
import org.f10.smartOffice.model.javaImplementation.Result;

public class Executer {
    private IControllerHub iControllerHub;

    public Executer(){
        iControllerHub = new ControllerHub();
    }

    public Result Execute(User user, String action, String[] params){
        boolean result = true;//here we execute our command and get result state
        return iControllerHub.getiResultController().addResult(user, action, result);
    }
}
