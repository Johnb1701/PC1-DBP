package com.example.pc1dbp.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class EquipmentSlotRequestDTO {

    private String equipmentCode;

    private ZonedDateTime startTime;

    private ZonedDateTime endTime;

    private Integer capacity;

}
