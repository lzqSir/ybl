package com.ybl.om.model;

import java.util.Date;

public class User {
    private Long id;

    private Integer dbid;

    private String phone;

    private String pwd;

    private String email;

    private String nickname;

    private String openid;

    private String appid;

    private String unionid;

    private String province;

    private String city;

    private String country;

    private String headImgUrl;

    private Byte sex;

    private Date birthday;

    private Byte idType;

    private String idNumber;

    private Integer score;

    private Integer loginTimes;

    private String regIp;

    private Date regTime;

    private String lastLoginIp;

    private Date lastLoginTime;

    private Byte status;

    private Date lastUpdateTime;

    private String yitianOpenId;

    private Byte weixinSubscribe;

    private Byte alipaySecretPayment;

    private String alipayAgreementNo;

    private Date alipayValidDate;

    private Byte regSource;

    private String alipayUserId;

    private Byte sendRegistCoupon;

    private Integer recommendNumber;

    public User(Long id, Integer dbid, String phone, String pwd, String email, String nickname, String openid, String appid, String unionid, String province, String city, String country, String headImgUrl, Byte sex, Date birthday, Byte idType, String idNumber, Integer score, Integer loginTimes, String regIp, Date regTime, String lastLoginIp, Date lastLoginTime, Byte status, Date lastUpdateTime, String yitianOpenId, Byte weixinSubscribe, Byte alipaySecretPayment, String alipayAgreementNo, Date alipayValidDate, Byte regSource, String alipayUserId, Byte sendRegistCoupon, Integer recommendNumber) {
        this.id = id;
        this.dbid = dbid;
        this.phone = phone;
        this.pwd = pwd;
        this.email = email;
        this.nickname = nickname;
        this.openid = openid;
        this.appid = appid;
        this.unionid = unionid;
        this.province = province;
        this.city = city;
        this.country = country;
        this.headImgUrl = headImgUrl;
        this.sex = sex;
        this.birthday = birthday;
        this.idType = idType;
        this.idNumber = idNumber;
        this.score = score;
        this.loginTimes = loginTimes;
        this.regIp = regIp;
        this.regTime = regTime;
        this.lastLoginIp = lastLoginIp;
        this.lastLoginTime = lastLoginTime;
        this.status = status;
        this.lastUpdateTime = lastUpdateTime;
        this.yitianOpenId = yitianOpenId;
        this.weixinSubscribe = weixinSubscribe;
        this.alipaySecretPayment = alipaySecretPayment;
        this.alipayAgreementNo = alipayAgreementNo;
        this.alipayValidDate = alipayValidDate;
        this.regSource = regSource;
        this.alipayUserId = alipayUserId;
        this.sendRegistCoupon = sendRegistCoupon;
        this.recommendNumber = recommendNumber;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDbid() {
        return dbid;
    }

    public void setDbid(Integer dbid) {
        this.dbid = dbid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl == null ? null : headImgUrl.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Byte getIdType() {
        return idType;
    }

    public void setIdType(Byte idType) {
        this.idType = idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp == null ? null : regIp.trim();
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getYitianOpenId() {
        return yitianOpenId;
    }

    public void setYitianOpenId(String yitianOpenId) {
        this.yitianOpenId = yitianOpenId == null ? null : yitianOpenId.trim();
    }

    public Byte getWeixinSubscribe() {
        return weixinSubscribe;
    }

    public void setWeixinSubscribe(Byte weixinSubscribe) {
        this.weixinSubscribe = weixinSubscribe;
    }

    public Byte getAlipaySecretPayment() {
        return alipaySecretPayment;
    }

    public void setAlipaySecretPayment(Byte alipaySecretPayment) {
        this.alipaySecretPayment = alipaySecretPayment;
    }

    public String getAlipayAgreementNo() {
        return alipayAgreementNo;
    }

    public void setAlipayAgreementNo(String alipayAgreementNo) {
        this.alipayAgreementNo = alipayAgreementNo == null ? null : alipayAgreementNo.trim();
    }

    public Date getAlipayValidDate() {
        return alipayValidDate;
    }

    public void setAlipayValidDate(Date alipayValidDate) {
        this.alipayValidDate = alipayValidDate;
    }

    public Byte getRegSource() {
        return regSource;
    }

    public void setRegSource(Byte regSource) {
        this.regSource = regSource;
    }

    public String getAlipayUserId() {
        return alipayUserId;
    }

    public void setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId == null ? null : alipayUserId.trim();
    }

    public Byte getSendRegistCoupon() {
        return sendRegistCoupon;
    }

    public void setSendRegistCoupon(Byte sendRegistCoupon) {
        this.sendRegistCoupon = sendRegistCoupon;
    }

    public Integer getRecommendNumber() {
        return recommendNumber;
    }

    public void setRecommendNumber(Integer recommendNumber) {
        this.recommendNumber = recommendNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", dbid=" + dbid +
                ", phone='" + phone + '\'' +
                ", pwd='" + pwd + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", openid='" + openid + '\'' +
                ", appid='" + appid + '\'' +
                ", unionid='" + unionid + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", headImgUrl='" + headImgUrl + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", idType=" + idType +
                ", idNumber='" + idNumber + '\'' +
                ", score=" + score +
                ", loginTimes=" + loginTimes +
                ", regIp='" + regIp + '\'' +
                ", regTime=" + regTime +
                ", lastLoginIp='" + lastLoginIp + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                ", status=" + status +
                ", lastUpdateTime=" + lastUpdateTime +
                ", yitianOpenId='" + yitianOpenId + '\'' +
                ", weixinSubscribe=" + weixinSubscribe +
                ", alipaySecretPayment=" + alipaySecretPayment +
                ", alipayAgreementNo='" + alipayAgreementNo + '\'' +
                ", alipayValidDate=" + alipayValidDate +
                ", regSource=" + regSource +
                ", alipayUserId='" + alipayUserId + '\'' +
                ", sendRegistCoupon=" + sendRegistCoupon +
                ", recommendNumber=" + recommendNumber +
                '}';
    }
}