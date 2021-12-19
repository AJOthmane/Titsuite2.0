package ma.ensias.titsuite2_0.entities;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "rate")
@Setter @Getter
public class Rate {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private long rate;

  private String review;

  @OneToMany
  private Set<Job> jobs;

}
