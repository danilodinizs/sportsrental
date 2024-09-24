package tech.sportsrental.api.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "tb_equipment")
public class EquipmentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID equipmentId;

    private String type;
    @Column(name = "'condition'")
    private String statusCondition;
    private Double dailyRate;
    private String location;
    private String availability;

    @OneToMany(mappedBy = "equipment", cascade = CascadeType.ALL)
    private List<RentalModel> rentals;

    @OneToMany(mappedBy = "equipment", cascade = CascadeType.ALL)
    private List<ReviewModel> reviews;
}
