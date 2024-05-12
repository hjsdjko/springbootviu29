package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BingjuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BingjuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BingjuView;


/**
 * 冰柜
 *
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
public interface BingjuService extends IService<BingjuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BingjuVO> selectListVO(Wrapper<BingjuEntity> wrapper);
   	
   	BingjuVO selectVO(@Param("ew") Wrapper<BingjuEntity> wrapper);
   	
   	List<BingjuView> selectListView(Wrapper<BingjuEntity> wrapper);
   	
   	BingjuView selectView(@Param("ew") Wrapper<BingjuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BingjuEntity> wrapper);
   	

}

