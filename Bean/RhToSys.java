package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

/**
 * RhToSys generated by hbm2java
 */
public class RhToSys implements java.io.Serializable
{

	private int id;
	private String sysName;
	private String antiName;

	public RhToSys()
	{
	}

	public RhToSys(int id, String sysName)
	{
		this.id = id;
		this.sysName = sysName;
	}

	public RhToSys(int id, String sysName, String antiName)
	{
		this.id = id;
		this.sysName = sysName;
		this.antiName = antiName;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getSysName()
	{
		return this.sysName;
	}

	public void setSysName(String sysName)
	{
		this.sysName = sysName;
	}

	public String getAntiName()
	{
		return this.antiName;
	}

	public void setAntiName(String antiName)
	{
		this.antiName = antiName;
	}

}
