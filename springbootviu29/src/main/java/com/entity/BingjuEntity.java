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
 * 冰柜
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
@TableName("bingju")
public class BingjuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BingjuEntity() {
		
	}
	
	public BingjuEntity(T t) {
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
	 * 冰柜编号
	 */
					
	private String bingjubianhao;
	
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
	 * 设置：冰柜编号
	 */
	public void setBingjubianhao(String bingjubianhao) {
		this.bingjubianhao = bingjubianhao;
	}
	/**
	 * 获取：冰柜编号
	 */
	public String getBingjubianhao() {
		return bingjubianhao;
	}
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
