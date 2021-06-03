package ec.edu.utpl.cc.pavanzada.ep2.stats;

public final class ProvinceStats {
    private int id;
    private String region;
    private String nombre;
    private int numConfirmCase;

    public ProvinceStats(int id, String region, String nombre, int numConfirmCase) {
        this.id = id;
        this.region = region;
        this.nombre = nombre;
        this.numConfirmCase = numConfirmCase;
    }

    public int getId() {
        return id;
    }

    public String getRegion() {
        return region;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumConfirmCase() {
        return numConfirmCase;
    }

    @Override
    public String toString() {
        return String.format("%d - %s(%s): %d",
                id,
                nombre,
                region,
                numConfirmCase);
    }
}
