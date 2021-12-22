package ma.ensias.titsuite2_0.controllers;

import ma.ensias.titsuite2_0.entities.Offer;
import ma.ensias.titsuite2_0.model.OfferForm;
import ma.ensias.titsuite2_0.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OfferController {

    @Autowired
    OfferService offerService;

    @GetMapping("/offers/all")
    List<Offer> getAllOffers()
    {

        return offerService.getAllOffers();
    }
    @GetMapping("/offers/city/{city}")
    List<Offer> getAllOffers(@PathVariable String city)
    {

        return offerService.getOffersByCity(city);
    }
    @GetMapping("/offers/id/{id}")
    Offer getOfferByID(@PathVariable Long id)
    {
        return offerService.getOffer(id);
    }
    @GetMapping("/offers/activity/{activity}")
    List<Offer>  getOfferByActivity(@PathVariable String activity)
    {
        return offerService.getOffersByActivity(activity);
    }
    @GetMapping("/offers/myoffers")
    List<Offer> getMyOffers()
    {
        Long idUser = 1L;
        return offerService.getOffers(idUser);
    }
    @PostMapping("/offers/new")
    Boolean createOffer(@RequestBody OfferForm data)
    {
        return offerService.createOffer(data);
    }


}
