package de.diebayerische.vertragsservices.model;

public class BerufsunfaehigkeitsVertrag extends Vertrag {

    private double versicherteRente;
    private String bezugsrechtTodesfall;

    public BerufsunfaehigkeitsVertrag(String versicherungsscheinNummer, String sparte, String bankVerbindungIban, double versicherteRente, String bezugsrechtTodesfall) {
        super(BerufsunfaehigkeitsVertrag.class.getSimpleName(), versicherungsscheinNummer, sparte, bankVerbindungIban);
        this.versicherteRente = versicherteRente;
        this.bezugsrechtTodesfall = bezugsrechtTodesfall;
    }

    public double getVersicherteRente() {
        return versicherteRente;
    }

    public String getBezugsrechtTodesfall() {
        return bezugsrechtTodesfall;
    }

    public void setVersicherteRente(double versicherteRente) {
        this.versicherteRente = versicherteRente;
    }

    public void setBezugsrechtTodesfall(String bezugsrechtTodesfall) {
        this.bezugsrechtTodesfall = bezugsrechtTodesfall;
    }
}
