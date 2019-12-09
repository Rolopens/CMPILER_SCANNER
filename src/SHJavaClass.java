import java.util.ArrayList;

public class SHJavaClass {
    private String name;
    private ArrayList<String> modifiers;
    private ArrayList<SHJavaFunction> functions;
    private SHJavaFunction constructor;
    private ArrayList<Variable> classVars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getModifiers() {
        return modifiers;
    }

    public void setModifiers(ArrayList<String> modifiers) {
        this.modifiers = modifiers;
    }

    public ArrayList<SHJavaFunction> getFunctions() {
        return functions;
    }

    public void setFunctions(ArrayList<SHJavaFunction> functions) {
        this.functions = functions;
    }

    public SHJavaFunction getConstructor() {
        return constructor;
    }

    public void setConstructor(SHJavaFunction constructor) {
        this.constructor = constructor;
    }

    public ArrayList<Variable> getClassVars() {
        return classVars;
    }

    public void setClassVars(ArrayList<Variable> classVars) {
        this.classVars = classVars;
    }

    public SHJavaClass(){
        modifiers = new ArrayList<>();
        functions = new ArrayList<>();
        classVars = new ArrayList<>();
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

    public boolean areAllFunctionsAbstract(){
        boolean temp = true;

        for (int i = 0; i < functions.size(); i++){
            if(!functions.get(i).isAbstract()){
                temp = false;
            }
        }
        return temp;
    }

    public boolean isProperConstructorName(){
        boolean temp = false;
        if(constructor.getFuncName().equals(name)){
            temp = true;
        }
        return temp;
    }

    public boolean areAllVariablesAbstract(){
        boolean temp = true;
        for(int i = 0; i < classVars.size(); i++){
            if(classVars.get(i).getIsAbstract() == false)
            {
                temp = false;
            }
        }


        return temp;
    }
    public void addModifier(String modifier){
        modifiers.add(modifier);
    }

}
