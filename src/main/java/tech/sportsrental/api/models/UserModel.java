package tech.sportsrental.api.models;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class UserModel {

    private UUID id;

    private String username;
    private String password;

    private Role role;

    private List<Rental> rentals;
}
