package com.sfda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Getter
public class Users {
	@Id
	@Column
    private long id;

    @Column
    @NotNull(message="{NotNull.User.firstName}")
    private String firstName;
    
    @Column
    @NotNull(message="{NotNull.User.lastName}")
    private String lastName;
    
    @Column
    @NotNull(message="{NotNull.User.email}")
    private String email;
    
    @Column
    @NotNull(message="{NotNull.User.type}")
    private String type;
}