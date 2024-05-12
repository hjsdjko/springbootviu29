package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LiuyangshipinxiaohuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LiuyangshipinxiaohuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LiuyangshipinxiaohuiView;


/**
 * 留样食品销毁
 *
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
public interface LiuyangshipinxiaohuiService extends IService<LiuyangshipinxiaohuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiuyangshipinxiaohuiVO> selectListVO(Wrapper<LiuyangshipinxiaohuiEntity> wrapper);
   	
   	LiuyangshipinxiaohuiVO selectVO(@Param("ew") Wrapper<LiuyangshipinxiaohuiEntity> wrapper);
   	
   	List<LiuyangshipinxiaohuiView> selectListView(Wrapper<LiuyangshipinxiaohuiEntity> wrapper);
   	
   	LiuyangshipinxiaohuiView selectView(@Param("ew") Wrapper<LiuyangshipinxiaohuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiuyangshipinxiaohuiEntity> wrapper);
   	

}

