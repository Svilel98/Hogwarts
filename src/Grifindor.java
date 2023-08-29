public class Grifindor extends Hogwarts {
    private int royal;
    private int honest;
    private int brave;

    public Grifindor(String name, String facultet, int powerMagic, int trans, int royal, int honest, int brave) {
        super(name, powerMagic, trans, facultet);
        this.royal = royal;
        this.honest = honest;
        this.brave = brave;
    }

    public int getRoyal() {
        return royal;
    }

    public int getHonest() {
        return honest;
    }

    public int getBrave() {
        return brave;
    }

}
