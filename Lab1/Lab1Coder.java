
import java.util.ArrayList;

class Lab1Coder{

    private String name;
    int experience;
    private ArrayList<String> languages = new ArrayList<>();

    Lab1Coder(String n,int exp){
        name = n;
        experience = exp;
    }
    Lab1Coder(){}
    Lab1Coder(String n){
        name = n;
        experience = 0;
    }

    void setName(String n){
        name=n;
    }
    void setExperience(int er){
        experience=er;
    }
    String getName(){
        return name;
    }
    int getExperience(){
        return experience;
    }
    void setLanguages(String...lang) {
        for(String l:lang){
            languages.add(l);
        }
    }
    ArrayList<String> getLanguages() {
        return languages;
    }
    
    // public String toString(){
    //     return String.format("%s(%d) knows %s",getName(), getExperience(), getLanguages());
    // }

    public String toString(){
        String l = "";
        for(String lang:languages){
            l += " "+lang;
        }
        return String.format("%s(%d) knows%s",getName(), getExperience(), l);
    }
    
    ArrayList<String> findCommonLanguage(Lab1Coder other){
        ArrayList<String> sameLanguage = new ArrayList<>();
        for(int i=0; i<getLanguages().size();i++){
            for(int j=0; j<other.getLanguages().size();j++){
                if(other.getLanguages().get(j).equals(getLanguages().get(i))){
                    sameLanguage.add(getLanguages().get(i));
                }
            }
        }
        if(sameLanguage.size()==0){
            sameLanguage.add("none");
        }
        return sameLanguage;
    }


    
    



}