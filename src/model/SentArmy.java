package model;

public class SentArmy {

    RealArmy realArmy;
    long arrivalTime;

    public RealArmy getRealArmy() {
        return realArmy;
    }

    public void setRealArmy(RealArmy realArmy) {
        this.realArmy = realArmy;
    }

    public long getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(long arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public SentArmy(RealArmy realArmy, long arrivalTime) {
        this.realArmy = realArmy;
        // 1-1-1970
        this.arrivalTime = arrivalTime;
    }

}
