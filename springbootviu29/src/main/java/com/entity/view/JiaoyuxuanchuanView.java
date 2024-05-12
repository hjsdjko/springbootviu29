package com.entity.view;

import com.entity.JiaoyuxuanchuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教育宣传
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
@TableName("jiaoyuxuanchuan")
public class JiaoyuxuanchuanView  extends JiaoyuxuanchuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoyuxuanchuanView(){
	}
 
 	public JiaoyuxuanchuanView(JiaoyuxuanchuanEntity jiaoyuxuanchuanEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoyuxuanchuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
