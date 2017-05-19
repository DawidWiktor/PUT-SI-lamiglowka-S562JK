package s562jk;
import org.jpl7.Query;

public class S562JK {
    public static void main(String[] args) {
        String t1 = "consult('Lamiglowka S562JK.pl')";
        Query q1 = new Query(t1);
        q1.hasSolution();
        String t2 = "s562jk(A1,A2,A3,A4,A5, B1,B2,B3,B4,B5, C1,C2,C3,C4,C5)";
        Query q2 = new Query(t2);
        String[][] wynik = new String[6][4];
        wynik[0][0] = "Wedding Year";
        wynik[0][1] = "First Names";
        wynik[0][2] = "Soft Drinks";
        wynik[0][3] = "Songs";
        
        wynik[1][0] = "1925";
        wynik[2][0] = "1941";
        wynik[3][0] = "1947";
        wynik[4][0] = "1972";
        wynik[5][0] = "1976";
        
        wynik[q2.oneSolution().get("A1").intValue()][1] = "Chandler";
        wynik[q2.oneSolution().get("A2").intValue()][1] = "Holden";
        wynik[q2.oneSolution().get("A3").intValue()][1] = "Jane";
        wynik[q2.oneSolution().get("A4").intValue()][1] = "Skylar";
        wynik[q2.oneSolution().get("A5").intValue()][1] = "Tiffany";
        
        wynik[q2.oneSolution().get("B1").intValue()][2] = "cherry cola";
        wynik[q2.oneSolution().get("B2").intValue()][2] = "cola";
        wynik[q2.oneSolution().get("B3").intValue()][2] = "diet cola";
        wynik[q2.oneSolution().get("B4").intValue()][2] = "grape soda";
        wynik[q2.oneSolution().get("B5").intValue()][2] = "root beer";
        
        wynik[q2.oneSolution().get("C1").intValue()][3] = "All By Myself";
        wynik[q2.oneSolution().get("C2").intValue()][3] = "Happy Times";
        wynik[q2.oneSolution().get("C3").intValue()][3] = "Moon River";
        wynik[q2.oneSolution().get("C4").intValue()][3] = "One More Time";
        wynik[q2.oneSolution().get("C5").intValue()][3] = "Summer Blues"; 
        
        for(int j = 0; j < 6; j++){
            for(int i = 0; i < 4; i++){
                System.out.printf("|%-15s", wynik[j][i]);
            }
            System.out.print("|\n-----------------------------------------------------------------");
            System.out.println();
        }
    }
}
