package com.dao;

import com.entity.ChuangkouyuangongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuangkouyuangongVO;
import com.entity.view.ChuangkouyuangongView;


/**
 * 窗口员工
 * 
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
public interface ChuangkouyuangongDao extends BaseMapper<ChuangkouyuangongEntity> {
	
	List<ChuangkouyuangongVO> selectListVO(@Param("ew") Wrapper<ChuangkouyuangongEntity> wrapper);
	
	ChuangkouyuangongVO selectVO(@Param("ew") Wrapper<ChuangkouyuangongEntity> wrapper);
	
	List<ChuangkouyuangongView> selectListView(@Param("ew") Wrapper<ChuangkouyuangongEntity> wrapper);

	List<ChuangkouyuangongView> selectListView(Pagination page,@Param("ew") Wrapper<ChuangkouyuangongEntity> wrapper);
	
	ChuangkouyuangongView selectView(@Param("ew") Wrapper<ChuangkouyuangongEntity> wrapper);
	

}
