package com.yc.Service.Impl; 
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.Dao.IYcEmployeeDao;
import com.yc.Entity.YcEmployee;
import com.yc.Service.IYcEmployeeService;
import com.yc.Tool.FengUtil;
import com.yc.Tool.Pager; 
/** 
* YcEmployee服务层 
* Auther:FENG 
*/ 
@Service 
public class YcEmployeeServiceImpl implements IYcEmployeeService { 

	@Autowired
	private IYcEmployeeDao iYcEmployeeDao;

	/** 
	* 获取单页记录 
	* Auther:FENG 
	*/ 
	@Override
	public YcEmployee getSingleInfo(YcEmployee ycemployee) {
		//TODO Auto-generated method stub
		return iYcEmployeeDao.getSingleInfo(ycemployee);
	}
	/** 
	* 获取分页记录 
	* Auther:FENG 
	*/ 
	@Override
	public Pager<YcEmployee> getListPagerInfo(Pager<YcEmployee> pager,YcEmployee ycemployee) {
		//TODO Auto-generated method stub
		Integer sum=iYcEmployeeDao.getSumCount(ycemployee);
		Map<String,Object> map=pager.getElestMap(ycemployee);
		pager.setObjectList(iYcEmployeeDao.getListPagerInfo(map));
		pager.setRecordCount(sum);
		return pager;
	}
	/** 
	* 删除记录 
	* Auther:FENG 
	*/ 
	@Override
	public Integer delSingleInfo(YcEmployee ycemployee) {
		//TODO Auto-generated method stub
		return iYcEmployeeDao.delSingleInfo(ycemployee);
	}
	/** 
	* 获取总记录数 
	* Auther:FENG 
	*/ 
	@Override
	public Integer getSumCount(YcEmployee ycemployee) {
		//TODO Auto-generated method stub
		return iYcEmployeeDao.getSumCount(ycemployee);
	}
	/** 
	* 修改信息 
	* Auther:FENG 
	*/ 
	@Override
	public Integer modSingleInfo(YcEmployee ycemployee) {
		//TODO Auto-generated method stub
		return iYcEmployeeDao.modSingleInfo(ycemployee);
	}
	/** 
	* 添加信息 
	* Auther:FENG 
	*/ 
	@Override
	public Integer addSingleInfo(YcEmployee ycemployee) {
		//TODO Auto-generated method stub
		return iYcEmployeeDao.addSingleInfo(ycemployee);
	}
	
	/**
	 * 员工信息集合查询
	 * Author:luojing
	 * 2016年6月14日 下午4:50:02
	 */
	@Override
	public List<YcEmployee> getEmployee(YcEmployee ye) {
		// TODO Auto-generated method stub
		try{
			List<YcEmployee> list = iYcEmployeeDao.getEmployee(ye);
			if(!list.isEmpty()){
				return list;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 多ID查询 
	 * Author:luojing
	 * 2016年6月14日 上午10:28:13
	 */
	@Override
	public List<YcEmployee> getYcEmployeeInId(List<BigInteger> list) {
		// TODO Auto-generated method stub
		return iYcEmployeeDao.getYcEmployeeInId(list);
	}
	@Override
	public List<YcEmployee> getDriverInfoByDNo(String deliveryNo) {
		// TODO Auto-generated method stub
		return iYcEmployeeDao.getDriverInfoByDNo(deliveryNo);
	}
	@Override
	public List<YcEmployee> getInstallerInfoByDNo(String deliveryNo) {
		// TODO Auto-generated method stub
		return iYcEmployeeDao.getInstallerInfoByDNo(deliveryNo);
	}
	@Override
	public Integer modUseStatusByOrderNo(Integer status, String deliveryNo) {
		// TODO Auto-generated method stub
		Integer result=iYcEmployeeDao.modUseStatusByOrderNo(status, deliveryNo);
		if(result<1){
			FengUtil.RuntimeExceptionFeng("修改安装工状态时异常");
		}
		return result;
	}
	@Override
	public List<YcEmployee> getEmployeeByCarNo(String carNo) {
		// TODO Auto-generated method stub
		return iYcEmployeeDao.getEmployeeByCarNo(carNo);
	}
}
