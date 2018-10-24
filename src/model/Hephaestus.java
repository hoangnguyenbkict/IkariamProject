/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Anh Bui
 */
public class Hephaestus {

    private int level;
    private int addArmor;
    private float addDamage;
    private long timeActive;
    private long timeDuration;
    private long timeCoolDown;

    public Hephaestus(int level) {
        this.level = level;
        switch (level) {
            case 1:
                addArmor = 0;
                addDamage = 0.1f;
                break;
            case 2:
                addArmor = 1;
                addDamage = 0.1f;
                break;
            case 3:
                addArmor = 1;
                addDamage = 0.15f;
                break;
            case 4:
                addArmor = 2;
                addDamage = 0.15f;
                break;
            case 5:
                addArmor = 2;
                addDamage = 0.2f;
                break;
            default:
                break;
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAddArmor() {
        return addArmor;
    }

    public void setAddArmor(int addArmor) {
        this.addArmor = addArmor;
    }

    public float getAddDamage() {
        return addDamage;
    }

    public void setAddDamage(float addDamage) {
        this.addDamage = addDamage;
    }

    public long getTimeActive() {
        return timeActive;
    }

    public void setTimeActive(long timeActive) {
        this.timeActive = timeActive;
    }

    public long getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(long timeDuration) {
        this.timeDuration = timeDuration;
    }

    public long getTimeCoolDown() {
        return timeCoolDown;
    }

    public void setTimeCoolDown(long timeCoolDown) {
        this.timeCoolDown = timeCoolDown;
    }

    public void activate() {
        long currentTime = System.currentTimeMillis();
        timeActive = currentTime;
//        timeCoolDown = currentTime + 8 * 24 * 60 * 60 * 1000;
//        timeDuration = currentTime + 24 * 60 * 60 * 1000;
        timeCoolDown = currentTime + 70 * 1000;
        timeDuration = currentTime + 40 * 1000;
    }
}
