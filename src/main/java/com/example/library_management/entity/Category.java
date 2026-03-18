package com.example.library_management.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "categories")
@Data
public class Category {

    @Id
    @UuidGenerator
    private UUID id;

    @Column(nullable = false, unique = true)
    @NotBlank
    private String name;

    private String description;
}
