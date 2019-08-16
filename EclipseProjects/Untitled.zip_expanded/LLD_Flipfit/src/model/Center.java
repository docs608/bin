package model;

import java.io.Serializable;

public class Center implements Serializable {

    private static final long serialVersionUID = -6498822736832597642L;

    private int id;

    private String centerName;

    private String centerEmail;

    private String centerAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterEmail() {
        return centerEmail;
    }

    public void setCenterEmail(String centerEmail) {
        this.centerEmail = centerEmail;
    }

    public String getCenterAddress() {
        return centerAddress;
    }

    public void setCenterAddress(String centerAddress) {
        this.centerAddress = centerAddress;
    }

    @Override
    public String toString() {
        return "Center{" +
                "id=" + id +
                ", centerName='" + centerName + '\'' +
                ", centerEmail='" + centerEmail + '\'' +
                ", centerAddress='" + centerAddress + '\'' +
                '}';
    }
}
