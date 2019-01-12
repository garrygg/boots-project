package gg.service.impl;

import gg.dao.ComboMapper;
import gg.entity.Combo;
import gg.service.ComboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComboServiceImpl implements ComboService {


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
