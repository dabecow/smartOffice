package org.f10.smartOffice.controller.javaImplementation;

import org.f10.smartOffice.controller.base.ICommandController;
import org.f10.smartOffice.model.javaImplementation.Result;
import org.f10.smartOffice.model.javaImplementation.User;

import java.util.Queue;

public class CommandController implements ICommandController {
    private Executer executer;
    private Queue<String> actions;

    public Result addActionToQueue(User user, String action){

        return null;
    }

    private synchronized void ProcessQueue(){

    }
}
