package com.clientGuideline.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="client_guidelines")
public class ClientGuideline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long serviceId;
    private Long customerId;
    private String guideline;
}
