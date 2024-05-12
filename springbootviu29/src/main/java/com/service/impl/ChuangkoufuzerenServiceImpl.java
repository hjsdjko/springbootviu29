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


import com.dao.ChuangkoufuzerenDao;
import com.entity.ChuangkoufuzerenEntity;
import com.service.ChuangkoufuzerenService;
import com.entity.vo.ChuangkoufuzerenVO;
import com.entity.view.ChuangkoufuzerenView;

@Service("chuangkoufuzerenService")
public class ChuangkoufuzerenServiceImpl extends ServiceImpl<ChuangkoufuzerenDao, ChuangkoufuzerenEntity> implements ChuangkoufuzerenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuangkoufuzerenEntity> page = this.selectPage(
                new Query<ChuangkoufuzerenEntity>(params).getPage(),
                new EntityWrapper<ChuangkoufuzerenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuangkoufuzerenEntity> wrapper) {
		  Page<ChuangkoufuzerenView> page =new Query<ChuangkoufuzerenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuangkoufuzerenVO> selectListVO(Wrapper<ChuangkoufuzerenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuangkoufuzerenVO selectVO(Wrapper<ChuangkoufuzerenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuangkoufuzerenView> selectListView(Wrapper<ChuangkoufuzerenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuangkoufuzerenView selectView(Wrapper<ChuangkoufuzerenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
