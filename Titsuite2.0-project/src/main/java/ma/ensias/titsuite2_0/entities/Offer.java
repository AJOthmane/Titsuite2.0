package ma.ensias.titsuite2_0.entities;


import lombok.*;

import javax.persistence.*;
import java.beans.ConstructorProperties;
import java.sql.Date;

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

  public Offer(String description, String city, long minimumwage, String status, Customer customer, Date startday, String activity) {
    this.description = description;
    this.city = city;
    this.minimumwage = minimumwage;
    this.status = status;
    this.customer = customer;
    this.startday = startday;
    this.activity = activity;
  }
}
