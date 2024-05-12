package com.entity.view;

import com.entity.LiuyangshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 留样食品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
@TableName("liuyangshipin")
public class LiuyangshipinView  extends LiuyangshipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LiuyangshipinView(){
	}
 
 	public LiuyangshipinView(LiuyangshipinEntity liuyangshipinEntity){
 	try {
			BeanUtils.copyProperties(this, liuyangshipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
