package cn.zjyy.appsys.service.backend;
import cn.zjyy.appsys.pojo.BackendUser;
public interface BackendUserService {
	/**
	 * 用户登录
	 * @param userCode
	 * @param userPassword
	 * @return
	 */
	public BackendUser login(String userCode,String userPassword) throws Exception;
}
