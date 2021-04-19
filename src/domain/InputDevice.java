package domain;

public class InputDevice {

    protected String inputType;
    protected String mark;

    public InputDevice(String inputType, String mark) {
        this.inputType = inputType;
        this.mark = mark;
    }

    public String getInputType() {
        return this.inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getMark() {
        return this.mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InputDevice{inputType=").append(inputType);
        sb.append(", mark=").append(mark);
        sb.append('}');
        return sb.toString();
    }
}
