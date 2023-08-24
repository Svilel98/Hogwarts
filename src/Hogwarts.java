public class Hogwarts {
    private String name;
    private int powerMagic;
    private int trans;
    private String facultet;

    public Hogwarts(String name, int powerMagic, int trans, String facultet) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.trans = trans;
        this.facultet = facultet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTrans() {
        return trans;
    }

    public void setTrans(int trans) {
        this.trans = trans;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

}
