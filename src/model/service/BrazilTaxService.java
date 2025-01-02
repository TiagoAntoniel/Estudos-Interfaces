package model.service;

public class BrazilTaxService implements TaxService {
    public double tax(double amaunt){
        if(amaunt <= 100.0){
            return amaunt * 0.2;
        }
        else {
            return amaunt * 0.15;
        }
    }
}
