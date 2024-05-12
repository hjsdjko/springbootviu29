package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuangkouyuangongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuangkouyuangongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuangkouyuangongView;


/**
 * 窗口员工
 *
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
public interface ChuangkouyuangongService extends IService<ChuangkouyuangongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuangkouyuangongVO> selectListVO(Wrapper<ChuangkouyuangongEntity> wrapper);
   	
   	ChuangkouyuangongVO selectVO(@Param("ew") Wrapper<ChuangkouyuangongEntity> wrapper);
   	
   	List<ChuangkouyuangongView> selectListView(Wrapper<ChuangkouyuangongEntity> wrapper);
   	
   	ChuangkouyuangongView selectView(@Param("ew") Wrapper<ChuangkouyuangongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuangkouyuangongEntity> wrapper);
   	

}

