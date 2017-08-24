package com.ybl.om.model.user;

import java.util.Date;

public class Permission {
    private Long id;

    private String permissionName;

    private String permissionPoint;

    private String permission_url;

    public String getPermission_url() {
        return permission_url;
    }

    public void setPermission_url(String permission_url) {
        this.permission_url = permission_url;
    }

    private String createdBy;

    private Date creationTime;

    public Permission(Long id, String permissionName, String permissionPoint, String createdBy, Date creationTime) {
        this.id = id;
        this.permissionName = permissionName;
        this.permissionPoint = permissionPoint;
        this.createdBy = createdBy;
        this.creationTime = creationTime;
    }

    public Permission() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getPermissionPoint() {
        return permissionPoint;
    }

    public void setPermissionPoint(String permissionPoint) {
        this.permissionPoint = permissionPoint == null ? null : permissionPoint.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }
}