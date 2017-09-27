package assigne;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author Justin Cox
 */
public class ClassE21Game implements Serializable {

    private Integer maxTime;
    private Integer usedTime;
    private Integer mapSize;
    private String playerName;
    private Boolean wasSaved;

    public ClassE21Game(Integer map, String name, Integer time) {
        maxTime = time;
        usedTime = 0;
        mapSize = map;
        playerName = name;
        wasSaved = false;

    }

    public Boolean getWasSaved() {
        return wasSaved;
    }

    public void setWasSaved(Boolean wasSaved) {
        this.wasSaved = wasSaved;
    }

    public ClassE21Game(HashMap tempGame) {
        this.maxTime = ((Long) tempGame.get("maxTime")).intValue();
        this.usedTime = ((Long) tempGame.get("usedTime")).intValue();
        this.mapSize = ((Long) tempGame.get("mapSize")).intValue();
        this.playerName = (String) tempGame.get("playerName");
        this.wasSaved = (Boolean) tempGame.get("wasSaved");
    }

    @Override
    public String toString() {
        return "maxTime = " + maxTime + "\n"
                + "usedTime = " + usedTime + "\n"
                + "mapSize = " + mapSize + "\n"
                + "playerName = " + playerName;
    }

    ClassE21Game() {
        maxTime = 0;
        usedTime = 0;
        mapSize = 0;
        playerName = "Not assigned'";
    }

    public Integer getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(int maxTime) {
        this.maxTime = maxTime;
    }

    public Integer getMapSize() {
        return mapSize;
    }

    public void setMapSize(Integer mapSize) {
        this.mapSize = mapSize;
    }

    public Integer getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(int usedTime) {
        this.usedTime = usedTime;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    Boolean checkIntegrity() {
        if (usedTime >= maxTime) {
            System.out.println("There was a problem");
            return false;
        }
        return true;
    }
}
