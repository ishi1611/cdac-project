package com.crs.dto.car;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GetCarDTO {

    private String vehicleNo;

    private String brand;

    private String model;

    private LocalDate makeYear;

    private String fuelType;

    private String driveType;

    private String category;

    private Integer seatingCapacity;

    private boolean haveABS;

    private boolean haveAirBags;

    private Double baseFare;

    private Integer tripsCompleted;

    private Long branchId;

    private boolean status;

    private boolean availability;

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

	public Long getBranchId() {
		return branchId;
	}

	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

    
}
