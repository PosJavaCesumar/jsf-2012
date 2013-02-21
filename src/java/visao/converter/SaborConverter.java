package visao.converter;

import entidade.Sabor;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Sabor.class)
public class SaborConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Sabor sabor = Sabor.fromSigla(value);
        if (sabor == null) {
            throw new ConverterException(
                    String.format("Sigla de Sabor não encontrada: %s", value));
        }
        return sabor;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null) {
            Sabor sabor = (Sabor) value;
            return sabor.getSigla();
        }
        return null;
    }
}