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

    public int getDetermition() {
        return determition;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

}