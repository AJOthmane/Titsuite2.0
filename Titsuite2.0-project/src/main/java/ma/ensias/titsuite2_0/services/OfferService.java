package ma.ensias.titsuite2_0.services;

import ma.ensias.titsuite2_0.entities.Offer;
import ma.ensias.titsuite2_0.repositories.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferService {

    @Autowired
    OfferRepository offerRepository;

    public List<Offer> getAllOffers()
    {

        return offerRepository.findAll();
    }
    public List<Offer> getOffersByCity(String city)
    {

        return offerRepository.findByCity(city);
    }

    public Offer getOffer(Long id)
    {
        return offerRepository.findById(id).orElse(null);
    }

    public List<Offer> getOffersByActivity(String activity)
    {
        return offerRepository.findByActivity(activity);
    }
}
