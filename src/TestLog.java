import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestLog {

    public static void main(String[] args) throws Exception {

        Class.forName("org.h2.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:h2:~/tareaPlayground7", "sa", "");
        Statement stmt = con.createStatement();

        //Código para crear una tabla. Elimina la tabla si esta ya existe y la
        //vuelve a crear
        String createSql = "SELECT * FROM FIGURAS WHERE FIGURA = 'CIRCULO'";



        stmt.execute(createSql);

        //Codigo para consultar todos los registros de la tabla TEST
        String sql = "SELECT * FROM FIGURAS WHERE FIGURA = 'CIRCULO'";
        ResultSet rd = stmt.executeQuery(sql);

        //Código para recorrer el resultado de la consulta
        while(rd.next()) {
            System.out.println(rd.getInt("ID") + " " + rd.getString("FIGURA") + " " + rd.getString("COLOR"));

        }

        Logger LOGGER = Logger.getLogger(TestLog.class);
        LOGGER.info("Query realizada con exito");

    }
}
