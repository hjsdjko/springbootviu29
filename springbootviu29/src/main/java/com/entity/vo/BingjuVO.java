package com.entity.vo;

import com.entity.BingjuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 冰柜
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
public class BingjuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 冰柜品牌
	 */
	
	private String bingjupinpai;
		
	/**
	 * 冰柜规格
	 */
	
	private String bingjuguige;
		
	/**
	 * 冰柜容量
	 */
	
	private String bingjurongliang;
		
	/**
	 * 冰柜位置
	 */
	
	private String bingjuweizhi;
		
	/**
	 * 冰柜标签
	 */
	
	private String bingjubiaoqian;
				
	
	/**
	 * 设置：冰柜品牌
	 */
	 
	public void setBingjupinpai(String bingjupinpai) {
		this.bingjupinpai = bingjupinpai;
	}
	
	/**
	 * 获取：冰柜品牌
	 */
	public String getBingjupinpai() {
		return bingjupinpai;
	}
				
	
	/**
	 * 设置：冰柜规格
	 */
	 
	public void setBingjuguige(String bingjuguige) {
		this.bingjuguige = bingjuguige;
	}
	
	/**
	 * 获取：冰柜规格
	 */
	public String getBingjuguige() {
		return bingjuguige;
	}
				
	
	/**
	 * 设置：冰柜容量
	 */
	 
	public void setBingjurongliang(String bingjurongliang) {
		this.bingjurongliang = bingjurongliang;
	}
	
	/**
	 * 获取：冰柜容量
	 */
	public String getBingjurongliang() {
		return bingjurongliang;
	}
				
	
	/**
	 * 设置：冰柜位置
	 */
	 
	public void setBingjuweizhi(String bingjuweizhi) {
		this.bingjuweizhi = bingjuweizhi;
	}
	
	/**
	 * 获取：冰柜位置
	 */
	public String getBingjuweizhi() {
		return bingjuweizhi;
	}
				
	
	/**
	 * 设置：冰柜标签
	 */
	 
	public void setBingjubiaoqian(String bingjubiaoqian) {
		this.bingjubiaoqian = bingjubiaoqian;
	}
	
	/**
	 * 获取：冰柜标签
	 */
	public String getBingjubiaoqian() {
		return bingjubiaoqian;
	}
			
}
