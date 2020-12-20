package org.f10.smartOffice.repository;

import org.f10.smartOffice.model.*;

public interface IUserRepository {
    User getUserByID(int id);
    boolean addUser(String name, String address, String phoneNumber, IRole role);
}
