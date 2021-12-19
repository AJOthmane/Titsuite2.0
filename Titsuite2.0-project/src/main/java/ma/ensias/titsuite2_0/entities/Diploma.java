package ma.ensias.titsuite2_0.entities;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "diploma")
@Setter @Getter
public class Diploma {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;

  @Column(name = "acquisition_date")
  private java.sql.Date acquisitionDate;

  private String field;

  @ManyToOne
  private Freelancer freelancer;

}
