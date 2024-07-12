package se.lexicon.dao;

import se.lexicon.model.AppUser;

import java.util.ArrayList;
import java.util.List;

public class AppUserDAOCollection implements AppUserDAO {

    // Create an ArrayList to store the AppUser objects.
    private final ArrayList<AppUser> appUserArrayStorage = new ArrayList<>();

    // Add a new user to the ArrayList appUserArrayStorage.
    @Override
    public AppUser persist(AppUser appUser) {
        if (findByUserName(appUser.getUserName()) != null) {
            throw new IllegalArgumentException("Username " + appUser.getUserName() + " is already taken");
        }
        appUserArrayStorage.add(appUser);
        return appUser;
    }

    // find and print the usernames.
    @Override
    public AppUser findByUserName(String userName) {
        for (AppUser element : appUserArrayStorage) {
            if (element.getUserName().equals(userName)) {
                return element;
            }
        }
        return null;
    }

    @Override
    public List<AppUser> findAll() {
        return new ArrayList <>(appUserArrayStorage);
    }

    @Override
    public void remove(String userName) {
        AppUser userToRemove = findByUserName(userName);
        if (userToRemove != null) {
            appUserArrayStorage.remove(userToRemove);
        }

    }
}
