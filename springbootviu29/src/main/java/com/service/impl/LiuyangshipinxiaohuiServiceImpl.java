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


import com.dao.LiuyangshipinxiaohuiDao;
import com.entity.LiuyangshipinxiaohuiEntity;
import com.service.LiuyangshipinxiaohuiService;
import com.entity.vo.LiuyangshipinxiaohuiVO;
import com.entity.view.LiuyangshipinxiaohuiView;

@Service("liuyangshipinxiaohuiService")
public class LiuyangshipinxiaohuiServiceImpl extends ServiceImpl<LiuyangshipinxiaohuiDao, LiuyangshipinxiaohuiEntity> implements LiuyangshipinxiaohuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LiuyangshipinxiaohuiEntity> page = this.selectPage(
                new Query<LiuyangshipinxiaohuiEntity>(params).getPage(),
                new EntityWrapper<LiuyangshipinxiaohuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LiuyangshipinxiaohuiEntity> wrapper) {
		  Page<LiuyangshipinxiaohuiView> page =new Query<LiuyangshipinxiaohuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LiuyangshipinxiaohuiVO> selectListVO(Wrapper<LiuyangshipinxiaohuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LiuyangshipinxiaohuiVO selectVO(Wrapper<LiuyangshipinxiaohuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LiuyangshipinxiaohuiView> selectListView(Wrapper<LiuyangshipinxiaohuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LiuyangshipinxiaohuiView selectView(Wrapper<LiuyangshipinxiaohuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
