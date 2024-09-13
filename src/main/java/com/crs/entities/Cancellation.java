package com.crs.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Cancellation")
public class Cancellation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    @Column(length = 255)
    private String description;

    @Column(columnDefinition = "Double(10,2) default 0")
    private Double deductRate;

    @Column(name = "hours_before_booking", nullable = false)
    private LocalTime hoursBeforeBooking;

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

}
