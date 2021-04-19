package domain;

public class Mouse extends InputDevice {

    private final int mouseId;
    private static int mouseCounter;

    //We have to create a constructos that recives the same args than the father class.
    public Mouse(String inputType, String mark) {
        super(inputType, mark);

        this.inputType = inputType;
        this.mark = mark;
        this.mouseId = ++Mouse.mouseCounter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mouse{mouseId=").append(mouseId);
        sb.append('}');
        sb.append(", ").append(super.toString());
        return sb.toString();
    }

}
