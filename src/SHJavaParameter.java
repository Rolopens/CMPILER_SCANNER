public class SHJavaParameter {
    private String dataType;
    private String value;

    public SHJavaParameter(String dataType, String value) {
        this.dataType = dataType;
        this.value = value;
    }

    public String getDataType() {
        return dataType;
    }

    public String getValue() {
        return value;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override public String toString(){
        return "Data Type: " + dataType + " Value: " + value;
    }
}
