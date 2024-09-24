package tech.sportsrental.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "tb_rental")
public class RentalModel {

    private UUID id;

    private Equipment equipment;

    private UserModel user;

    private LocalDateTime rentalStart;
    private LocalDateTime rentalEnd;
    private String status;
}
