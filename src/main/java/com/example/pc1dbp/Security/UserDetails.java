package com.example.pc1dbp.Security;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.stream.Collectors;

import static org.apache.catalina.realm.UserDatabaseRealm.getRoles;

@Entity
@Setter
@Getter
public class Account implements UserDetails {



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return Account.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority("ROLE\_" + role.getName()))
                .collect(Collectors.toList());
    }

    public String getPassword() { return password; }

    @Override
    public String getUsername() { return this.email; }


}

