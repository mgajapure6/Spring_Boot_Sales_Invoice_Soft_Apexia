package com.apexia.common.beans;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="UserMaster")
public class UserMaster implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userId;
	
	private String username;
	private String password;
	private String userFirstName;
	private String userLastName;
	private String userFullName;
	private String userCity;
	private String userState;
	private String userCountry;
	private String userAddress;
	private String userPhone1;
	private String userPhone2;
	private String userEmail;
	@Lob
	byte[] userImage;
	private String userAadharNo;
	private String userPanNo;
	@Lob
	private byte[] userSignImage;
	
	
	private Integer entityId;
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastLoginDate;
	private String activeFlag;
	private String deleteFlag;
	@Temporal(TemporalType.TIMESTAMP)
	private Date operationDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdateDate;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	public String getUserCountry() {
		return userCountry;
	}
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserPhone1() {
		return userPhone1;
	}
	public void setUserPhone1(String userPhone1) {
		this.userPhone1 = userPhone1;
	}
	public String getUserPhone2() {
		return userPhone2;
	}
	public void setUserPhone2(String userPhone2) {
		this.userPhone2 = userPhone2;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public byte[] getUserImage() {
		return userImage;
	}
	public void setUserImage(byte[] userImage) {
		this.userImage = userImage;
	}
	public String getUserAadharNo() {
		return userAadharNo;
	}
	public void setUserAadharNo(String userAadharNo) {
		this.userAadharNo = userAadharNo;
	}
	public String getUserPanNo() {
		return userPanNo;
	}
	public void setUserPanNo(String userPanNo) {
		this.userPanNo = userPanNo;
	}
	public byte[] getUserSignImage() {
		return userSignImage;
	}
	public void setUserSignImage(byte[] userSignImage) {
		this.userSignImage = userSignImage;
	}
	public Integer getEntityId() {
		return entityId;
	}
	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	public String getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	public Date getOperationDate() {
		return operationDate;
	}
	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	@Override
	public String toString() {
		return "UserMaster [userId=" + userId + ", username=" + username + ", password=" + password + ", userFirstName="
				+ userFirstName + ", userLastName=" + userLastName + ", userFullName=" + userFullName + ", userCity="
				+ userCity + ", userState=" + userState + ", userCountry=" + userCountry + ", userAddress="
				+ userAddress + ", userPhone1=" + userPhone1 + ", userPhone2=" + userPhone2 + ", userEmail=" + userEmail
				+ ", userImage=" + Arrays.toString(userImage) + ", userAadharNo=" + userAadharNo + ", userPanNo="
				+ userPanNo + ", userSignImage=" + Arrays.toString(userSignImage) + ", entityId=" + entityId
				+ ", lastLoginDate=" + lastLoginDate + ", activeFlag=" + activeFlag + ", deleteFlag=" + deleteFlag
				+ ", operationDate=" + operationDate + ", lastUpdateDate=" + lastUpdateDate + "]";
	}
	
	
	
}
