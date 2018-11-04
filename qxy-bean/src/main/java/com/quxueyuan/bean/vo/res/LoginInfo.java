package com.quxueyuan.bean.vo.res;

import com.quxueyuan.bean.domain.SysPermissionDTO;
import com.quxueyuan.bean.domain.SysRole;
import com.quxueyuan.bean.domain.SysUser;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class LoginInfo implements Serializable {
    private SysUser userInfo;
    private List<SysRole> roleList;
    private SysPermissionDTO permissionTree;
    private String ticket;
}
