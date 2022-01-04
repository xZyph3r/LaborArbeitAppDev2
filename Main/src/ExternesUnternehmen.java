import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExternesUnternehmen {

        static Connection conn = null;

    public static boolean bonitaetspruefung(int kundennr){
        ;
        int a = 0;
            try {
            String sql = "SELECT bonitaet FROM kunde WHERE kundenNR = "+kundennr;
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);

            a = (res.getInt("bonitaet"));
            System.out.println(a);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if(a == 1){
            return true;

    }
    else return false;


    }
}
