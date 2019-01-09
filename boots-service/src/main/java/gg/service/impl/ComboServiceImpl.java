package gg.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gg.dao.ComboMapper;
import gg.entity.Combo;
import gg.service.ComboService;

@Service
public class ComboServiceImpl implements ComboService {
	
	
	private static final Logger log = 
			LoggerFactory.getLogger(ComboServiceImpl.class);

	
	@Autowired
	private ComboMapper comboMapper;
	@Override
	public Combo findCombo(Integer id) {
		// TODO Auto-generated method stub
		return comboMapper.findCombo(id);
	}

	@Override
	public List findCombos() {
		// TODO Auto-generated method stub
		return comboMapper.findCombos();
	}

}
