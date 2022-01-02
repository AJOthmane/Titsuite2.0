package ma.ensias.titsuite2_0.entities;

import lombok.*;
import ma.ensias.titsuite2_0.enums.Subscription;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
public class Customer implements UserDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String email;

  @Column(name = "hashed_password")
  private String hashedPassword;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "phone_number")
  private String phoneNumber;

  @Column(name = "birth_date")
  private java.sql.Date birthDate;

  private String city;

  private String address;

  @Enumerated(EnumType.STRING)
  private Subscription subscription;

  @Column(name = "refresh_token")
  private String refreshToken;

  @Column(name = "verification_code")
  private String verificationCode;

  @Column(name = "is_active")
  private long isActive;

  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;

  @Column(name = "resend_timeout")
  private java.sql.Date resendTimeout;

  @OneToMany
  private Set<Offer> offers;

  public Customer(String email, String hashedPassword, String firstName, String lastName, String phoneNumber, Date birthDate, String city, String address, Subscription subscription) {
    this.email = email;
    this.hashedPassword = hashedPassword;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.birthDate = birthDate;
    this.city = city;
    this.address = address;
    this.subscription = subscription;

  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return Arrays.asList(new SimpleGrantedAuthority("CUSTOMER_ROLE"));
  }

  @Override
  public String getPassword() {
    return hashedPassword;
  }

  @Override
  public String getUsername() {
    return email;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return false;
  }

  @Override
  public boolean isEnabled() {
    return false;
  }
}
