/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignd;

/**
 *
 * @author T4d3
 */
public class ClassD16Singleton {

    private static ClassD16Singleton instance;
    private String status;
    private Boolean canMoveOn;
    private Integer score;
    private String userName;
    private String workingDirectory;

    private ClassD16Singleton() {
        status = "Game has not started";
        canMoveOn = false;
        score = 0;
        userName = "NOT SET";
        workingDirectory = System.getProperty("user.home") + "\\Desktop\\";
    }

    public static ClassD16Singleton getInstance() {
        if (instance == null) {
            instance = new ClassD16Singleton();
        }
        return instance;
    }

    public String getUserName() {
        return userName;
    }

    public Boolean canMoveOn() {
        return canMoveOn;
    }

    public Integer getScore() {
        return score;
    }

    public String getStatus() {
        return status;
    }

    public String getWorkingDirectory() {
        return workingDirectory;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNumDeath(Boolean canMoveOn) {
        this.canMoveOn = canMoveOn;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }
}
