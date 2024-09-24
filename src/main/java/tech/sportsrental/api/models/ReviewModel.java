package tech.sportsrental.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "tb_review")
public class ReviewModel {

    private UUID id;

    private EquipmentModel equipment;

    private UserModel user;

    private double rating;
    private String comment;
}
