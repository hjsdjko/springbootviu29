package com.entity.view;

import com.entity.LiuyangshipinxiaohuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 留样食品销毁
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
@TableName("liuyangshipinxiaohui")
public class LiuyangshipinxiaohuiView  extends LiuyangshipinxiaohuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LiuyangshipinxiaohuiView(){
	}
 
 	public LiuyangshipinxiaohuiView(LiuyangshipinxiaohuiEntity liuyangshipinxiaohuiEntity){
 	try {
			BeanUtils.copyProperties(this, liuyangshipinxiaohuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
