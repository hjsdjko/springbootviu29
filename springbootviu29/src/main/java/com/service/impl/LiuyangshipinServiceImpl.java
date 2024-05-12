package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LiuyangshipinDao;
import com.entity.LiuyangshipinEntity;
import com.service.LiuyangshipinService;
import com.entity.vo.LiuyangshipinVO;
import com.entity.view.LiuyangshipinView;

@Service("liuyangshipinService")
public class LiuyangshipinServiceImpl extends ServiceImpl<LiuyangshipinDao, LiuyangshipinEntity> implements LiuyangshipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LiuyangshipinEntity> page = this.selectPage(
                new Query<LiuyangshipinEntity>(params).getPage(),
                new EntityWrapper<LiuyangshipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LiuyangshipinEntity> wrapper) {
		  Page<LiuyangshipinView> page =new Query<LiuyangshipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LiuyangshipinVO> selectListVO(Wrapper<LiuyangshipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LiuyangshipinVO selectVO(Wrapper<LiuyangshipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LiuyangshipinView> selectListView(Wrapper<LiuyangshipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LiuyangshipinView selectView(Wrapper<LiuyangshipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
