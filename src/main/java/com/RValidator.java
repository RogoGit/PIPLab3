package com;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class RValidator implements Validator {

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
            if (o == null) throw new ValidatorException(new FacesMessage("Радиус пуст!"));
            String strR = o.toString();
            try {
                double r = Double.parseDouble(strR);
                if (r<1 || r>4) throw new ValidatorException(new FacesMessage("Нужен радиус от 1 до 4"));
            } catch (NumberFormatException e) {
                throw new ValidatorException(new FacesMessage("Радиус не число!"));
            }
    }
}
