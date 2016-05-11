package hello;

/**
 * Created by admin on 5/11/16.
 */
public class StateInfo {
    String type;
    DiffValue diffValue;

    public StateInfo(String type, DiffValue diffValue) {
        this.type = type;
        this.diffValue = diffValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DiffValue getDiffValue() {
        return diffValue;
    }

    public void setDiffValue(DiffValue diffValue) {
        this.diffValue = diffValue;
    }
}