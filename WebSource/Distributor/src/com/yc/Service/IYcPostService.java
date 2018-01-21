package com.yc.Service; 
import java.util.List;

import com.yc.Entity.YcPost;
import com.yc.Tool.ISqlServer; 
/** 
* YcPost服务接口层 
* Author:luojing 
*/ 
public interface IYcPostService extends ISqlServer<YcPost> {  

	/**
	 * 职位集合查询
	 * Author:luojing
	 * 2016年6月16日 下午4:16:25
	 */
	public List<YcPost> getPost(YcPost post);
}
