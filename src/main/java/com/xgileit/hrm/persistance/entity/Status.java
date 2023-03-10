package com.xgileit.hrm.persistance.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "status")
public class Status implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int statusId;

    @Column(nullable = false, length = 255)
    private String statusName;

    @OneToMany(mappedBy = "status")
    private List<User> user;
}
