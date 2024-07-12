package se.lexicon;

import se.lexicon.model.*;
import se.lexicon.dao.*;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // -------------------- Create a new AppUser object with default values -------------------- //

        AppUser appUserObj1 = new AppUser ("User1","User1Pass", AppRole.ROLE_USER);
        AppUser appUserObj2 = new AppUser ("User2","User2Pass", AppRole.ROLE_USER);
        AppUser appUserObj3 = new AppUser ("User3","User3Pass", AppRole.ROLE_ADMIN);
        AppUser appUserObj4 = new AppUser ("User4","User4Pass", AppRole.ROLE_USER);

        AppUserDAOCollection userDAOCollection = new AppUserDAOCollection();
        userDAOCollection.persist(appUserObj1);
        userDAOCollection.persist(appUserObj2);
        userDAOCollection.persist(appUserObj3);
        userDAOCollection.persist(appUserObj4);

        System.out.println(userDAOCollection.findByUserName("User1"));

        userDAOCollection.remove("User2");
        System.out.println("the" + " User2 " + "has been removed");
        System.out.println("-----------------------------------");

        System.out.println("List of all users");
        System.out.println(userDAOCollection.findAll());
        System.out.println("-----------------------------------");


    }




}
