public class Opgave2 {

    //Globale variable & erklæringer
    int assignmentPoints = 0;
    int examPoints = 0;
    int projectPoints = 0;


    //metoder
    void addPoints(int points, String type){
        if(type.equals("assignmentPoints")){
            assignmentPoints += points;
        }
        else if(type.equals("examPoints")){
            examPoints += points;
        }
        else if(type.equals("projectPoints")){
            projectPoints += points;
        }
        else{
            System.out.println("Invalid parameter(s)");
        }
    }

    int getTotal(){
        int total = assignmentPoints + examPoints + projectPoints;
        return total;
    }

    void printTotal(){
        System.out.println("Total: " + getTotal());
    }

    int getGrade(){
        int grade = getTotal();
        if(grade <= 50){
            return -3;
        }
        else if(grade >= 51 && grade < 70){
            return 00;
        }
        else if(grade >= 71 && grade < 85){
            return 7;
        }
        else if(grade >= 86){
            return 12;
        }

        return grade;
    }



    void main(){

        addPoints(25, "assignmentPoints");
        addPoints(40, "examPoints");
        addPoints(30, "projectPoints");
        printTotal();
        System.out.println("Grade: " + getGrade());


    }

}
