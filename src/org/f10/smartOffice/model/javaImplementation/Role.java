package org.f10.smartOffice.model.javaImplementation;

import org.f10.smartOffice.model.base.IRole;

import java.util.ArrayList;

public class Role implements IRole {


    //method lists
    public Role(){

    }

    @Override
    public boolean checkAction(String action) {
        return false;
    }
}
