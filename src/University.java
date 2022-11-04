public class University {
    private String univerName;
    private String countryName;
    private int raiting;

    public void setName (String univerName){
        this.univerName=univerName;
    }public String getName (){
        return univerName;
    }public void setCountryName (String countryName){
        this.countryName=countryName;
    }public String getCountryName (){
        return countryName;
    }public void setRaiting (int raiting){
        this.raiting=raiting;
    }public int getRaiting (){
        return raiting;
    }
}
