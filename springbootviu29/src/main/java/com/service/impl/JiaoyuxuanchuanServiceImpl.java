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


import com.dao.JiaoyuxuanchuanDao;
import com.entity.JiaoyuxuanchuanEntity;
import com.service.JiaoyuxuanchuanService;
import com.entity.vo.JiaoyuxuanchuanVO;
import com.entity.view.JiaoyuxuanchuanView;

@Service("jiaoyuxuanchuanService")
public class JiaoyuxuanchuanServiceImpl extends ServiceImpl<JiaoyuxuanchuanDao, JiaoyuxuanchuanEntity> implements JiaoyuxuanchuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoyuxuanchuanEntity> page = this.selectPage(
                new Query<JiaoyuxuanchuanEntity>(params).getPage(),
                new EntityWrapper<JiaoyuxuanchuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoyuxuanchuanEntity> wrapper) {
		  Page<JiaoyuxuanchuanView> page =new Query<JiaoyuxuanchuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoyuxuanchuanVO> selectListVO(Wrapper<JiaoyuxuanchuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoyuxuanchuanVO selectVO(Wrapper<JiaoyuxuanchuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoyuxuanchuanView> selectListView(Wrapper<JiaoyuxuanchuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoyuxuanchuanView selectView(Wrapper<JiaoyuxuanchuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
