package com.example.library_management.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "authors")
@Data
public class Author {

    @Id
    @UuidGenerator
    private UUID id;

    @Column(nullable = false)
    @NotBlank
    private String name;

    private LocalDate dateOfBirth;

    @Column(length = 1000)
    private String bio;
}