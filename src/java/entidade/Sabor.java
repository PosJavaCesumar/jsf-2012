package entidade;

import java.util.HashMap;
import java.util.Map;

public enum Sabor {
    DOCE("D", "Doce"), SALGADO("S", "Salgado"), AZEDO("A", "Azedo"), AMARGO("M", "Amargo");
    
    private static final Map<String, Sabor> valueMap = new HashMap<String, Sabor>();
    
    static {
        for (Sabor sabor: values()) {
            valueMap.put(sabor.getSigla(), sabor);
        }
    }
    
    public static Sabor fromSigla(String sigla) {
        return valueMap.get(sigla);
    }
    
    private final String sigla;
    
    private final String descricao;
    
    private Sabor(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }
    
}