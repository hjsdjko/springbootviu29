package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LiuyangshipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LiuyangshipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LiuyangshipinView;


/**
 * 留样食品
 *
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
public interface LiuyangshipinService extends IService<LiuyangshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiuyangshipinVO> selectListVO(Wrapper<LiuyangshipinEntity> wrapper);
   	
   	LiuyangshipinVO selectVO(@Param("ew") Wrapper<LiuyangshipinEntity> wrapper);
   	
   	List<LiuyangshipinView> selectListView(Wrapper<LiuyangshipinEntity> wrapper);
   	
   	LiuyangshipinView selectView(@Param("ew") Wrapper<LiuyangshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiuyangshipinEntity> wrapper);
   	

}

