package DTO;

public class ChiTietHoaDonDTO {
    private int invoiceId;
    private int perfumeId;
    private String perfumeName;
    private String sex;
    private String scentType;
    private String brand;
    private double price;
    private int quantity;

    // Constructor đầy đủ
    public ChiTietHoaDonDTO(int invoiceId, int perfumeId, String perfumeName, String sex, String scentType, String brand, double price, int quantity) {
        this.invoiceId = invoiceId;
        this.perfumeId = perfumeId;
        this.perfumeName = perfumeName;
        this.sex = sex;
        this.scentType = scentType;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getPerfumeId() {
        return perfumeId;
    }

    public void setPerfumeId(int perfumeId) {
        this.perfumeId = perfumeId;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
