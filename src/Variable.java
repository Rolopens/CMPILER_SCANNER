public class Variable {

    private boolean constant = false;
    private boolean isAbstract = false;
    private String acc = ""; //public or private
    private String name = "";
    private String type = "";
    private String value = "";

    public Variable(boolean constant, String acc, String name, String type, String value){
        this.constant = constant;
        this.acc = acc;
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public Variable(boolean isAbstract, String acc, String name, String type){
        this.isAbstract = isAbstract;
        this.acc = acc;
        this.name = name;
        this.type = type;
    }

    public Variable(String acc, String name, String type, String value){
        this.acc = acc;
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public Variable(String acc, String name, String type){
        this.acc = acc;
        this.name = name;
        this.type = type;
    }

    public Variable(){

    }

    public boolean getIsAbstract(){
        return isAbstract;
    }

    public void setAbstract(boolean abs){
        this.isAbstract = abs;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isConstant() {
        return constant;
    }

    public void setConstant(boolean constant) {
        this.constant = constant;
    }
}
