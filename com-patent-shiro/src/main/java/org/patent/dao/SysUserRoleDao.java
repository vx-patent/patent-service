package org.patent.dao;


import org.patent.dao.BaseDao;
import org.patent.entity.SysUserRoleEntity;

import java.util.List;

/**
 * 用户与角色对应关系
 */
public interface SysUserRoleDao extends BaseDao<SysUserRoleEntity> {

  /**
   * 根据用户ID，获取角色ID列表
   */
  List<Long> queryRoleIdList(Long userId);
}
