
package MainClasses;

public class Customer extends Person {
    private String RoomNo;
    private String RoomType;
    private String RezerType;

    public Customer(String name, String Id, String RoomNo, String RoomType, String Check_in, String Check_out, String rezerType) {
        this.Id = Id;
        this.Fullname = name;
        this.RoomNo = RoomNo;
        this.RoomType = RoomType;
        this.Check_in = Check_in;
        this.Check_out = Check_out;
        this.RezerType = rezerType;
    }

    public String getRezerType() {
        return RezerType;
    }

    public String getRoomNo() {
        return RoomNo;
    }

    public String getRoomType() {
        return RoomType;
    }

    public String getCheck_in() {
        return Check_in;
    }

    public String getCheck_out() {
        return Check_out;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setRoomNo(String RoomNo) {
        this.RoomNo = RoomNo;
    }

    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

    public void setCheck_in(String Check_in) {
        this.Check_in = Check_in;
    }

    public void setCheck_out(String Check_out) {
        this.Check_out = Check_out;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }
    private String Check_in;
    private String Check_out;
    
    
// OverRidding method
public void printinfo() {    
    System.out.println(RoomNo);
    System.out.println(RoomType);
    System.out.println(RezerType);
}
    
}
