package pojo;

public class Commodity {
    String name;
    String ownerID;
    String id;
    String arriveDate;
    String recevieDate;
    String warehouse;
    String takingCode;

    public Commodity(String name, String ownerID, String id, String arriveDate, String recevieDate,String warehouse, String takingCode) {
        this.name = name;
        this.ownerID = ownerID;
        this.id = id;
        this.arriveDate = arriveDate;
        this.recevieDate = recevieDate;
        this.takingCode = takingCode;
        this.warehouse = warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public String getTakingCode() { return takingCode; }

    public String getName() {
        return name;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public String getId() {
        return id;
    }

    public String getArriveDate() {
        return arriveDate;
    }

    public String getRecevieDate() {
        return recevieDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void setArriveDate(String arriveDate) {
        this.arriveDate = arriveDate;
    }

    public void setRecevieDate(String recevieDate) {
        this.recevieDate = recevieDate;
    }

    public void setTakingCode(String takingCode) { this.takingCode = takingCode; }

    @Override
    public String toString() {
        return "{name:"+name +
                "    ownerID:" + ownerID +
                "    id:" + id +
                "    arriveDate:" + arriveDate +
                "    recevieDate:" + recevieDate +
                "    warehouse:" + warehouse +
                "    takingCode:" + takingCode;
    }
}
