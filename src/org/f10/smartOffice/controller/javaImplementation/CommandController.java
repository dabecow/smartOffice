package org.f10.smartOffice.controller.javaImplementation;

import org.f10.smartOffice.controller.base.ICommandController;
import org.f10.smartOffice.controller.base.IResultController;
import org.f10.smartOffice.model.Result;
import org.f10.smartOffice.model.User;

import java.util.Queue;

public class CommandController implements ICommandController {

    private Queue<String> actions;
    private IResultController iResultController;

    public Result addActionToQueue(User user, String action){

        return null;
    }

    private synchronized void ProcessQueue(){

    }
}
