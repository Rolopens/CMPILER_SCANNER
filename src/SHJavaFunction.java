import java.lang.reflect.Parameter;
import java.util.ArrayList;

public class SHJavaFunction {

    private String retType;
    private ArrayList<SHJavaParameter> parameters;
    private String funcName;
    private ArrayList<String> modifiers;

    public SHJavaFunction() {
        parameters = new ArrayList<>();
        modifiers = new ArrayList<>();
    }

    public ArrayList<String> getModifiers() {
        return modifiers;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setRetType(String retType) {
        this.retType = retType;
    }

    public void addParameter(SHJavaParameter parameter){
        parameters.add(parameter);
    }

    public void addModifier(String modifier){
        modifiers.add(modifier);
    }

    public String getRetType() {
        return retType;
    }

    public ArrayList<SHJavaParameter> getParameters() {
        return parameters;
    }

    public int parameterCount(){
        return parameters.size();
    }

    public boolean matchParameters(ArrayList<SHJavaParameter> params){
        boolean temp = true;
        if(!(params.size() == parameters.size())){
            for (int i =0; i<parameters.size();i++){
                if(parameters.get(i).getDataType().equals(params.get(i).getDataType())){
                    temp = false;
                }
            }
        } else {
            temp = false;
        }
        return temp;
    }

    public boolean isAbstract(){
        boolean temp = false;

        for (int i = 0; i < modifiers.size(); i++){
            if(modifiers.get(i).equals("abs")){
                temp = true;
            }
        }
        return temp;
    }
}
