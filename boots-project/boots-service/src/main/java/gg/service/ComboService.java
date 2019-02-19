package gg.service;

import gg.entity.Combo;

import java.util.List;

public interface ComboService {
	Combo findCombo(Integer id);
	
	List findCombos();
}
