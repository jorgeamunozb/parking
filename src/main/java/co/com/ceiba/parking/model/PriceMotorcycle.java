package co.com.ceiba.parking.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "price_motorcycle")
@EntityListeners(AuditingEntityListener.class)
public class PriceMotorcycle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(unique = true)
    private String type;

    @NotBlank
    private Integer price;

}
