package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChufagonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChufagonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChufagonggaoView;


/**
 * 处罚公告
 *
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
public interface ChufagonggaoService extends IService<ChufagonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChufagonggaoVO> selectListVO(Wrapper<ChufagonggaoEntity> wrapper);
   	
   	ChufagonggaoVO selectVO(@Param("ew") Wrapper<ChufagonggaoEntity> wrapper);
   	
   	List<ChufagonggaoView> selectListView(Wrapper<ChufagonggaoEntity> wrapper);
   	
   	ChufagonggaoView selectView(@Param("ew") Wrapper<ChufagonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChufagonggaoEntity> wrapper);
   	

}

