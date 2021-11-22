package mx.uaemex.fi.juegos.ahorcado.modelo.sql;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;

public class CreaData {
	public static void main(String[] args) {
        //Conexion a la base de datos
        try {
            //Class driverClass = Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection jdbcConnection = DriverManager.getConnection("jdbc:derby://localhost:1527/ahorcado", "app", "123");
            IDatabaseConnection connection = new DatabaseConnection(jdbcConnection);
            //Exporta por completo la base de datos
            IDataSet fullDataSet = connection.createDataSet();
            FlatXmlDataSet.write(fullDataSet, new FileOutputStream("palabras.xml"));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
