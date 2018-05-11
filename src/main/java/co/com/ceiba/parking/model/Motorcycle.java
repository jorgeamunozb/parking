package co.com.ceiba.parking.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "motorcycle")
@EntityListeners(AuditingEntityListener.class)
public class Motorcycle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(unique = true)
    private String plate;

    @NotBlank
    private Integer displacement;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date dateIngress;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date dateOutput;

    public Motorcycle(@NotBlank String plate, @NotBlank Integer displacement, Date dateIngress) {
        this.plate = plate;
        this.displacement = displacement;
        this.dateIngress = dateIngress;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Integer getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Integer displacement) {
        this.displacement = displacement;
    }

    public Date getDateIngress() {
        return dateIngress;
    }

    public void setDateIngress(Date dateIngress) {
        this.dateIngress = dateIngress;
    }
}
