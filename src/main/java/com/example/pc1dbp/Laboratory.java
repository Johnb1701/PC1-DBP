package com.example.pc1dbp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Laboratory {

    private Long id;

    private String name;

    private String location;

    private Long managerId;

}
