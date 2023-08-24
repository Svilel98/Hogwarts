public class Slyzerin extends Hogwarts {
    private int cunning;
    private int determition;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slyzerin(String name, String facultet, int powerMagic, int trans, int cunning, int determition, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerMagic, trans, facultet);
        this.cunning = cunning;
        this.determition = determition;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermition() {
        return determition;
    }

    public void setDetermition(int determition) {
        this.determition = determition;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

}