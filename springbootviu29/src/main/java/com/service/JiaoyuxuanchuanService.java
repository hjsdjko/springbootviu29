package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoyuxuanchuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoyuxuanchuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoyuxuanchuanView;


/**
 * 教育宣传
 *
 * @author 
 * @email 
 * @date 2022-04-26 22:52:55
 */
public interface JiaoyuxuanchuanService extends IService<JiaoyuxuanchuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoyuxuanchuanVO> selectListVO(Wrapper<JiaoyuxuanchuanEntity> wrapper);
   	
   	JiaoyuxuanchuanVO selectVO(@Param("ew") Wrapper<JiaoyuxuanchuanEntity> wrapper);
   	
   	List<JiaoyuxuanchuanView> selectListView(Wrapper<JiaoyuxuanchuanEntity> wrapper);
   	
   	JiaoyuxuanchuanView selectView(@Param("ew") Wrapper<JiaoyuxuanchuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoyuxuanchuanEntity> wrapper);
   	

}

