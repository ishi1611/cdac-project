package com.crs.entities;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "documents")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "user")
public class Documents extends BaseEntity {

    @Id
    @Column(name = "user_id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User userId;

    @Column(name = "aadharno", nullable = false)
    private Long aadharNo;

    @Column(name = "drivingno", length = 16, nullable = false)
    private String drivingNo;

    @Column(name = "aadhar", nullable = false)
    private String aadharImg;

    @Column(name = "driving", nullable = false)
    private String drivingImg;

    @Column(name = "photo", nullable = false)
    private String photo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
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
