import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;


public class DB {
	
	private final static String driver ="com.mysql.cj.jdbc.Driver";
	private final static String db = "jdbc:mysql://localhost:3306/jdbc";
	private final static String user="root";
	private final static String pass ="zas333";
	
	private Connection cn;
	private Statement st;
	
	public DB()
	{
		try
		{
			Class.forName(driver);
			cn = DriverManager.getConnection(db,user,pass);
			st =cn.createStatement();
			System.out.println("Conexion exitosa");
		}
		catch(Exception e)
		{
			System.out.println("no se pudo conectar a la BD: "+e);
		}
	}
	
	public void showAll()
	{
		try
		{
			ResultSet rs =st.executeQuery("select *from person");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4));
			}
		}
		catch(Exception e)
		{
			System.out.println("Error al realizar la consuta: "+e);
		}
	}

}
