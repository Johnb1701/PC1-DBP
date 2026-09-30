package com.example.pc1dbp.Service;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final ModelMapper modelMapper;

    public UserService(ModelMapper modelMapper){
        this.modelMapper=modelMapper;
    }




}
