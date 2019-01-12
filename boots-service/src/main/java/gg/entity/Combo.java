package gg.entity;

import java.io.Serializable;
import java.util.List;

public class Combo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer comboId;
	private String comboName;
	private String comboDesc;
	private Integer status;
	private List items;
	
	public Integer getComboId() {
		return comboId;
	}
	public void setComboId(Integer comboId) {
		this.comboId = comboId;
	}
	public String getComboName() {
		return comboName;
	}
	public void setComboName(String comboName) {
		this.comboName = comboName;
	}
	public String getComboDesc() {
		return comboDesc;
	}
	public void setComboDesc(String comboDesc) {
		this.comboDesc = comboDesc;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public List getItems() {
		return items;
	}
	public void setItems(List items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Combo [comboId=" + comboId + ", comboName=" + comboName + ", comboDesc=" + comboDesc + ", status="
				+ status + ", items=" + items + "]";
	}
	
	
}
