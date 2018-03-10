package usst.cqk.hotel.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Administor {
    @Id
    private String administorAccount;
    private String administorPassword;
    private String username;
    private String administorLevel;
    private String personalIdentification;

    public String getPersonalIdentification() {
        return personalIdentification;
    }

    public void setPersonalIdentification(String personalIdentification) {
        this.personalIdentification = personalIdentification;
    }

    public String getAdministorLevel() {
        return administorLevel;
    }

    public void setAdministorLevel(String administorLevel) {
        this.administorLevel = administorLevel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAdministorPassword() {
        return administorPassword;
    }

    public void setAdministorPassword(String administorPassword) {
        this.administorPassword = administorPassword;
    }

    public String getAdministorAccount() {
        return administorAccount;
    }

    public void setAdministorAccount(String administorAccount) {
        this.administorAccount = administorAccount;
    }
}
