package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    private String userName;


}
