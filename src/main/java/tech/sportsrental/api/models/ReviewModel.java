package tech.sportsrental.api.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "tb_review")
public class ReviewModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID reviewId;

    @ManyToOne
    @JoinColumn(name = "equipment_id", nullable = false)
    private EquipmentModel equipment;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserModel user;

    private Double rating;
    private String comment;
}
