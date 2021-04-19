package domain;

public class Keyboard extends InputDevice {

    private final int keyboardId;
    private static int keyboardCounter;

    public Keyboard(String inputType, String mark) {
        super(inputType, mark);

        this.inputType = inputType;
        this.mark = mark;
        this.keyboardId = ++Keyboard.keyboardCounter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Keyboard{keyboardId=").append(keyboardId);
        sb.append('}');
        sb.append(", ").append(super.toString());
        return sb.toString();
    }
    
    
}
