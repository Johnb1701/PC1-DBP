package com.example.pc1dbp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EquipmentSlot {

    private long id;

    private long laboratoryId;

    private String equipmentCode;

    private ZonedDateTime startTime;

    private ZonedDateTime endTime;

    private Integer capacity;

    private String status;

}
