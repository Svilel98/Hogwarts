public class Pufendui extends Hogwarts {
    private int industrious;
    private int faithful;
    private int honesty;

    public Pufendui(String name, String facultet, int powerMagic, int trans, int industrious, int faithful, int honesty) {
        super(name, powerMagic, trans, facultet);
        this.industrious = industrious;
        this.faithful = faithful;
        this.honesty = honesty;
    }

    public int getIndustrious() {
        return industrious;
    }

    public int getFaithful() {
        return faithful;
    }

    public int getHonesty() {
        return honesty;
    }

}