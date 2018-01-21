package com.yc.Dao; 
import java.util.List;

import com.yc.Entity.YcJoinInfo;
import com.yc.Tool.ISqlDao; 
/** 
* YcJoinInfo数据层 
* Author:luojing 
*/ 
public interface IYcJoinInfoDao extends ISqlDao<YcJoinInfo> {  

	/**
	 * 集合查询加盟商信息
	 * Author:luojing
	 * 2016年6月20日 上午10:32:13
	 */
	public List<YcJoinInfo> getYcJoinInfoList(YcJoinInfo join);
	
	/**
	 * 查询加盟商信息
	 * @Author:luojing
	 * @2016年7月20日 上午10:18:22
	 */
	public YcJoinInfo getJoinInfo(YcJoinInfo join);
}
