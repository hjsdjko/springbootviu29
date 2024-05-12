package com.dao;

import com.entity.JiaoyuxuanchuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoyuxuanchuanVO;
import com.entity.view.JiaoyuxuanchuanView;


/**
 * 教育宣传
 * 
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
public interface JiaoyuxuanchuanDao extends BaseMapper<JiaoyuxuanchuanEntity> {
	
	List<JiaoyuxuanchuanVO> selectListVO(@Param("ew") Wrapper<JiaoyuxuanchuanEntity> wrapper);
	
	JiaoyuxuanchuanVO selectVO(@Param("ew") Wrapper<JiaoyuxuanchuanEntity> wrapper);
	
	List<JiaoyuxuanchuanView> selectListView(@Param("ew") Wrapper<JiaoyuxuanchuanEntity> wrapper);

	List<JiaoyuxuanchuanView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoyuxuanchuanEntity> wrapper);
	
	JiaoyuxuanchuanView selectView(@Param("ew") Wrapper<JiaoyuxuanchuanEntity> wrapper);
	

}
