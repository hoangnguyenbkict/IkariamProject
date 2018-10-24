package model.unit;

// TODO(2): change Swordsmans extend UnitFighter to LightInfantry
public class Swordsman extends LightInfantry {

    public static final float accuracy = 0.9f;
    //TODO(3): delete speed and size of Swordsman
//    public static final int speed = 60;
//    public static final int size = 1;
    private String imageUrl = "/image/SwordsmanBB.png";

    public Swordsman() {
        hitPoint = 18;
        damage = 10;
        armour = 0;
    }

    public String getImageUrl() {
        return imageUrl;
    }

}
