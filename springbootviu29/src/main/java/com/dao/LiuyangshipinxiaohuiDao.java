package com.dao;

import com.entity.LiuyangshipinxiaohuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LiuyangshipinxiaohuiVO;
import com.entity.view.LiuyangshipinxiaohuiView;


/**
 * 留样食品销毁
 * 
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
public interface LiuyangshipinxiaohuiDao extends BaseMapper<LiuyangshipinxiaohuiEntity> {
	
	List<LiuyangshipinxiaohuiVO> selectListVO(@Param("ew") Wrapper<LiuyangshipinxiaohuiEntity> wrapper);
	
	LiuyangshipinxiaohuiVO selectVO(@Param("ew") Wrapper<LiuyangshipinxiaohuiEntity> wrapper);
	
	List<LiuyangshipinxiaohuiView> selectListView(@Param("ew") Wrapper<LiuyangshipinxiaohuiEntity> wrapper);

	List<LiuyangshipinxiaohuiView> selectListView(Pagination page,@Param("ew") Wrapper<LiuyangshipinxiaohuiEntity> wrapper);
	
	LiuyangshipinxiaohuiView selectView(@Param("ew") Wrapper<LiuyangshipinxiaohuiEntity> wrapper);
	

}
