package gg.service;

import java.util.List;

import gg.entity.Combo;

public interface ComboService {
	Combo findCombo(Integer id);
	
	List findCombos();
}
