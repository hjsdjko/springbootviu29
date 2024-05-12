package com.dao;

import com.entity.ChufagonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChufagonggaoVO;
import com.entity.view.ChufagonggaoView;


/**
 * 处罚公告
 * 
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
public interface ChufagonggaoDao extends BaseMapper<ChufagonggaoEntity> {
	
	List<ChufagonggaoVO> selectListVO(@Param("ew") Wrapper<ChufagonggaoEntity> wrapper);
	
	ChufagonggaoVO selectVO(@Param("ew") Wrapper<ChufagonggaoEntity> wrapper);
	
	List<ChufagonggaoView> selectListView(@Param("ew") Wrapper<ChufagonggaoEntity> wrapper);

	List<ChufagonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<ChufagonggaoEntity> wrapper);
	
	ChufagonggaoView selectView(@Param("ew") Wrapper<ChufagonggaoEntity> wrapper);
	

}
