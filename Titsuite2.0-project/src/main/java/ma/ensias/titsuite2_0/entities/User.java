package ma.ensias.titsuite2_0.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;



@MappedSuperclass
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String username;
    private String email;
    private String password;
    private int phone;
    private String address;
    private Date birthDate;



}
