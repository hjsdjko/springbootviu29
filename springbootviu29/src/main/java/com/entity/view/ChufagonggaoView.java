package com.entity.view;

import com.entity.ChufagonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 处罚公告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
@TableName("chufagonggao")
public class ChufagonggaoView  extends ChufagonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChufagonggaoView(){
	}
 
 	public ChufagonggaoView(ChufagonggaoEntity chufagonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, chufagonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
