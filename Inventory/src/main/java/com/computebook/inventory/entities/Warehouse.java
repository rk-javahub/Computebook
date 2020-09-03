package com.computebook.inventory.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="warehouse_header")
public class Warehouse {
	private String warehouseid;
	private String warehousename;
	private String warehouseadd;
	private List<WarehouseDetails> warehouseDetails;
	private String warehousecmt;
	
	@Id
	public String getWarehouseid() {
		return warehouseid;
	}
	public void setWarehouseid(String warehouseid) {
		this.warehouseid = warehouseid;
	}
	public String getWarehousename() {
		return warehousename;
	}
	public void setWarehousename(String warehousename) {
		this.warehousename = warehousename;
	}
	public String getWarehouseadd() {
		return warehouseadd;
	}
	public void setWarehouseadd(String warehouseadd) {
		this.warehouseadd = warehouseadd;
	}
	public String getWarehousecmt() {
		return warehousecmt;
	}
	public void setWarehousecmt(String warehousecmt) {
		this.warehousecmt = warehousecmt;
	}
	@OneToMany(targetEntity=WarehouseDetails.class,mappedBy="warehouse",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	public List<WarehouseDetails> getWarehouseDetails() {
		return warehouseDetails;
	}
	public void setWarehouseDetails(List<WarehouseDetails> warehouseDetails) {
		this.warehouseDetails = warehouseDetails;
	}
	
	

}
