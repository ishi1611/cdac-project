package com.crs.dto.user;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DocumentDto {

    private Long id;

    private Long aadharNo;

    private String drivingNo;

    private String aadharImg;

    private String drivingImg;

    private String photo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(Long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getDrivingNo() {
		return drivingNo;
	}

	public void setDrivingNo(String drivingNo) {
		this.drivingNo = drivingNo;
	}

	public String getAadharImg() {
		return aadharImg;
	}

	public void setAadharImg(String aadharImg) {
		this.aadharImg = aadharImg;
	}

	public String getDrivingImg() {
		return drivingImg;
	}

	public void setDrivingImg(String drivingImg) {
		this.drivingImg = drivingImg;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
    
    

}
