package org.f10.smartOffice.model.javaImplementation;

import org.f10.smartOffice.model.base.IResultStorage;
import org.f10.smartOffice.model.base.IStorage;
import org.f10.smartOffice.model.base.IUserStorage;

public class Storage implements IStorage {
    final IResultStorage iResultStorage;
    final IUserStorage iUserStorage;

    public Storage(){
        iResultStorage = new ResultStorage();
        iUserStorage = new UserStorage();
    }

    private static class SingletonHolder{
        public static final IStorage INSTANCE = new Storage();

    }

    public static IStorage getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Override
    public IResultStorage getiResultStorage() {
        return iResultStorage;
    }

    @Override
    public IUserStorage getiUserStorage() {
        return iUserStorage;
    }
}
