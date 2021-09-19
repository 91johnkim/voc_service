package com.kakaopay.voc.config.security;

import com.kakaopay.voc.api.domain.counselor.Counselor;
import com.kakaopay.voc.api.domain.counselor.CounselorRepository;
import com.kakaopay.voc.api.domain.counselor.Role;
import com.kakaopay.voc.api.domain.counselor.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final CounselorRepository counselorRepository;
    private final RoleRepository roleRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Counselor counselor = counselorRepository.findById(username).orElseThrow(()->new UsernameNotFoundException(username));
        return new User(counselor.getId() , counselor.getPassword() , getAuthorities(counselor.getId()));
    }

    private Collection<GrantedAuthority> getAuthorities(String username){
        List<Role> roles = roleRepository.findAllByCounselorId(username);
        List<GrantedAuthority> authorities = new ArrayList<>();
        for(Role role : roles){
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

}
