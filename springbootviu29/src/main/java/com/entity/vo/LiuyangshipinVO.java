package com.entity.vo;

import com.entity.LiuyangshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 留样食品
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
public class LiuyangshipinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date liuyangshijian;
		
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
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 
	public void setLiuyangshijian(Date liuyangshijian) {
		this.liuyangshijian = liuyangshijian;
	}
	
	/**
	 * 获取：留样时间
	 */
	public Date getLiuyangshijian() {
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
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
