package de.diebayerische.vertragsservices.model;

public class ZahnzusatzVertrag extends Vertrag{

    private final String zahnstaffel;
    private final String zahnLeistungsUmfang;

    public ZahnzusatzVertrag(String versicherungsscheinNummer, String sparte, String bankVerbindungIban, String zahnstaffel, String zahnLeistungsUmfang) {
        super(ZahnzusatzVertrag.class.getSimpleName(), versicherungsscheinNummer, sparte, bankVerbindungIban);
        this.zahnstaffel = zahnstaffel;
        this.zahnLeistungsUmfang = zahnLeistungsUmfang;
    }

    public String getZahnstaffel() {
        return zahnstaffel;
    }

    public String getZahnLeistungsUmfang() {
        return zahnLeistungsUmfang;
    }
}
