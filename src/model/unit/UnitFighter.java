package model.unit;

public class UnitFighter {

    protected float hitPoint;
    protected float damage;
    protected float armour;
    private boolean activatedHephaestus;

    public UnitFighter() {
    }

    public float getHitPoint() {
        return hitPoint;
    }

    public boolean isActivatedHephaestus() {
        return activatedHephaestus;
    }

    public void setActivatedHephaestus(boolean activatedHephaestus) {
        this.activatedHephaestus = activatedHephaestus;
    }

    public void setHitPoint(float hitPoint) {
        this.hitPoint = hitPoint;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public float getArmour() {
        return armour;
    }

    public void setArmour(float armour) {
        this.armour = armour;
    }

}
