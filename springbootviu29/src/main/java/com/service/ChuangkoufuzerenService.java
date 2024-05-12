package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuangkoufuzerenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuangkoufuzerenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuangkoufuzerenView;


/**
 * 窗口负责人
 *
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
public interface ChuangkoufuzerenService extends IService<ChuangkoufuzerenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuangkoufuzerenVO> selectListVO(Wrapper<ChuangkoufuzerenEntity> wrapper);
   	
   	ChuangkoufuzerenVO selectVO(@Param("ew") Wrapper<ChuangkoufuzerenEntity> wrapper);
   	
   	List<ChuangkoufuzerenView> selectListView(Wrapper<ChuangkoufuzerenEntity> wrapper);
   	
   	ChuangkoufuzerenView selectView(@Param("ew") Wrapper<ChuangkoufuzerenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuangkoufuzerenEntity> wrapper);
   	

}

