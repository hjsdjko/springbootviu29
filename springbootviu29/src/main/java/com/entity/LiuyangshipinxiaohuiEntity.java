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
 * 留样食品销毁
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
@TableName("liuyangshipinxiaohui")
public class LiuyangshipinxiaohuiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LiuyangshipinxiaohuiEntity() {
		
	}
	
	public LiuyangshipinxiaohuiEntity(T t) {
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
	 * 员工工号
	 */
					
	private String yuangonggonghao;
	
	/**
	 * 窗口编号
	 */
					
	private String chuangkoubianhao;
	
	/**
	 * 冰柜编号
	 */
					
	private String bingjubianhao;
	
	/**
	 * 留样时间
	 */
					
	private String liuyangshijian;
	
	/**
	 * 食品名称
	 */
					
	private String shipinmingcheng;
	
	/**
	 * 规格
	 */
					
	private String guige;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 销毁时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date xiaohuishijian;
	
	/**
	 * 销毁备注
	 */
					
	private String xiaohuibeizhu;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：留样时间
	 */
	public void setLiuyangshijian(String liuyangshijian) {
		this.liuyangshijian = liuyangshijian;
	}
	/**
	 * 获取：留样时间
	 */
	public String getLiuyangshijian() {
		return liuyangshijian;
	}
	/**
	 * 设置：食品名称
	 */
	public void setShipinmingcheng(String shipinmingcheng) {
		this.shipinmingcheng = shipinmingcheng;
	}
	/**
	 * 获取：食品名称
	 */
	public String getShipinmingcheng() {
		return shipinmingcheng;
	}
	/**
	 * 设置：规格
	 */
	public void setGuige(String guige) {
		this.guige = guige;
	}
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：销毁时间
	 */
	public void setXiaohuishijian(Date xiaohuishijian) {
		this.xiaohuishijian = xiaohuishijian;
	}
	/**
	 * 获取：销毁时间
	 */
	public Date getXiaohuishijian() {
		return xiaohuishijian;
	}
	/**
	 * 设置：销毁备注
	 */
	public void setXiaohuibeizhu(String xiaohuibeizhu) {
		this.xiaohuibeizhu = xiaohuibeizhu;
	}
	/**
	 * 获取：销毁备注
	 */
	public String getXiaohuibeizhu() {
		return xiaohuibeizhu;
	}
	/**
	 * 设置：跨表用户id
	 */
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
	/**
	 * 设置：跨表主键id
	 */
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
