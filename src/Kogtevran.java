public class Kogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Kogtevran(String name, String facultet, int powerMagic, int trans, int smart, int wise, int witty, int fullOfCreativity) {
        super(name, powerMagic, trans, facultet);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }
    public int getFullOfCreativity() {
        return fullOfCreativity;
    }
}
