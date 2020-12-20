package org.f10.smartOffice.repository;

public class RepositoryMain implements IRepositoryMain{
    IResultRepository iResultRepository;
    IUserRepository iUserRepository;

    private static class Singleton{
        public static final IRepositoryMain INSTANCE = new RepositoryMain();
    }

    public RepositoryMain(){
        iResultRepository = new ResultRepository();
        iUserRepository = new UserRepository();
    }

    public IRepositoryMain getInstance(){
        return Singleton.INSTANCE;
    }

    @Override
    public IResultRepository getiResultRepository() {
        return iResultRepository;
    }

    @Override
    public IUserRepository getiUserRepository() {
        return iUserRepository;
    }
}
