package jpa_study.jpabook.model6.entity;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class Address {
    private String city;
    private String street;
    private String zipcode;

}
