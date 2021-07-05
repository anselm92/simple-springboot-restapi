package de.diebayerische.vertragsservices.controller;


import de.diebayerische.vertragsservices.exception.VertragNotFound;
import de.diebayerische.vertragsservices.model.Vertrag;
import de.diebayerische.vertragsservices.service.VertragService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/vertraege")
public class VertragController {

    private final
    VertragService vertragService;

    public VertragController(VertragService vertragService) {
        this.vertragService = vertragService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Vertrag> getVertraege() {
        return vertragService.getVertraege();
    }

}
