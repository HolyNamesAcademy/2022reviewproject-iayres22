import java.util.ArrayList;

public class ArrayListPractice {

    public static int GetFirst(ArrayList<Integer> numbers) {
    return numbers.get(0);
    }

    public static int GetThird(ArrayList<Integer> numbers) {
    return numbers.get(2);
    }

    public static int GetLast(ArrayList<Integer> numbers) {
        return numbers.get(numbers.size() - 1);
    }

    public static int GetSum(ArrayList<Integer> numbers) {
    int sum = 0;
    for(int number: numbers){
        sum += number;
    }
        return sum;
    }

    public static String ConvertToString(ArrayList<Integer> numbers) {
String numberList = "";
        for(int i = 0; i <numbers.size() - 1; i++)
            numberList+=numbers.get(i) + " ";
        numberList+=numbers.get(numbers.size()-1); return numberList;
    }

    public static int GetMax(ArrayList<Integer> numbers) {
    int max = numbers.get(0);
    for(int number: numbers){
        if(number > max){
            max = number;
        }
    }
    return max;
    }

    public static ArrayList<Integer> CreateNumberArray(int first, int last) {
    ArrayList<Integer> numbers = new ArrayList<>();
    for(int i = first; i < last; i++){
        numbers.add(i);
    }
    return numbers;
    }

    public static Student GetFirstStudentWithFavoriteColor(ArrayList<Student> students, String color) {
    for(Student student: students){
        if(student.GetFavoriteColor() == color){
            return student;
        }
    }
    return null;
    }

    public static String GetFavoriteColorOfStudent(ArrayList<Student> students, String name) {
    for(Student student: students){
        if(student.GetName() == name){
            return student.GetFavoriteColor();
        }
    }
    return null;
    }

    public static Student GetTallestStudent(ArrayList<Student> students) {
    Student tallest = students.get(0);
    for(Student student: students){
        if(student.GetHeight() > tallest.GetHeight()){
            tallest = student;
        }
    }
        return tallest;
    }

    public static ArrayList<Student> CreateStudentArray(ArrayList<String> names, ArrayList<Integer> heights, ArrayList<Integer> gradeLevels, ArrayList<String> favoriteColors, ArrayList<BankAccount> bankAccounts) {
    ArrayList<Student> students = new ArrayList<>();
    for(int i = 0; i < names.size(); i++){
        students.add(new Student(names.get(i), heights.get(i), gradeLevels.get(i), favoriteColors.get(i), bankAccounts.get(i)));
    }
      return students;
    }

    public static String GetTeamsString(ArrayList<ArrayList<Student>> teams) {
    String teamsInfo = "";
      for(int i = 0; i < teams.size(); i++){
          int count = 0;
          teamsInfo += "Team " + (i + 1) + ": ";
          for(int b = 0; b < teams.get(i).size() - 1; b++){
              teamsInfo += teams.get(i).get(b).GetName() + ", ";
              count = b + 1;
          }
          teamsInfo += teams.get(i).get(count).GetName() + "\n";
      }
      return teamsInfo;
    }

    public static void UpdateFavoriteColor(ArrayList<Student> students, String name, String newFavoriteColor) {
        for(Student student: students){
            if(student.GetName() == name){
                student.SetFavoriteColor(newFavoriteColor);
            }
        }
    }

    public static ArrayList<Student> GetStudentsInGradeLevel(ArrayList<Student> students, int gradeLevel) {
    ArrayList <Student> gradeLevelStuds = new ArrayList<>();
        for(Student student: students){
        if(student.GetGradeLevel() == gradeLevel){
            gradeLevelStuds.add(student);
        }
    }
        return gradeLevelStuds;
    }

    public static boolean TransferMoney(ArrayList<Student> students, String fromStudentName, String toStudentName, double amount) {
   boolean moneyTransferred = false;
   boolean fromMoney = false;
   boolean toMoney = false;
   int fromIndex = 0;
   int toIndex = 1;
    if(amount > 0){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).GetName() == fromStudentName){
                if(students.get(i).GetBankAccount().GetBalance() > amount){
                    fromMoney = true;
                    fromIndex = i;
                }
            }
            if(students.get(i).GetName() == toStudentName){
                if(students.get(i).GetBankAccount() != null){
                    toMoney = true;
                    toIndex = i;
                }
        }

        if(toMoney&&fromMoney){
        students.get(fromIndex).GetBankAccount().Withdraw(amount);
        students.get(toIndex).GetBankAccount().Deposit(amount);
            moneyTransferred = true;
        }
    }
    }
    return moneyTransferred;
}

    public static void UpdateGradeLevels(ArrayList<Student> students) {
    for(Student student: students){
        if(student.GetGradeLevel() == 12){
            students.remove(student);
        }
        else{
            student.SetGradeLevel(student.GetGradeLevel() + 1);
        }
    }
    }

    /**
     * EXTRA CREDIT:
     * Sort the array list by increasing grade level (all the 9th graders, then 10th graders, etc)
     * If there is a tie (aka 2 people in the same grade), the person whose name is first in the
     * alphabet should appear first.
     *
     * @param students The list of students to sort.
     */
    public static void SortByGradeAndName(ArrayList<Student> students) {
        int lowGrade = students.get(0).GetGradeLevel();
        boolean moreThanOne = false;
        ArrayList <Student> sortedStudent = new ArrayList<>();
        for(Student student: students){
            if(student.GetGradeLevel() < lowGrade){
                lowGrade = student.GetGradeLevel();
            }
        }
        for(Student student: students){

        }
        for(int i = 0; i < students.size(); i++){
            while(sortedStudent.size() <= students.size()) {
                if (students.get(i).GetGradeLevel() == lowGrade) {
                    sortedStudent.add(students.get(i));
                }
                if (students.get(i).GetGradeLevel() == students.get(i + 1).GetGradeLevel()) {
                    moreThanOne = true;
                }
            }
        }
    }
}
