public class School {
    private String schoolName;
    private String cityName;
    private int numberOfStudents;

    public void setName (String schoolName){
        this.schoolName=schoolName;
    }public String getName (){
        return schoolName;
    }public void setCityName (String cityName){
        this.cityName=cityName;
    }public String getCityName (){
        return cityName;
    }public void setNumberOfStudents (int numberOfStudents){
        this.numberOfStudents=numberOfStudents;
    }public int getNumberOfStudents (){
        return numberOfStudents;
    }
}
