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


import com.dao.BingjuDao;
import com.entity.BingjuEntity;
import com.service.BingjuService;
import com.entity.vo.BingjuVO;
import com.entity.view.BingjuView;

@Service("bingjuService")
public class BingjuServiceImpl extends ServiceImpl<BingjuDao, BingjuEntity> implements BingjuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BingjuEntity> page = this.selectPage(
                new Query<BingjuEntity>(params).getPage(),
                new EntityWrapper<BingjuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BingjuEntity> wrapper) {
		  Page<BingjuView> page =new Query<BingjuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BingjuVO> selectListVO(Wrapper<BingjuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BingjuVO selectVO(Wrapper<BingjuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BingjuView> selectListView(Wrapper<BingjuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BingjuView selectView(Wrapper<BingjuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
