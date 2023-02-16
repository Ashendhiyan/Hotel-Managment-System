package view.tm;

import javafx.scene.control.Button;

public class CustomerTM {
    private String name;
    private String nic;
    private String telNo;
    private String roomType;
    private String checkIn;
    private String checkOut;
    private Button  btn;

    public CustomerTM() {

    }

    public CustomerTM(String name, String nic, String telNo, String roomType, String checkIn, String checkOut, Button btn) {
        this.setName(name);
        this.setNic(nic);
        this.setTelNo(telNo);
        this.setRoomType(roomType);
        this.setCheckIn(checkIn);
        this.setCheckOut(checkOut);
        this.setBtn(btn);
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

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
