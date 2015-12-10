package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * CDept generated by hbm2java
 */
public class CDept implements java.io.Serializable
{

	private int id;
	private String name;
	private String remark;
	private String recordName;
	private Date recordTime;

	public CDept()
	{
	}

	public CDept(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public CDept(int id, String name, String remark, String recordName, Date recordTime)
	{
		this.id = id;
		this.name = name;
		this.remark = remark;
		this.recordName = recordName;
		this.recordTime = recordTime;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getRemark()
	{
		return this.remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public String getRecordName()
	{
		return this.recordName;
	}

	public void setRecordName(String recordName)
	{
		this.recordName = recordName;
	}

	public Date getRecordTime()
	{
		return this.recordTime;
	}

	public void setRecordTime(Date recordTime)
	{
		this.recordTime = recordTime;
	}

}
