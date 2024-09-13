package com.crs.entities;


import lombok.*;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    @OneToOne
    @JoinColumn(name = "vehicle_id")
    private Car car;

    @Column(name = "booking_date")
    private LocalDateTime bookingDate = LocalDateTime.now();

    private LocalDateTime fromDate;

    private LocalDateTime toDate;

    @Column(nullable = false, columnDefinition = "Double(10,2)")
    private Double tripCost;

    @Column(length = 3, columnDefinition = "varchar(3) default 'sch'")
    private String status;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

    private LocalDateTime returnDate;

    @Column(columnDefinition = "Double(10,2) default 0.0")
    private Double penalty;

}
