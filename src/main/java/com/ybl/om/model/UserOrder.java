package com.ybl.om.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserOrder {
    private Long id;

    private String orderNo;

    private Long userId;

    private Integer carparkId;

    private Long goodsId;

    private String subject;

    private String body;

    private String carNo;

    private Byte orderType;

    private Date enterTime;

    private BigDecimal shouldCharge;

    private BigDecimal disountFee;

    private BigDecimal alreadyPaid;

    private Integer rechargePeriodQuantity;

    private Byte rechargePeriodUnit;

    private String customer;

    private String phone;

    private String recommend;

    private String remark;

    private Date startDate;

    private Date endDate;

    private Byte orderState;

    private Date paySuccessTime;

    private Date createdTime;

    private Date expireTime;

    private BigDecimal totalMoney;

    private BigDecimal discountMoney;

    private BigDecimal payMoney;

    private String serviceType;

    private Byte payMethod;

    private String payCode;

    private String payOs;

    private String promotionCouponCode;

    private String couponCode;

    private String thirdMerchantId;

    private String beckMerchantId;

    private Long timeoutTaskId;

    private Long promotionId;

    private Long monthrentId;

    private BigDecimal couponMoney;

    private String refundNo;

    private BigDecimal refundMoney;

    private Date refundTime;

    private Byte couponGroupId;

    private Byte promotionGroupId;

    public UserOrder(Long id, String orderNo, Long userId, Integer carparkId, Long goodsId, String subject, String body, String carNo, Byte orderType, Date enterTime, BigDecimal shouldCharge, BigDecimal disountFee, BigDecimal alreadyPaid, Integer rechargePeriodQuantity, Byte rechargePeriodUnit, String customer, String phone, String recommend, String remark, Date startDate, Date endDate, Byte orderState, Date paySuccessTime, Date createdTime, Date expireTime, BigDecimal totalMoney, BigDecimal discountMoney, BigDecimal payMoney, String serviceType, Byte payMethod, String payCode, String payOs, String promotionCouponCode, String couponCode, String thirdMerchantId, String beckMerchantId, Long timeoutTaskId, Long promotionId, Long monthrentId, BigDecimal couponMoney, String refundNo, BigDecimal refundMoney, Date refundTime, Byte couponGroupId, Byte promotionGroupId) {
        this.id = id;
        this.orderNo = orderNo;
        this.userId = userId;
        this.carparkId = carparkId;
        this.goodsId = goodsId;
        this.subject = subject;
        this.body = body;
        this.carNo = carNo;
        this.orderType = orderType;
        this.enterTime = enterTime;
        this.shouldCharge = shouldCharge;
        this.disountFee = disountFee;
        this.alreadyPaid = alreadyPaid;
        this.rechargePeriodQuantity = rechargePeriodQuantity;
        this.rechargePeriodUnit = rechargePeriodUnit;
        this.customer = customer;
        this.phone = phone;
        this.recommend = recommend;
        this.remark = remark;
        this.startDate = startDate;
        this.endDate = endDate;
        this.orderState = orderState;
        this.paySuccessTime = paySuccessTime;
        this.createdTime = createdTime;
        this.expireTime = expireTime;
        this.totalMoney = totalMoney;
        this.discountMoney = discountMoney;
        this.payMoney = payMoney;
        this.serviceType = serviceType;
        this.payMethod = payMethod;
        this.payCode = payCode;
        this.payOs = payOs;
        this.promotionCouponCode = promotionCouponCode;
        this.couponCode = couponCode;
        this.thirdMerchantId = thirdMerchantId;
        this.beckMerchantId = beckMerchantId;
        this.timeoutTaskId = timeoutTaskId;
        this.promotionId = promotionId;
        this.monthrentId = monthrentId;
        this.couponMoney = couponMoney;
        this.refundNo = refundNo;
        this.refundMoney = refundMoney;
        this.refundTime = refundTime;
        this.couponGroupId = couponGroupId;
        this.promotionGroupId = promotionGroupId;
    }

    public UserOrder() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getCarparkId() {
        return carparkId;
    }

    public void setCarparkId(Integer carparkId) {
        this.carparkId = carparkId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo == null ? null : carNo.trim();
    }

    public Byte getOrderType() {
        return orderType;
    }

    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
    }

    public BigDecimal getShouldCharge() {
        return shouldCharge;
    }

    public void setShouldCharge(BigDecimal shouldCharge) {
        this.shouldCharge = shouldCharge;
    }

    public BigDecimal getDisountFee() {
        return disountFee;
    }

    public void setDisountFee(BigDecimal disountFee) {
        this.disountFee = disountFee;
    }

    public BigDecimal getAlreadyPaid() {
        return alreadyPaid;
    }

    public void setAlreadyPaid(BigDecimal alreadyPaid) {
        this.alreadyPaid = alreadyPaid;
    }

    public Integer getRechargePeriodQuantity() {
        return rechargePeriodQuantity;
    }

    public void setRechargePeriodQuantity(Integer rechargePeriodQuantity) {
        this.rechargePeriodQuantity = rechargePeriodQuantity;
    }

    public Byte getRechargePeriodUnit() {
        return rechargePeriodUnit;
    }

    public void setRechargePeriodUnit(Byte rechargePeriodUnit) {
        this.rechargePeriodUnit = rechargePeriodUnit;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend == null ? null : recommend.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Byte getOrderState() {
        return orderState;
    }

    public void setOrderState(Byte orderState) {
        this.orderState = orderState;
    }

    public Date getPaySuccessTime() {
        return paySuccessTime;
    }

    public void setPaySuccessTime(Date paySuccessTime) {
        this.paySuccessTime = paySuccessTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public BigDecimal getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(BigDecimal discountMoney) {
        this.discountMoney = discountMoney;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public Byte getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Byte payMethod) {
        this.payMethod = payMethod;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode == null ? null : payCode.trim();
    }

    public String getPayOs() {
        return payOs;
    }

    public void setPayOs(String payOs) {
        this.payOs = payOs == null ? null : payOs.trim();
    }

    public String getPromotionCouponCode() {
        return promotionCouponCode;
    }

    public void setPromotionCouponCode(String promotionCouponCode) {
        this.promotionCouponCode = promotionCouponCode == null ? null : promotionCouponCode.trim();
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode == null ? null : couponCode.trim();
    }

    public String getThirdMerchantId() {
        return thirdMerchantId;
    }

    public void setThirdMerchantId(String thirdMerchantId) {
        this.thirdMerchantId = thirdMerchantId == null ? null : thirdMerchantId.trim();
    }

    public String getBeckMerchantId() {
        return beckMerchantId;
    }

    public void setBeckMerchantId(String beckMerchantId) {
        this.beckMerchantId = beckMerchantId == null ? null : beckMerchantId.trim();
    }

    public Long getTimeoutTaskId() {
        return timeoutTaskId;
    }

    public void setTimeoutTaskId(Long timeoutTaskId) {
        this.timeoutTaskId = timeoutTaskId;
    }

    public Long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    public Long getMonthrentId() {
        return monthrentId;
    }

    public void setMonthrentId(Long monthrentId) {
        this.monthrentId = monthrentId;
    }

    public BigDecimal getCouponMoney() {
        return couponMoney;
    }

    public void setCouponMoney(BigDecimal couponMoney) {
        this.couponMoney = couponMoney;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo == null ? null : refundNo.trim();
    }

    public BigDecimal getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(BigDecimal refundMoney) {
        this.refundMoney = refundMoney;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public Byte getCouponGroupId() {
        return couponGroupId;
    }

    public void setCouponGroupId(Byte couponGroupId) {
        this.couponGroupId = couponGroupId;
    }

    public Byte getPromotionGroupId() {
        return promotionGroupId;
    }

    public void setPromotionGroupId(Byte promotionGroupId) {
        this.promotionGroupId = promotionGroupId;
    }
}