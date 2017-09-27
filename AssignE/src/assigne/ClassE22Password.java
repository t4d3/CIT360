/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigne;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author T4d3
 */
public class ClassE22Password implements Serializable {

    // for some reason, JSON wouldn't write, if the items were final
    private String passwordCleartext;
    private String passwordHash;
    private String userName;
    private Integer creationYear;

    public ClassE22Password(String password, String userName) {
        this.passwordCleartext = password;
        this.userName = userName;
        this.creationYear = 2017;
    }

    public ClassE22Password(HashMap data) {
        this.passwordCleartext = ((String) data.get("passwordCleartext"));
        this.passwordHash = ((String) data.get("passwordHash"));
        this.userName = ((String) data.get("userName"));
        this.creationYear = 2017;
    }

    @Override
    public String toString() {
        String temp = passwordHash;
        if (passwordHash == null) {
            temp = passwordCleartext;
        }
        return "UserName: " + this.userName + " Password: " + temp;
    }

    void hashPassword() {
//this is the code that is hashing the password, never to be unhashed, due to it's complexity
        passwordHash = "Hash" + passwordCleartext;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getUserName() {
        return userName;
    }
}
