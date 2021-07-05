package de.diebayerische.vertragsservices.service;


import de.diebayerische.vertragsservices.model.BerufsunfaehigkeitsVertrag;
import de.diebayerische.vertragsservices.model.Vertrag;
import de.diebayerische.vertragsservices.model.ZahnzusatzVertrag;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class VertragService {

    private final List<Vertrag> vertraege;

    public VertragService() {
        vertraege = new LinkedList<>();
        vertraege.add(new BerufsunfaehigkeitsVertrag("03923232323", "Leben",
                "DE0923949394939394", 1500, "Max Testperson"));
        vertraege.add(new ZahnzusatzVertrag("4020233333", "Sach",
                "DE0923959392394393", "1000/2000/4", "Vorsorge"));
    }

    /**
     * Queries all vertraege in our system.
     *
     * @return Readonly list of all vertraege
     */
    public List<Vertrag> getVertraege() {
        return Collections.unmodifiableList(vertraege);
    }

}
