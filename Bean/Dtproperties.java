package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.sql.Blob;

/**
 * Dtproperties generated by hbm2java
 */
public class Dtproperties implements java.io.Serializable
{

	private DtpropertiesId id;
	private int version;
	private Integer objectid;
	private String value;
	private String uvalue;
	private Blob lvalue;

	public Dtproperties()
	{
	}

	public Dtproperties(DtpropertiesId id)
	{
		this.id = id;
	}

	public Dtproperties(DtpropertiesId id, Integer objectid, String value, String uvalue, Blob lvalue)
	{
		this.id = id;
		this.objectid = objectid;
		this.value = value;
		this.uvalue = uvalue;
		this.lvalue = lvalue;
	}

	public DtpropertiesId getId()
	{
		return this.id;
	}

	public void setId(DtpropertiesId id)
	{
		this.id = id;
	}

	public int getVersion()
	{
		return this.version;
	}

	public void setVersion(int version)
	{
		this.version = version;
	}

	public Integer getObjectid()
	{
		return this.objectid;
	}

	public void setObjectid(Integer objectid)
	{
		this.objectid = objectid;
	}

	public String getValue()
	{
		return this.value;
	}

	public void setValue(String value)
	{
		this.value = value;
	}

	public String getUvalue()
	{
		return this.uvalue;
	}

	public void setUvalue(String uvalue)
	{
		this.uvalue = uvalue;
	}

	public Blob getLvalue()
	{
		return this.lvalue;
	}

	public void setLvalue(Blob lvalue)
	{
		this.lvalue = lvalue;
	}

}
