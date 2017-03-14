package me.wind.groove.base.domain.model.enums;

/**
 * Created by GrooveWind on 2017/2/23.
 */
public enum Sex {

    UNKNOWN(-1, "unknown"),
    MALE(1, "male"),
    FAMALE(2, "famale"),
    ;

    private int status;
    private String name;

    private Sex(int status, String name) {
        this.status = status;
        this.name = name;
    }

    public static String findNameByStatus(int status) {
        for (Sex sex : Sex.values()) {
            if (sex.getStatus() == status) {
                return sex.getName();
            }
        }
        return UNKNOWN.name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
