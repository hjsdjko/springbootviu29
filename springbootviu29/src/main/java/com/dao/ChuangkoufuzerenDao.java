package com.dao;

import com.entity.ChuangkoufuzerenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuangkoufuzerenVO;
import com.entity.view.ChuangkoufuzerenView;


/**
 * 窗口负责人
 * 
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
public interface ChuangkoufuzerenDao extends BaseMapper<ChuangkoufuzerenEntity> {
	
	List<ChuangkoufuzerenVO> selectListVO(@Param("ew") Wrapper<ChuangkoufuzerenEntity> wrapper);
	
	ChuangkoufuzerenVO selectVO(@Param("ew") Wrapper<ChuangkoufuzerenEntity> wrapper);
	
	List<ChuangkoufuzerenView> selectListView(@Param("ew") Wrapper<ChuangkoufuzerenEntity> wrapper);

	List<ChuangkoufuzerenView> selectListView(Pagination page,@Param("ew") Wrapper<ChuangkoufuzerenEntity> wrapper);
	
	ChuangkoufuzerenView selectView(@Param("ew") Wrapper<ChuangkoufuzerenEntity> wrapper);
	

}
