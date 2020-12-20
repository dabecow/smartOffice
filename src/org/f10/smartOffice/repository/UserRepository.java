package org.f10.smartOffice.repository;

import org.f10.smartOffice.model.IRole;
import org.f10.smartOffice.model.User;

import java.util.ArrayList;

public class UserRepository implements IUserRepository{
    private final ArrayList<User> users;

    public UserRepository(){
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
            users.add(user);
            user.setiRole(role);
            return true;
        }
        return false;
    }

    private int GetFreeID(){
        int id = 0;
        for(int i = 0; i < users.size(); i++){
            boolean isReserved = false;
            for(User u : users){
                if(u.getId() == id){
                    isReserved = true;
                    break;
                }
            }
            if(isReserved)
                id++;
            else
                return id;
        }
        return -1;
    }
}
