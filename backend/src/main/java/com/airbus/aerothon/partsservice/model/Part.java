package com.airbus.aerothon.partsservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Part {
	
	@Id
	@GeneratedValue
	Long id;
	
	String partName;
	String materialComposition;
	
	Integer age;
	String condition;
	String location;
	String manufacturer;
	String aircraftModel;
	String potentialUseCases;
	Integer newPartCarbonFootPrint;
	Integer recycledPartCarbonFootPrint;
	Integer newPartWaterUsage;
	Integer recycledPartWaterUsage;
	Integer newPartLandfillWaste;
	Integer recycledPartLandfillWaste;
	Integer newPartEnergyConsumption;
	Integer recycledPartEnergyConsumption;
	Double recyclingRate;
	Double newPartToxicityScore;
	Double recycledPartToxicityScore;
	Double remanufacturingPotential;
	Double lifeCycleAssessment;
	Double renewableMaterialContent;
	Integer carbonFootPrintSaved;
	Integer waterSaved;
	Integer landfillWasteSaved;
	Integer energyConsumptionSaved;
	Double toxicityScoreDifference;
	Double lifeCycleAssessmentScore;
	boolean isRecycled;
	public Long getId() {
		return id;
	}
	public Integer getRecycledPartLandfillWaste() {
		return recycledPartLandfillWaste;
	}
	public void setRecycledPartLandfillWaste(Integer recycledPartLandfillWaste) {
		this.recycledPartLandfillWaste = recycledPartLandfillWaste;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public String getMaterialComposition() {
		return materialComposition;
	}
	public void setMaterialComposition(String materialComposition) {
		this.materialComposition = materialComposition;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getAircraftModel() {
		return aircraftModel;
	}
	public void setAircraftModel(String aircraftModel) {
		this.aircraftModel = aircraftModel;
	}
	public String getPotentialUseCases() {
		return potentialUseCases;
	}
	public void setPotentialUseCases(String potentialUseCases) {
		this.potentialUseCases = potentialUseCases;
	}
	public Integer getNewPartCarbonFootPrint() {
		return newPartCarbonFootPrint;
	}
	public void setNewPartCarbonFootPrint(Integer newPartCarbonFootPrint) {
		this.newPartCarbonFootPrint = newPartCarbonFootPrint;
	}
	public Integer getRecycledPartCarbonFootPrint() {
		return recycledPartCarbonFootPrint;
	}
	public void setRecycledPartCarbonFootPrint(Integer recycledPartCarbonFootPrint) {
		this.recycledPartCarbonFootPrint = recycledPartCarbonFootPrint;
	}
	public Integer getNewPartWaterUsage() {
		return newPartWaterUsage;
	}
	public void setNewPartWaterUsage(Integer newPartWaterUsage) {
		this.newPartWaterUsage = newPartWaterUsage;
	}
	public Integer getRecycledPartWaterUsage() {
		return recycledPartWaterUsage;
	}
	public void setRecycledPartWaterUsage(Integer recycledPartWaterUsage) {
		this.recycledPartWaterUsage = recycledPartWaterUsage;
	}
	public Integer getNewPartLandfillWaste() {
		return newPartLandfillWaste;
	}
	public void setNewPartLandfillWaste(Integer newPartlandfillWaste) {
		this.newPartLandfillWaste = newPartlandfillWaste;
	}
	public Integer getRecycledPartlandfillWaste() {
		return recycledPartLandfillWaste;
	}
	public void setRecycledPartlandfillWaste(Integer recycledPartlandfillWaste) {
		this.recycledPartLandfillWaste = recycledPartlandfillWaste;
	}
	public Integer getNewPartEnergyConsumption() {
		return newPartEnergyConsumption;
	}
	public void setNewPartEnergyConsumption(Integer newPartEnergyConsumption) {
		this.newPartEnergyConsumption = newPartEnergyConsumption;
	}
	public Integer getRecycledPartEnergyConsumption() {
		return recycledPartEnergyConsumption;
	}
	public void setRecycledPartEnergyConsumption(Integer recycledPartEnergyConsumption) {
		this.recycledPartEnergyConsumption = recycledPartEnergyConsumption;
	}
	public Double getRecyclingRate() {
		return recyclingRate;
	}
	public void setRecyclingRate(Double recyclingRate) {
		this.recyclingRate = recyclingRate;
	}
	public Double getNewPartToxicityScore() {
		return newPartToxicityScore;
	}
	public void setNewPartToxicityScore(Double newPartToxicityScore) {
		this.newPartToxicityScore = newPartToxicityScore;
	}
	public Double getRecycledPartToxicityScore() {
		return recycledPartToxicityScore;
	}
	public void setRecycledPartToxicityScore(Double recycledPartToxicityScore) {
		this.recycledPartToxicityScore = recycledPartToxicityScore;
	}
	public Double getRemanufacturingPotential() {
		return remanufacturingPotential;
	}
	public void setRemanufacturingPotential(Double remanufacturingPotential) {
		this.remanufacturingPotential = remanufacturingPotential;
	}
	public Double getLifeCycleAssessment() {
		return lifeCycleAssessment;
	}
	public void setLifeCycleAssessment(Double lifeCycleAssessment) {
		this.lifeCycleAssessment = lifeCycleAssessment;
	}
	public Double getRenewableMaterialContent() {
		return renewableMaterialContent;
	}
	public void setRenewableMaterialContent(Double renewableMaterialContent) {
		this.renewableMaterialContent = renewableMaterialContent;
	}
	public Integer getCarbonFootPrintSaved() {
		return carbonFootPrintSaved;
	}
	public void setCarbonFootPrintSaved(Integer carbonFootPrintSaved) {
		this.carbonFootPrintSaved = carbonFootPrintSaved;
	}
	public Integer getWaterSaved() {
		return waterSaved;
	}
	public void setWaterSaved(Integer waterSaved) {
		this.waterSaved = waterSaved;
	}
	public Integer getLandfillWasteSaved() {
		return landfillWasteSaved;
	}
	public void setLandfillWasteSaved(Integer landfillWasteSaved) {
		this.landfillWasteSaved = landfillWasteSaved;
	}
	public Integer getEnergyConsumptionSaved() {
		return energyConsumptionSaved;
	}
	public void setEnergyConsumptionSaved(Integer energyConsumptionSaved) {
		this.energyConsumptionSaved = energyConsumptionSaved;
	}
	public Double getToxicityScoreDifference() {
		return toxicityScoreDifference;
	}
	public void setToxicityScoreDifference(Double toxicityScoreDifference) {
		this.toxicityScoreDifference = toxicityScoreDifference;
	}
	public Double getLifeCycleAssessmentScore() {
		return lifeCycleAssessmentScore;
	}
	public void setLifeCycleAssessmentScore(Double lifeCycleAssessmentScore) {
		this.lifeCycleAssessmentScore = lifeCycleAssessmentScore;
	}
	public boolean isRecycled() {
		return isRecycled;
	}
	public void setRecycled(boolean isRecycled) {
		this.isRecycled = isRecycled;
	}
	public Part(Long id, String partName, String materialComposition, Integer age, String condition, String location,
			String manufacturer, String aircraftModel, String potentialUseCases, Integer newPartCarbonFootPrint,
			Integer recycledPartCarbonFootPrint, Integer newPartWaterUsage, Integer recycledPartWaterUsage,
			Integer newPartlandfillWaste, Integer recycledPartlandfillWaste, Integer newPartEnergyConsumption,
			Integer recycledPartEnergyConsumption, Double recyclingRate, Double newPartToxicityScore,
			Double recycledPartToxicityScore, Double remanufacturingPotential, Double lifeCycleAssessment,
			Double renewableMaterialContent, Integer carbonFootPrintSaved, Integer waterSaved,
			Integer landfillWasteSaved, Integer energyConsumptionSaved, Double toxicityScoreDifference,
			Double lifeCycleAssessmentScore, boolean isRecycled) {
		super();
		this.id = id;
		this.partName = partName;
		this.materialComposition = materialComposition;
		this.age = age;
		this.condition = condition;
		this.location = location;
		this.manufacturer = manufacturer;
		this.aircraftModel = aircraftModel;
		this.potentialUseCases = potentialUseCases;
		this.newPartCarbonFootPrint = newPartCarbonFootPrint;
		this.recycledPartCarbonFootPrint = recycledPartCarbonFootPrint;
		this.newPartWaterUsage = newPartWaterUsage;
		this.recycledPartWaterUsage = recycledPartWaterUsage;
		this.newPartLandfillWaste = newPartlandfillWaste;
		this.recycledPartLandfillWaste = recycledPartlandfillWaste;
		this.newPartEnergyConsumption = newPartEnergyConsumption;
		this.recycledPartEnergyConsumption = recycledPartEnergyConsumption;
		this.recyclingRate = recyclingRate;
		this.newPartToxicityScore = newPartToxicityScore;
		this.recycledPartToxicityScore = recycledPartToxicityScore;
		this.remanufacturingPotential = remanufacturingPotential;
		this.lifeCycleAssessment = lifeCycleAssessment;
		this.renewableMaterialContent = renewableMaterialContent;
		this.carbonFootPrintSaved = carbonFootPrintSaved;
		this.waterSaved = waterSaved;
		this.landfillWasteSaved = landfillWasteSaved;
		this.energyConsumptionSaved = energyConsumptionSaved;
		this.toxicityScoreDifference = toxicityScoreDifference;
		this.lifeCycleAssessmentScore = lifeCycleAssessmentScore;
		this.isRecycled = isRecycled;
	}
	public Part() {
		super();
	}
}
