package com.entity.view;

import com.entity.ChuangkouyuangongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 窗口员工
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
@TableName("chuangkouyuangong")
public class ChuangkouyuangongView  extends ChuangkouyuangongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChuangkouyuangongView(){
	}
 
 	public ChuangkouyuangongView(ChuangkouyuangongEntity chuangkouyuangongEntity){
 	try {
			BeanUtils.copyProperties(this, chuangkouyuangongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
