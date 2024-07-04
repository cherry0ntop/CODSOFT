public class Subjects {
    private double mark;
    private String grade;
    private int creditHrs;
    private double points;
    public Subjects(double mark, int creditHrs){
     setMark(mark);
     setCreditHrs(creditHrs);
        if (this.mark>=90 && this.mark <=100){
        setGrade("A");
        setPoints(4.0);
        }
        
        if (this.mark>=85 && this.mark<90){
        setGrade("A-");
        setPoints(3.66667);
        }
       
        if (this.mark>=80 && this.mark <85){
        setGrade("B+");
        setPoints(3.33333);
        }

        if (this.mark >=75 && this.mark <80){
        setGrade("B");  
        setPoints(3.0); 
        } 

        if (this.mark >=70 && this.mark <75){
        setGrade("B-");
        setPoints(2.66667);
        } 

        if (this.mark >=65 && this.mark <70){
        setGrade("C+");
        setPoints(2.33333);
        } 

        if (this.mark >=60 && this.mark <65){
        setGrade("C");
        setPoints(2.0);
        }

        if (this.mark >=56 && this.mark <60){
        setGrade("C-");
        setPoints(1.66667);
        }

        if (this.mark >=53 && this.mark <56){
        setGrade("D+");
        setPoints(1.33333);
        }

        if (this.mark >=50 && this.mark <53){
        setGrade("D");
        setPoints(1.0);
        }

        if (this.mark>= 0 && this.mark<50) {
        setGrade("F"); 
        setPoints(0);
        }
    }
    
    public double getPoints() {
        return this.points*this.creditHrs;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public double getMark() {
        return this.mark;
    }

    public void setMark(double mark) {
        if (mark>=0)
        this.mark = mark;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getCreditHrs() {
        return this.creditHrs;
    }

    public void setCreditHrs(int creditHrs) {
        if (creditHrs > 0)
        this.creditHrs = creditHrs;
    }
}
