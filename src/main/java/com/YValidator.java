package com;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class YValidator implements Validator {

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
     if (o == null) throw new ValidatorException(new FacesMessage("Координата Y пуста!"));
        try {
        String strY = o.toString();
            double y = Double.parseDouble(strY);
            if (y<-3 || y>3) throw new ValidatorException(new FacesMessage("Нужен Y от -3 до 3"));
        } catch (NumberFormatException e) {
            throw new ValidatorException(new FacesMessage("Y не число!"));
        }
    }
}