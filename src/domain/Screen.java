package domain;

public class Screen {

    private final int screenId;
    private String mark;
    private double size;
    private static int screenCounter;
    
    private Screen() {
        this.screenId = ++Screen.screenCounter;
    }
    
    public Screen(String mark, double size) {
        this();
        this.mark = mark;
        this.size = size;
    }
    
    public int getScreenId() {
        return this.screenId;
    }
    
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Screen{screenId=").append(screenId);
        sb.append(", mark=").append(mark);
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }

   
    
    
}
