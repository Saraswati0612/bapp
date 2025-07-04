package com.example.bankapp.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface AccountServices {
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
