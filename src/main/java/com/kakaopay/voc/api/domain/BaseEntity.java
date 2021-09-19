package com.kakaopay.voc.api.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @CreatedDate
    @Column(nullable = false , updatable = false, columnDefinition = "datetime")
    private LocalDateTime createdAt;

    /*
    @LastModifiedDate
    @Column(nullable = false, columnDefinition = "datetime")
    private LocalDateTime updatedAt;
    */
}
