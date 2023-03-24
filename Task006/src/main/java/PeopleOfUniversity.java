public abstract class PeopleOfUniversity implements People{
    private String fullName;
    private int id;

    public PeopleOfUniversity(String fullName, int id){
        this.fullName = fullName;
        this.id = id;
    }

    public String getFullName(){
        return this.fullName;
    }

    public int getId(){
        return this.id;
    }
}
