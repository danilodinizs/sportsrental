package tech.sportsrental.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "tb_equipment")
public class EquipmentModel {

    private UUID id;

    private String type;
    private String condition;
    private double dailyRate;
    private String location;
    private String availability;

    private List<RentalModel> rentals;

    private List<Review> reviews;
}
