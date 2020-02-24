package com.andrew.cinema.security;

import com.andrew.cinema.repo.UserDetailsRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserPrincipalDetailsService implements UserDetailsService {

  UserDetailsRepo userRepository;

  @Override
  public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
    return new UserPrincipal(userRepository.findByUsername(s));
  }
}
