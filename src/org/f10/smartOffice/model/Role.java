package org.f10.smartOffice.model;

public class Role implements IRole {
    //method lists
    public Role(){

    }

    @Override
    public boolean checkAction(String action) {
        return false;
    }
}
