package org.f10.smartOffice.model.base;

import org.f10.smartOffice.model.javaImplementation.User;

public interface IUserStorage {
    User getUserByID(int id);
    boolean addUser(String name, String address, String phoneNumber, IRole role);
}
