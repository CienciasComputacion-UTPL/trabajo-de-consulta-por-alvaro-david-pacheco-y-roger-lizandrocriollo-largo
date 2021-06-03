package ec.edu.utpl.cc.pavanzada.ep2.stats;

import java.util.HashMap;
import java.util.Map;

public class EcuadorStats {
    private static final Map<Integer, ProvinceStats> DATA_COVID_ECUADOR;

    static {
        DATA_COVID_ECUADOR = new HashMap<>();
        DATA_COVID_ECUADOR.put(1, new ProvinceStats(1, "El Oro", "Costa", 1213));
        DATA_COVID_ECUADOR.put(2, new ProvinceStats(2, "Esmeraldas", "Costa", 1036));
        DATA_COVID_ECUADOR.put(3, new ProvinceStats(3, "Guayas", "Costa", 14184));
        DATA_COVID_ECUADOR.put(4, new ProvinceStats(4, "Los Ríos", "Costa", 1591));
        DATA_COVID_ECUADOR.put(5, new ProvinceStats(5, "Manabí", "Costa", 2516));
        DATA_COVID_ECUADOR.put(6, new ProvinceStats(6, "Santa Elena", "Costa", 799));
        DATA_COVID_ECUADOR.put(7, new ProvinceStats(7,"Santo Domingo","Costa",1138));
        DATA_COVID_ECUADOR.put(8, new ProvinceStats(8, "Azuay", "Sierra", 930));
        DATA_COVID_ECUADOR.put(9, new ProvinceStats(9, "Bolívar", "Sierra", 328));
        DATA_COVID_ECUADOR.put(10, new ProvinceStats(10, "Cañar", "Sierra", 352));
        DATA_COVID_ECUADOR.put(11, new ProvinceStats(11, "Carchi", "Sierra", 169));
        DATA_COVID_ECUADOR.put(12, new ProvinceStats(12, "Chimborazo", "Sierra", 444));
        DATA_COVID_ECUADOR.put(13, new ProvinceStats(13, "Cotopaxi", "Sierra", 503));
        DATA_COVID_ECUADOR.put(14, new ProvinceStats(14, "Imbabura", "Sierra", 226));
        DATA_COVID_ECUADOR.put(15, new ProvinceStats(15, "Loja", "Sierra", 455));
        DATA_COVID_ECUADOR.put(16, new ProvinceStats(16, "Pichinccha", "Sierra", 4166));
        DATA_COVID_ECUADOR.put(17, new ProvinceStats(17, "Tungurahua", "Sierra", 533));
        DATA_COVID_ECUADOR.put(18, new ProvinceStats(18, "Galápagos", "Insular", 76));
        DATA_COVID_ECUADOR.put(19, new ProvinceStats(19, "Morona Santiago", "Amazónica", 138));
        DATA_COVID_ECUADOR.put(20, new ProvinceStats(20, "Napo", "Amazónica", 238));
        DATA_COVID_ECUADOR.put(21, new ProvinceStats(21, "Orellana", "Amazónica", 283));
        DATA_COVID_ECUADOR.put(22, new ProvinceStats(22, "Pastaza", "Amazónica", 304));
        DATA_COVID_ECUADOR.put(23, new ProvinceStats(23, "Sucumbíos", "Amazónica", 135));
        DATA_COVID_ECUADOR.put(24, new ProvinceStats(24, "Zamora Chinchipe", "Amazónica", 253));
    }

    public static synchronized ProvinceStats getData(int provinceId) {
        if (provinceId <= 24) {
            try {
                Thread.sleep(provinceId * 25);
                return DATA_COVID_ECUADOR.get(provinceId);
            } catch (InterruptedException ie) {
                return null;
            }
        } else {
            return null;
        }
    }
}
