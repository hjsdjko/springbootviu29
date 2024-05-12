package com.entity.model;

import com.entity.PaibanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 排班信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
public class PaibanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 排班日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date paibanriqi;
		
	/**
	 * 值班时间
	 */
	
	private String zhibanshijian;
				
	
	/**
	 * 设置：员工工号
	 */
	 
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：排班日期
	 */
	 
	public void setPaibanriqi(Date paibanriqi) {
		this.paibanriqi = paibanriqi;
	}
	
	/**
	 * 获取：排班日期
	 */
	public Date getPaibanriqi() {
		return paibanriqi;
	}
				
	
	/**
	 * 设置：值班时间
	 */
	 
	public void setZhibanshijian(String zhibanshijian) {
		this.zhibanshijian = zhibanshijian;
	}
	
	/**
	 * 获取：值班时间
	 */
	public String getZhibanshijian() {
		return zhibanshijian;
	}
			
}
