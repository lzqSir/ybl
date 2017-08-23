package com.ybl.om.model;

import java.math.BigDecimal;
import java.util.Date;

public class Carpark {
    private Integer id;

    private String carparkName;

    private Integer dbid;

    private String secretKey;

    private Integer groupId;

    private Byte state;

    private String softCode;

    private String parkDes;

    private String address;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private BigDecimal distance;

    private String subAppid;

    private String subMchId;

    private String parkId;

    private Integer totalSpaceCount;

    private Date createdTime;

    private Date lastUpdateTime;

    private String wankeProjectCode;

    private Date wankeSyncHouseTime;

    private Integer remainSpaceCount;

    private Date spaceLastUpdateTime;

    private Short freeTimeMinute;

    private BigDecimal maxFee;

    private Short firstChargeMinute;

    private BigDecimal firstChargeFee;

    private Byte weixinOnliePay;

    private String province;

    private String city;

    private String district;

    private String contactPhone;

    private Byte yuetongEtcPay;

    private String yuetongParkCode;

    private String yuetongOwnerCode;

    private Byte alipayFreeSecret;

    private Byte alipayOnliePay;

    private String parkType;

    private Byte parkMode;

    private String yuetongParkName;

    private String beckMerchantId;

    private String wankeParkingId;

    private String wankeParkingCode;

    private Integer totalMonthrentCount;

    private String accessKey;

    public Carpark(Integer id, String carparkName, Integer dbid, String secretKey, Integer groupId, Byte state, String softCode, String parkDes, String address, BigDecimal longitude, BigDecimal latitude, BigDecimal distance, String subAppid, String subMchId, String parkId, Integer totalSpaceCount, Date createdTime, Date lastUpdateTime, String wankeProjectCode, Date wankeSyncHouseTime, Integer remainSpaceCount, Date spaceLastUpdateTime, Short freeTimeMinute, BigDecimal maxFee, Short firstChargeMinute, BigDecimal firstChargeFee, Byte weixinOnliePay, String province, String city, String district, String contactPhone, Byte yuetongEtcPay, String yuetongParkCode, String yuetongOwnerCode, Byte alipayFreeSecret, Byte alipayOnliePay, String parkType, Byte parkMode, String yuetongParkName, String beckMerchantId, String wankeParkingId, String wankeParkingCode, Integer totalMonthrentCount, String accessKey) {
        this.id = id;
        this.carparkName = carparkName;
        this.dbid = dbid;
        this.secretKey = secretKey;
        this.groupId = groupId;
        this.state = state;
        this.softCode = softCode;
        this.parkDes = parkDes;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.distance = distance;
        this.subAppid = subAppid;
        this.subMchId = subMchId;
        this.parkId = parkId;
        this.totalSpaceCount = totalSpaceCount;
        this.createdTime = createdTime;
        this.lastUpdateTime = lastUpdateTime;
        this.wankeProjectCode = wankeProjectCode;
        this.wankeSyncHouseTime = wankeSyncHouseTime;
        this.remainSpaceCount = remainSpaceCount;
        this.spaceLastUpdateTime = spaceLastUpdateTime;
        this.freeTimeMinute = freeTimeMinute;
        this.maxFee = maxFee;
        this.firstChargeMinute = firstChargeMinute;
        this.firstChargeFee = firstChargeFee;
        this.weixinOnliePay = weixinOnliePay;
        this.province = province;
        this.city = city;
        this.district = district;
        this.contactPhone = contactPhone;
        this.yuetongEtcPay = yuetongEtcPay;
        this.yuetongParkCode = yuetongParkCode;
        this.yuetongOwnerCode = yuetongOwnerCode;
        this.alipayFreeSecret = alipayFreeSecret;
        this.alipayOnliePay = alipayOnliePay;
        this.parkType = parkType;
        this.parkMode = parkMode;
        this.yuetongParkName = yuetongParkName;
        this.beckMerchantId = beckMerchantId;
        this.wankeParkingId = wankeParkingId;
        this.wankeParkingCode = wankeParkingCode;
        this.totalMonthrentCount = totalMonthrentCount;
        this.accessKey = accessKey;
    }

    public Carpark() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarparkName() {
        return carparkName;
    }

    public void setCarparkName(String carparkName) {
        this.carparkName = carparkName == null ? null : carparkName.trim();
    }

    public Integer getDbid() {
        return dbid;
    }

    public void setDbid(Integer dbid) {
        this.dbid = dbid;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey == null ? null : secretKey.trim();
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getSoftCode() {
        return softCode;
    }

    public void setSoftCode(String softCode) {
        this.softCode = softCode == null ? null : softCode.trim();
    }

    public String getParkDes() {
        return parkDes;
    }

    public void setParkDes(String parkDes) {
        this.parkDes = parkDes == null ? null : parkDes.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getDistance() {
        return distance;
    }

    public void setDistance(BigDecimal distance) {
        this.distance = distance;
    }

    public String getSubAppid() {
        return subAppid;
    }

    public void setSubAppid(String subAppid) {
        this.subAppid = subAppid == null ? null : subAppid.trim();
    }

    public String getSubMchId() {
        return subMchId;
    }

    public void setSubMchId(String subMchId) {
        this.subMchId = subMchId == null ? null : subMchId.trim();
    }

    public String getParkId() {
        return parkId;
    }

    public void setParkId(String parkId) {
        this.parkId = parkId == null ? null : parkId.trim();
    }

    public Integer getTotalSpaceCount() {
        return totalSpaceCount;
    }

    public void setTotalSpaceCount(Integer totalSpaceCount) {
        this.totalSpaceCount = totalSpaceCount;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getWankeProjectCode() {
        return wankeProjectCode;
    }

    public void setWankeProjectCode(String wankeProjectCode) {
        this.wankeProjectCode = wankeProjectCode == null ? null : wankeProjectCode.trim();
    }

    public Date getWankeSyncHouseTime() {
        return wankeSyncHouseTime;
    }

    public void setWankeSyncHouseTime(Date wankeSyncHouseTime) {
        this.wankeSyncHouseTime = wankeSyncHouseTime;
    }

    public Integer getRemainSpaceCount() {
        return remainSpaceCount;
    }

    public void setRemainSpaceCount(Integer remainSpaceCount) {
        this.remainSpaceCount = remainSpaceCount;
    }

    public Date getSpaceLastUpdateTime() {
        return spaceLastUpdateTime;
    }

    public void setSpaceLastUpdateTime(Date spaceLastUpdateTime) {
        this.spaceLastUpdateTime = spaceLastUpdateTime;
    }

    public Short getFreeTimeMinute() {
        return freeTimeMinute;
    }

    public void setFreeTimeMinute(Short freeTimeMinute) {
        this.freeTimeMinute = freeTimeMinute;
    }

    public BigDecimal getMaxFee() {
        return maxFee;
    }

    public void setMaxFee(BigDecimal maxFee) {
        this.maxFee = maxFee;
    }

    public Short getFirstChargeMinute() {
        return firstChargeMinute;
    }

    public void setFirstChargeMinute(Short firstChargeMinute) {
        this.firstChargeMinute = firstChargeMinute;
    }

    public BigDecimal getFirstChargeFee() {
        return firstChargeFee;
    }

    public void setFirstChargeFee(BigDecimal firstChargeFee) {
        this.firstChargeFee = firstChargeFee;
    }

    public Byte getWeixinOnliePay() {
        return weixinOnliePay;
    }

    public void setWeixinOnliePay(Byte weixinOnliePay) {
        this.weixinOnliePay = weixinOnliePay;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public Byte getYuetongEtcPay() {
        return yuetongEtcPay;
    }

    public void setYuetongEtcPay(Byte yuetongEtcPay) {
        this.yuetongEtcPay = yuetongEtcPay;
    }

    public String getYuetongParkCode() {
        return yuetongParkCode;
    }

    public void setYuetongParkCode(String yuetongParkCode) {
        this.yuetongParkCode = yuetongParkCode == null ? null : yuetongParkCode.trim();
    }

    public String getYuetongOwnerCode() {
        return yuetongOwnerCode;
    }

    public void setYuetongOwnerCode(String yuetongOwnerCode) {
        this.yuetongOwnerCode = yuetongOwnerCode == null ? null : yuetongOwnerCode.trim();
    }

    public Byte getAlipayFreeSecret() {
        return alipayFreeSecret;
    }

    public void setAlipayFreeSecret(Byte alipayFreeSecret) {
        this.alipayFreeSecret = alipayFreeSecret;
    }

    public Byte getAlipayOnliePay() {
        return alipayOnliePay;
    }

    public void setAlipayOnliePay(Byte alipayOnliePay) {
        this.alipayOnliePay = alipayOnliePay;
    }

    public String getParkType() {
        return parkType;
    }

    public void setParkType(String parkType) {
        this.parkType = parkType == null ? null : parkType.trim();
    }

    public Byte getParkMode() {
        return parkMode;
    }

    public void setParkMode(Byte parkMode) {
        this.parkMode = parkMode;
    }

    public String getYuetongParkName() {
        return yuetongParkName;
    }

    public void setYuetongParkName(String yuetongParkName) {
        this.yuetongParkName = yuetongParkName == null ? null : yuetongParkName.trim();
    }

    public String getBeckMerchantId() {
        return beckMerchantId;
    }

    public void setBeckMerchantId(String beckMerchantId) {
        this.beckMerchantId = beckMerchantId == null ? null : beckMerchantId.trim();
    }

    public String getWankeParkingId() {
        return wankeParkingId;
    }

    public void setWankeParkingId(String wankeParkingId) {
        this.wankeParkingId = wankeParkingId == null ? null : wankeParkingId.trim();
    }

    public String getWankeParkingCode() {
        return wankeParkingCode;
    }

    public void setWankeParkingCode(String wankeParkingCode) {
        this.wankeParkingCode = wankeParkingCode == null ? null : wankeParkingCode.trim();
    }

    public Integer getTotalMonthrentCount() {
        return totalMonthrentCount;
    }

    public void setTotalMonthrentCount(Integer totalMonthrentCount) {
        this.totalMonthrentCount = totalMonthrentCount;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey == null ? null : accessKey.trim();
    }
}