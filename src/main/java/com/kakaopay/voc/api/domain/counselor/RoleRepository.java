package com.kakaopay.voc.api.domain.counselor;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface RoleRepository extends JpaRepository<Role,Long> {
    List<Role> findAllByCounselorId(String counselorId);

}
