package com.entity.view;

import com.entity.BingjuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 冰柜
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
@TableName("bingju")
public class BingjuView  extends BingjuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BingjuView(){
	}
 
 	public BingjuView(BingjuEntity bingjuEntity){
 	try {
			BeanUtils.copyProperties(this, bingjuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
