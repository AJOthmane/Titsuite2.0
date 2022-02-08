package ma.ensias.titsuite2_0.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.ensias.titsuite2_0.enums.Subscription;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class CustomerForm {

    private String email;
    private String password;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private java.sql.Date birthDate;

    private String city;

    private String address;

    private Subscription subscription;

}
