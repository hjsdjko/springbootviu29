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


import com.dao.ChuangkouyuangongDao;
import com.entity.ChuangkouyuangongEntity;
import com.service.ChuangkouyuangongService;
import com.entity.vo.ChuangkouyuangongVO;
import com.entity.view.ChuangkouyuangongView;

@Service("chuangkouyuangongService")
public class ChuangkouyuangongServiceImpl extends ServiceImpl<ChuangkouyuangongDao, ChuangkouyuangongEntity> implements ChuangkouyuangongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuangkouyuangongEntity> page = this.selectPage(
                new Query<ChuangkouyuangongEntity>(params).getPage(),
                new EntityWrapper<ChuangkouyuangongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuangkouyuangongEntity> wrapper) {
		  Page<ChuangkouyuangongView> page =new Query<ChuangkouyuangongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuangkouyuangongVO> selectListVO(Wrapper<ChuangkouyuangongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuangkouyuangongVO selectVO(Wrapper<ChuangkouyuangongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuangkouyuangongView> selectListView(Wrapper<ChuangkouyuangongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuangkouyuangongView selectView(Wrapper<ChuangkouyuangongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
