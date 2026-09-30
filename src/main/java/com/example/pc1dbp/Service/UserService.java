package com.example.pc1dbp.Service;
import com.example.pc1dbp.User.User;
import com.example.pc1dbp.User.UserRequestDTO;
import com.example.pc1dbp.User.UserResponeDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final ModelMapper modelMapper;

    public UserService(ModelMapper modelMapper){
        this.modelMapper=modelMapper;
    }


    public User convertirDTOAEntidad (UserRequestDTO registroDTO){
        User user = modelMapper.map(registroDTO, User.class);
        return user;
    }

    public UserResponeDTO convertirEntidadADto(User usuario) {
        UserResponeDTO responseDTO = modelMapper.map(usuario, UserResponeDTO.class);
        return responseDTO;
    }




}
