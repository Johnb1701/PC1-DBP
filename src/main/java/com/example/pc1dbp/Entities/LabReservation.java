package com.example.pc1dbp.Entities;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class LabReservation {

    private Long id;

    private long slotId;

    private long studentId;

    private String purpose;

    private ZonedDateTime reservedAt;

    private String status;

}
