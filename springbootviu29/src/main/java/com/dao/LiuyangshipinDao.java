package com.dao;

import com.entity.LiuyangshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LiuyangshipinVO;
import com.entity.view.LiuyangshipinView;


/**
 * 留样食品
 * 
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
public interface LiuyangshipinDao extends BaseMapper<LiuyangshipinEntity> {
	
	List<LiuyangshipinVO> selectListVO(@Param("ew") Wrapper<LiuyangshipinEntity> wrapper);
	
	LiuyangshipinVO selectVO(@Param("ew") Wrapper<LiuyangshipinEntity> wrapper);
	
	List<LiuyangshipinView> selectListView(@Param("ew") Wrapper<LiuyangshipinEntity> wrapper);

	List<LiuyangshipinView> selectListView(Pagination page,@Param("ew") Wrapper<LiuyangshipinEntity> wrapper);
	
	LiuyangshipinView selectView(@Param("ew") Wrapper<LiuyangshipinEntity> wrapper);
	

}
