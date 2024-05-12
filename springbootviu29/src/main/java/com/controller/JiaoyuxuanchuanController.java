package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiaoyuxuanchuanEntity;
import com.entity.view.JiaoyuxuanchuanView;

import com.service.JiaoyuxuanchuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 教育宣传
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
@RestController
@RequestMapping("/jiaoyuxuanchuan")
public class JiaoyuxuanchuanController {
    @Autowired
    private JiaoyuxuanchuanService jiaoyuxuanchuanService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaoyuxuanchuanEntity jiaoyuxuanchuan,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date fabushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date fabushijianend,
		HttpServletRequest request){
        EntityWrapper<JiaoyuxuanchuanEntity> ew = new EntityWrapper<JiaoyuxuanchuanEntity>();
                if(fabushijianstart!=null) ew.ge("fabushijian", fabushijianstart);
                if(fabushijianend!=null) ew.le("fabushijian", fabushijianend);
		PageUtils page = jiaoyuxuanchuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoyuxuanchuan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaoyuxuanchuanEntity jiaoyuxuanchuan, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date fabushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date fabushijianend,
		HttpServletRequest request){
        EntityWrapper<JiaoyuxuanchuanEntity> ew = new EntityWrapper<JiaoyuxuanchuanEntity>();
                if(fabushijianstart!=null) ew.ge("fabushijian", fabushijianstart);
                if(fabushijianend!=null) ew.le("fabushijian", fabushijianend);
		PageUtils page = jiaoyuxuanchuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoyuxuanchuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaoyuxuanchuanEntity jiaoyuxuanchuan){
       	EntityWrapper<JiaoyuxuanchuanEntity> ew = new EntityWrapper<JiaoyuxuanchuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaoyuxuanchuan, "jiaoyuxuanchuan")); 
        return R.ok().put("data", jiaoyuxuanchuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaoyuxuanchuanEntity jiaoyuxuanchuan){
        EntityWrapper< JiaoyuxuanchuanEntity> ew = new EntityWrapper< JiaoyuxuanchuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaoyuxuanchuan, "jiaoyuxuanchuan")); 
		JiaoyuxuanchuanView jiaoyuxuanchuanView =  jiaoyuxuanchuanService.selectView(ew);
		return R.ok("查询教育宣传成功").put("data", jiaoyuxuanchuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaoyuxuanchuanEntity jiaoyuxuanchuan = jiaoyuxuanchuanService.selectById(id);
        return R.ok().put("data", jiaoyuxuanchuan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaoyuxuanchuanEntity jiaoyuxuanchuan = jiaoyuxuanchuanService.selectById(id);
        return R.ok().put("data", jiaoyuxuanchuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaoyuxuanchuanEntity jiaoyuxuanchuan, HttpServletRequest request){
    	jiaoyuxuanchuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaoyuxuanchuan);
        jiaoyuxuanchuanService.insert(jiaoyuxuanchuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaoyuxuanchuanEntity jiaoyuxuanchuan, HttpServletRequest request){
    	jiaoyuxuanchuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaoyuxuanchuan);
        jiaoyuxuanchuanService.insert(jiaoyuxuanchuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiaoyuxuanchuanEntity jiaoyuxuanchuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaoyuxuanchuan);
        jiaoyuxuanchuanService.updateById(jiaoyuxuanchuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaoyuxuanchuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiaoyuxuanchuanEntity> wrapper = new EntityWrapper<JiaoyuxuanchuanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = jiaoyuxuanchuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
