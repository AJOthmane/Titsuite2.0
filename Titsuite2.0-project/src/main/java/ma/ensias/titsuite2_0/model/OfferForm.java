package ma.ensias.titsuite2_0.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.ensias.titsuite2_0.entities.Customer;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class OfferForm {

    private String description;

    private String city;

    private long minimumwage;

    private String status;

    private Long idCustomer;

    private java.sql.Date startDay;

    private String activity;

}
