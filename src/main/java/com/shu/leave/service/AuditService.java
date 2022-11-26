package com.shu.leave.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shu.leave.entity.Leave;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;


@Service
public interface AuditService {
    @Transactional
    int singleLeaveAudit(String role, String userid, Long id, String result, String recommend);

    /**
     * 分页显示当前登录用户可查看的请假信息
     * @param page
     * @param userId
     * @return 当前登录用户权限所对应的请假信息列表
     */
    Page<Leave> getAuditDataListByUserid(Page<Leave> page, String userId);

    /**
     * 根据传入的条件数组进行复杂查询
     * @param page
     * @param userId
     * @param params
     * @return 返回符合条件的数据并分页展示
     */
    Page<Leave> getAuditSelected(Page<Leave> page, String userId, String[] params);

    /**
     * 返回某一请假信息对应已完成的审核信息（未完成的显示为"无需此步骤"）
     * @author liyuanzhe
     * @date 2022/11/24 13:37
     * @param leaveId
     * @return Map<Object> 根据共需几步审核返回成一个Map字段
     */
    Map<String, Object> getCurrentAuditMsgById(Long leaveId);
}
