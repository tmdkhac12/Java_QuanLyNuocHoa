package DTO;

public class NuocHoaDTO {
    private int id;
    private String name;
    private String sex;
    private int brand_id;
    private String brand_name;         // Thêm
    private int scent_type_id;
    private String scent_name;         // Thêm
    private int stock;
    private double price;

    public NuocHoaDTO(int id, String name, String sex, int brand_id, String brand_name,
                      int scent_type_id, String scent_name, int stock, double price) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.brand_id = brand_id;
        this.brand_name = brand_name;
        this.scent_type_id = scent_type_id;
        this.scent_name = scent_name;
        this.stock = stock;
        this.price = price;
    }

    // Constructor cũ để dùng trong trường hợp đơn giản
    public NuocHoaDTO(int id, String name, int stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }

    // Getters và Setters đầy đủ
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getBrandId() {
        return brand_id;
    }

    public void setBrandId(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrandName() {
        return brand_name;
    }

    public void setBrandName(String brand_name) {
        this.brand_name = brand_name;
    }

    public int getScentTypeId() {
        return scent_type_id;
    }

    public void setScentTypeId(int scent_type_id) {
        this.scent_type_id = scent_type_id;
    }

    public String getScentName() {
        return scent_name;
    }

    public void setScentName(String scent_name) {
        this.scent_name = scent_name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
}
