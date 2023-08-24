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

    public void setRoyal(int royal) {
        this.royal = royal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public int getBrave() {
        return brave;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }
}
