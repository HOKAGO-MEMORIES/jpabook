package jpa_study.jpabook.model5.entity;

import jakarta.persistence.MappedSuperclass;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {
    private Date createdDate;       // 등록일
    private Date lastModifiedDate;  // 수정일

}
