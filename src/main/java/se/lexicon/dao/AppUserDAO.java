package se.lexicon.dao;

import se.lexicon.model.AppUser;

import java.util.List;
import java.util.Set;

public interface AppUserDAO {

    AppUser persist (AppUser appUser);
    AppUser findByUserName (String userName);
    List <AppUser> findAll(); // Query Operations
    void remove(String userName);


}
