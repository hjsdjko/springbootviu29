package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 排班信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
@TableName("paibanxinxi")
public class PaibanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PaibanxinxiEntity() {
		
	}
	
	public PaibanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 窗口编号
	 */
					
	private String chuangkoubianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date paibanriqi;
	
	/**
	 * 值班时间
	 */
					
	private String zhibanshijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：窗口编号
	 */
	public void setChuangkoubianhao(String chuangkoubianhao) {
		this.chuangkoubianhao = chuangkoubianhao;
	}
	/**
	 * 获取：窗口编号
	 */
	public String getChuangkoubianhao() {
		return chuangkoubianhao;
	}
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
