package ma.ensias.titsuite2_0.entities;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
public class Offer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String description;

  private String city;

  private long minimumwage;

  private String status;

  @ManyToOne
  private Customer customer;

  private java.sql.Date startday;

  private String activity;

}
