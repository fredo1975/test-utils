package fr.bluechipit.divers;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class TestJndi extends TestCase {
	protected static final Log logger = LogFactory.getLog(TestJndi.class);
	
	public void testConn(){
		logger.info("testConn start");
		Context ctx = null;
		Hashtable ht = new Hashtable();
		ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
		ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			ctx = new InitialContext(ht);
			javax.sql.DataSource ds = (javax.sql.DataSource) ctx.lookup ("dvdthequejndi");
			conn = ds.getConnection();
			
			// You can now use the conn object to create 
			//  Statements and retrieve result sets:
			stmt = conn.createStatement();
			stmt.execute("select * from FILM");
			rs = stmt.getResultSet(); 
			while (rs.next())
				logger.info("TITRE="+rs.getString("TITRE")); 
			//Close JDBC objects as soon as possible
		    stmt.close();
		    stmt=null;
		    conn.close();
		    conn=null;
		}catch (Exception e) {
		    // a failure occurred
			e.printStackTrace();
			logger.error(e.getMessage());
		}finally {    
			try {
				ctx.close();
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(e.getCause());
			}
			try {
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(e.getCause());
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(e.getCause());
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				logger.error(e.getCause());
			}
		}
		    
		logger.info("testConn end");
	}
}
