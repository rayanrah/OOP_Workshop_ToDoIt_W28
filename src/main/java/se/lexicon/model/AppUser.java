package se.lexicon.model;

import java.util.Objects;

public class AppUser {

    private String userName;
    private String password;
    private AppRole role;

    public AppUser(String userName, String password, AppRole role) {
        setUserName(userName);
        setPassword(password);
        setRole(role);
    }

    private String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        validateInput("Password", password);
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if (role == null) {
            throw new IllegalArgumentException("Role cannot be null");
        }
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        validateInput("Username", userName);
        this.userName = userName;
    }

    private void validateInput (String ParaName, String paraFullName) {
        if (paraFullName == null || paraFullName.isEmpty()) {
            throw new IllegalArgumentException(ParaName + " cannot be null or empty");
        }
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "userName='" + userName + '\'' +
                ", role=" + role +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(userName, appUser.userName) && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, role);
    }


}
