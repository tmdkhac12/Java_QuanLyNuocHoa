/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author hoang
 */
public class ChiTietPhieuNhapDTO {

    private int importReceiptId;
    private int perfumeId;
    private int quantity;
    private double cost;

    private String perfumeName;
    private String sex;
    private String scentType;
    private String brand;
    
    

    public ChiTietPhieuNhapDTO(int importReceiptId, int perfumeId, int quantity, double cost, String perfumeName, String sex, String scentType, String brand ) {
        this.importReceiptId = importReceiptId;
        this.perfumeId = perfumeId;
        this.quantity = quantity;
        this.cost = cost;
        this.perfumeName = perfumeName;
        this.sex = sex;
        this.scentType = scentType;
        this.brand = brand;
    }

    public int getImportReceiptId() {
        return importReceiptId;
    }

    public void setImportReceiptId(int importReceiptId) {
        this.importReceiptId = importReceiptId;
    }

    public int getPerfumeId() {
        return perfumeId;
    }

    public void setPerfumeId(int perfumeId) {
        this.perfumeId = perfumeId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


    public String getPerfumeName() {
        return perfumeName;
    }

    public void setPerfumeName(String perfumeName) {
        this.perfumeName = perfumeName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getScentType() {
        return scentType;
    }

    public void setScentType(String scentType) {
        this.scentType = scentType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
