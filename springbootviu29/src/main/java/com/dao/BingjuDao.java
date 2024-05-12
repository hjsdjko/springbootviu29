package com.dao;

import com.entity.BingjuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BingjuVO;
import com.entity.view.BingjuView;


/**
 * 冰柜
 * 
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
public interface BingjuDao extends BaseMapper<BingjuEntity> {
	
	List<BingjuVO> selectListVO(@Param("ew") Wrapper<BingjuEntity> wrapper);
	
	BingjuVO selectVO(@Param("ew") Wrapper<BingjuEntity> wrapper);
	
	List<BingjuView> selectListView(@Param("ew") Wrapper<BingjuEntity> wrapper);

	List<BingjuView> selectListView(Pagination page,@Param("ew") Wrapper<BingjuEntity> wrapper);
	
	BingjuView selectView(@Param("ew") Wrapper<BingjuEntity> wrapper);
	

}
