package de.diebayerische.vertragsservices.model;

public abstract class Vertrag {
    private final String vertragsArt;
    private String versicherungsscheinNummer;
    private String sparte;
    private String bankVerbindungIban;

    Vertrag(String vertragsArt, String versicherungsscheinNummer, String sparte, String bankVerbindungIban) {
        this.vertragsArt = vertragsArt;
        this.versicherungsscheinNummer = versicherungsscheinNummer;
        this.sparte = sparte;
        this.bankVerbindungIban = bankVerbindungIban;
    }

    public String getBankVerbindungIban() {
        return bankVerbindungIban;
    }

    public String getVersicherungsscheinNummer() {
        return versicherungsscheinNummer;
    }

    public String getSparte() {
        return sparte;
    }

    public void setVersicherungsscheinNummer(String versicherungsscheinNummer) {
        this.versicherungsscheinNummer = versicherungsscheinNummer;
    }

    public void setSparte(String sparte) {
        this.sparte = sparte;
    }

    public void setBankVerbindungIban(String bankVerbindungIban) {
        this.bankVerbindungIban = bankVerbindungIban;
    }

    public String getVertragsArt() {
        return vertragsArt;
    }
}
