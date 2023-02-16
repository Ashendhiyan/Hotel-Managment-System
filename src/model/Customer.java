package model;

public class Customer   {
    private String name;
    private String nic;
    private String telNo;
    private String roomType;
    private String checkIn;
    private String checkOut;

    public Customer() {
    }

    public Customer(String name, String nic, String telNo, String roomType, String checkIn, String checkOut) {
        this.setName(name);
        this.setNic(nic);
        this.setTelNo(telNo);
        this.setRoomType(roomType);
        this.setCheckIn(checkIn);
        this.setCheckOut(checkOut);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                ", telNo='" + telNo + '\'' +
                ", roomType='" + roomType + '\'' +
                ", checkIn='" + checkIn + '\'' +
                ", checkOut='" + checkOut + '\'' +
                '}';
    }
}
