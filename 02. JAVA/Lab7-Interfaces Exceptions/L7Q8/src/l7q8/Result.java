package l7q8;

public class Result extends Student implements Sports{

    int sportsGrade;

    public Result(int rollNo, int marks, int sportsGrade) {
        super(rollNo, marks);
        this.sportsGrade = sportsGrade;
    }
    
    @Override
    public int getGrade() {
        return this.sportsGrade;
    }
    
    public float getAllGrades(){
        return (this.marks + this.sportsGrade)/2;
    }
    
}
