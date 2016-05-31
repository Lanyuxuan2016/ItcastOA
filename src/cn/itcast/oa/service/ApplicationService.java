package cn.itcast.oa.service;

import java.util.List;

import cn.itcast.oa.base.BaseDao;
import cn.itcast.oa.domain.Application;
import cn.itcast.oa.domain.TaskView;
import cn.itcast.oa.domain.User;

public interface ApplicationService extends BaseDao<Application> {

	/**
	 * 提交申请：
	 * 
	 * 1，保存申请信息
	 * 
	 * 2，启动流程开始流转
	 * 
	 * @param application
	 */
	void submit(Application application);

	/**
	 * 查询我的任务信息列表
	 * 
	 * @param currentUser
	 * @return
	 */
	List<TaskView> getMyTaskViewList(User currentUser);

}
