package tech.sportsrental.api.models;

import jakarta.persistence.*;
import lombok.Data;
import tech.sportsrental.api.enums.Role;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "tb_user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID userId;

    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<RentalModel> rentals;
}
