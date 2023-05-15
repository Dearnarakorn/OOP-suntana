public class Singer {
    String name;
    Singstyle Style = Singstyle.NON;

    
    

    public Singer(String name, Singstyle style) {
        this.name = name;
        Style = style;
    }


    public Singer(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Singstyle getStyle() {
        return Style;
    }
    public void setStyle(Singstyle style) {
        Style = style;
    }


    @Override
    public String toString() {
        return "Singer (" + name + "- SingStyle." + Style + ")";
    }
}
