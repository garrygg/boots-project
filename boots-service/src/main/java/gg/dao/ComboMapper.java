package gg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import gg.entity.Combo;

@Repository
public interface ComboMapper {
	Combo findCombo(Integer id);

	List findCombos();
}
