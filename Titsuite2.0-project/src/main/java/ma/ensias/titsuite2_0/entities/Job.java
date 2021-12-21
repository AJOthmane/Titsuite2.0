package ma.ensias.titsuite2_0.entities;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
public class Job {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @ManyToOne
  private Freelancer freelancer;

  @OneToOne
  private Rate rate;

  @OneToOne
  private Offer offer;

}
