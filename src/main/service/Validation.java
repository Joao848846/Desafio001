package main.service;

import main.model.Contribuinte;

public class Validation {

    public void aplicarJuros(Contribuinte contribuinte){
        double rendaBruta = contribuinte.getRendaBruta();
        rendaBruta = rendaBruta + (rendaBruta * Contribuinte.getJuros());
    }
}
