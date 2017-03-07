package com.ws.business.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ZhsVideoAgency implements Serializable{
    private static final long serialVersionUID = -197299432070417827L;
    private Integer id;

    private Integer agencyId;

    private Integer fatherId;

    private String agencyName;

    private String agencyAccount;

    private Integer provinceId;

    private String provinceName;

    private Integer cityId;

    private String cityName;

    private Integer areaId;

    private String areaName;

    private Integer isOpenService;

    private Integer isOfflineChargeOpen;

    private Date createTime;

    private String createAccount;

    private Date updateTime;

    private String updateAccount;

    private String cameraSn;//为了代理商列表页查询摄像头sn传参

    private List<Integer> agencyIds;//为了接收用户中心返回的参数

    public List<Integer> getAgencyIds() {
        return agencyIds;
    }

    public void setAgencyIds(List<Integer> agencyIds) {
        this.agencyIds = agencyIds;
    }

    public String getCameraSn() {
        return cameraSn;
    }

    public void setCameraSn(String cameraSn) {
        this.cameraSn = cameraSn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getAgencyAccount() {
        return agencyAccount;
    }

    public void setAgencyAccount(String agencyAccount) {
        this.agencyAccount = agencyAccount;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getIsOpenService() {
        return isOpenService;
    }

    public void setIsOpenService(Integer isOpenService) {
        this.isOpenService = isOpenService;
    }

    public Integer getIsOfflineChargeOpen() {
        return isOfflineChargeOpen;
    }

    public void setIsOfflineChargeOpen(Integer isOfflineChargeOpen) {
        this.isOfflineChargeOpen = isOfflineChargeOpen;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateAccount() {
        return createAccount;
    }

    public void setCreateAccount(String createAccount) {
        this.createAccount = createAccount;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateAccount() {
        return updateAccount;
    }

    public void setUpdateAccount(String updateAccount) {
        this.updateAccount = updateAccount;
    }
}