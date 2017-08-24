package com.ybl.om.model.user;

import java.util.Date;

public class RolePermission {
    private Long id;

    private Long roleId;

    private Long permissionId;

    private String createdBy;

    private Date creationTime;

    public RolePermission(Long id, Long roleId, Long permissionId, String createdBy, Date creationTime) {
        this.id = id;
        this.roleId = roleId;
        this.permissionId = permissionId;
        this.createdBy = createdBy;
        this.creationTime = creationTime;
    }

    public RolePermission() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
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