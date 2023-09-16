package com.ebuka.hngtasktwo.data.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "person")
@Builder
public class Persons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String emailAddress;
    @Enumerated
    private Gender gender;
//    @OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @Embedded
    private Address address;


}
