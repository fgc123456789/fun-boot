package com.fun.project.admin.system.mapper;

import com.fun.project.admin.system.entity.RoleMenu;

import java.util.List;

/**
 * created by DJun on 2019/9/14 13:24
 * desc: 角色与菜单关联表
 */
public interface RoleMenuMapper {

    /**
     * 通过角色ID删除角色和菜单关联
     *
     * @param roleId 角色ID
     * @return 结果
     */
     int deleteRoleMenuByRoleId(Long roleId);

    /**
     * 批量删除角色菜单关联信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
     int deleteRoleMenu(Long[] ids);

    /**
     * 查询菜单使用数量
     *
     * @param menuId 菜单ID
     * @return 结果
     */
     int selectCountRoleMenuByMenuId(Long menuId);

    /**
     * 批量新增角色菜单信息
     *
     * @param roleMenuList 角色菜单列表
     * @return 结果
     */
     int batchRoleMenu(List<RoleMenu> roleMenuList);

}
