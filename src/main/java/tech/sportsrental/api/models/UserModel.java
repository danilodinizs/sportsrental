package tech.sportsrental.api.models;

import jakarta.persistence.*;
import lombok.Data;
import tech.sportsrental.api.enums.Role;

import java.util.UUID;

@Data
@Entity
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Rental> rentals;
}
