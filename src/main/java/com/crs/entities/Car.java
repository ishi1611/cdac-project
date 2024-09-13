package com.crs.entities;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "car")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString()
public class Car {

    @Id
    @Column(name = "vehicle_no", columnDefinition = "char(15)")
    private String vehicleNo;

    @Column(length = 25, nullable = false)
    private String brand;

    @Column(length = 25, nullable = false)
    private String model;

    @Column(name = "make_year")
    private LocalDate makeYear;

    @Column(name = "fuel_type", nullable = false)
    private String fuelType;

    @Column(name = "drive_type", nullable = false)
    private String driveType;

    @Column(length = 10, nullable = false)
    private String category;

//    @ManyToOne
//    @JoinColumn(name = "cat_id")
//    private Category category;

    @Column(name = "seating_capacity", length = 2, nullable = false)
    private Integer seatingCapacity;

    @Column(name = "have_abs", nullable = false, columnDefinition = "int default 0")
    private boolean haveABS;

    @Column(name = "have_air_bags", nullable = false, columnDefinition = "int default 0")
    private boolean haveAirBags;

    @Column(name = "base_fare", columnDefinition = "Double(10,2) default 200")
    private Double baseFare;

    @Column(name = "trips_completed", columnDefinition = "int default 0")
    private Integer tripsCompleted = 0;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_id")
    private Branch branch;

    @Column(columnDefinition = "tinyint default 1", nullable = false)
    private Boolean status = true;

    @Column(columnDefinition = "tinyint default 1", nullable = false)
    private Boolean availability = true;

    @Column(columnDefinition = "varchar(255) default 'https://shorturl.at/hqy59'")
    private String imageUrl;

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime modifiedAt = LocalDateTime.now();

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public LocalDate getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(LocalDate makeYear) {
		this.makeYear = makeYear;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getDriveType() {
		return driveType;
	}

	public void setDriveType(String driveType) {
		this.driveType = driveType;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(Integer seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public boolean isHaveABS() {
		return haveABS;
	}

	public void setHaveABS(boolean haveABS) {
		this.haveABS = haveABS;
	}

	public boolean isHaveAirBags() {
		return haveAirBags;
	}

	public void setHaveAirBags(boolean haveAirBags) {
		this.haveAirBags = haveAirBags;
	}

	public Double getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(Double baseFare) {
		this.baseFare = baseFare;
	}

	public Integer getTripsCompleted() {
		return tripsCompleted;
	}

	public void setTripsCompleted(Integer tripsCompleted) {
		this.tripsCompleted = tripsCompleted;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Boolean getAvailability() {
		return availability;
	}

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(LocalDateTime modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
    
    

}
