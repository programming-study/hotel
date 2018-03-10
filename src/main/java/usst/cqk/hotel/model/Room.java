package usst.cqk.hotel.model;

public class Room {
    private String roomId;
    private int roomFloor;
    private String roomProporty;
    private String roomDirection;
    private String roomStatus;
    private long leaveRoomTime;
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public long getLeaveRoomTime() {
        return leaveRoomTime;
    }

    public void setLeaveRoomTime(long leaveRoomTime) {
        this.leaveRoomTime = leaveRoomTime;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    public String getRoomDirection() {
        return roomDirection;
    }

    public void setRoomDirection(String roomDirection) {
        this.roomDirection = roomDirection;
    }

    public String getRoomProporty() {
        return roomProporty;
    }

    public void setRoomProporty(String roomProporty) {
        this.roomProporty = roomProporty;
    }

    public int getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(int roomFloor) {
        this.roomFloor = roomFloor;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
}
