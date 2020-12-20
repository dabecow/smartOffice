package org.f10.smartOffice.model.javaImplementation;

import org.f10.smartOffice.model.base.IRole;
import org.f10.smartOffice.model.base.IUserStorage;

import java.util.ArrayList;

public class UserStorage implements IUserStorage {
    private ArrayList<User> users;

    public UserStorage(){
        users = new ArrayList<>();
    }

    @Override
    public User getUserByID(int id) {
        for(User user : users){
            if(user.getId() == id)
                return user;
        }
        return null;
    }

    @Override
    public boolean addUser(String name, String address, String phoneNumber, IRole role) {
        int id = GetFreeID();
        if(id != -1){
            User user = new User(id, name, address, phoneNumber);
            user.setiRole(role);
            return users.add(user);
        }
        return false;
    }

    private int GetFreeID(){
        int id = 0;
        for(User user : users){
            boolean reserved = false;
            for(User u : users) {
                if(u.getId() == id)
                    reserved = true;
            }
            if(reserved)
                id++;
            else
                return id;
        }
        return -1;
    }
}
