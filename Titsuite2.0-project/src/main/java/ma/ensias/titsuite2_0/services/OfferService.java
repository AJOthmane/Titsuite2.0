package ma.ensias.titsuite2_0.services;

import ma.ensias.titsuite2_0.entities.Customer;
import ma.ensias.titsuite2_0.entities.Offer;
import ma.ensias.titsuite2_0.model.OfferForm;
import ma.ensias.titsuite2_0.repositories.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OfferService {

    @Autowired
    OfferRepository offerRepository;
    @Autowired
    CustomerRepository customerRepository;

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
    public List<Offer> getOffers(Long id)
    {
        return offerRepository.findAllByCustomerId(id);
    }

    public List<Offer> getOffersByActivity(String activity)
    {
        return offerRepository.findByActivity(activity);
    }
    public Boolean createOffer(OfferForm data)
    {
        String activity = data.getActivity(),
                city = data.getCity(),
                status = data.getStatus(),
                description = data.getDescription();
        Long minimumwage = data.getMinimumwage(),
                idCustomer = data.getIdCustomer();
        java.sql.Date startDay = data.getStartDay();



        if(activity != null
                && city != null
                && minimumwage > 0
                && status != null
                && idCustomer != null
                && description != null
                && startDay != null
        )
        {
            Customer customer = customerRepository.getById(data.getIdCustomer());
            Offer offer = null;
            if(customer != null) {
                offer = offerRepository.save(new Offer(description,
                        city,
                        minimumwage,
                        status,
                        customer,
                        startDay,
                        activity));
            }
            return offer != null;
        }
        else
        {
            return false;
        }
    }
    public boolean updateOffre(OfferForm data,Long id)
    {
        String activity = data.getActivity(),
                city = data.getCity(),
                status = data.getStatus(),
                description = data.getDescription();
        Long minimumwage = data.getMinimumwage();
        java.sql.Date startDay = data.getStartDay();

        Offer offer = offerRepository.findById(id).orElse(null);
        if(offer != null)
        {
            if(activity != null && !activity.equals(""))
                offer.setActivity(activity);
            if(city != null && !city.equals(""))
                offer.setCity(city);
            if(startDay != null)
                offer.setStartday(startDay);
            if(status != null && !status.equals(""))
                offer.setStatus(status);
            if(description != null && !description.equals(""))
                offer.setDescription(description);
            if(Long.valueOf(minimumwage) != null && minimumwage > 0)
                offer.setMinimumwage(minimumwage);

            offerRepository.save(offer);
            return true;
        }
        else return false;


    }
}
