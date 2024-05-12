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


import com.dao.ChufagonggaoDao;
import com.entity.ChufagonggaoEntity;
import com.service.ChufagonggaoService;
import com.entity.vo.ChufagonggaoVO;
import com.entity.view.ChufagonggaoView;

@Service("chufagonggaoService")
public class ChufagonggaoServiceImpl extends ServiceImpl<ChufagonggaoDao, ChufagonggaoEntity> implements ChufagonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChufagonggaoEntity> page = this.selectPage(
                new Query<ChufagonggaoEntity>(params).getPage(),
                new EntityWrapper<ChufagonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChufagonggaoEntity> wrapper) {
		  Page<ChufagonggaoView> page =new Query<ChufagonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChufagonggaoVO> selectListVO(Wrapper<ChufagonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChufagonggaoVO selectVO(Wrapper<ChufagonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChufagonggaoView> selectListView(Wrapper<ChufagonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChufagonggaoView selectView(Wrapper<ChufagonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
