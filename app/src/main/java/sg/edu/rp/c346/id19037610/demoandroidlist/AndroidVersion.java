package sg.edu.rp.c346.id19037610.demoandroidlist;

public class AndroidVersion {
    private String name;
    private String version;

    public AndroidVersion(String name, String version){
        this.name = name;
        this.version = version;
    }

    public String getName(){
        return name;
    }

    public String getVersion(){
        return version;
    }

    public void setName(String n){
        name = n;
    }

    public void setVersion(String v){
        version = v;
    }

    public String toString(){
        return name +": "+ version;
    }
}
