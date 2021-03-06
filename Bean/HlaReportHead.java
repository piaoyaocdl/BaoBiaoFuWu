package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * HlaReportHead generated by hbm2java
 */
public class HlaReportHead implements java.io.Serializable
{

	private int id;
	private String name;
	private String manufacturer1;
	private String method1;
	private String reagent1;
	private String manufacturer2;
	private String method2;
	private String reagent2;
	private String remark;
	private Date recordTime;
	private String recordName;

	public HlaReportHead()
	{
	}

	public HlaReportHead(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public HlaReportHead(int id, String name, String manufacturer1, String method1, String reagent1,
			String manufacturer2, String method2, String reagent2, String remark, Date recordTime, String recordName)
	{
		this.id = id;
		this.name = name;
		this.manufacturer1 = manufacturer1;
		this.method1 = method1;
		this.reagent1 = reagent1;
		this.manufacturer2 = manufacturer2;
		this.method2 = method2;
		this.reagent2 = reagent2;
		this.remark = remark;
		this.recordTime = recordTime;
		this.recordName = recordName;
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

	public String getManufacturer1()
	{
		return this.manufacturer1;
	}

	public void setManufacturer1(String manufacturer1)
	{
		this.manufacturer1 = manufacturer1;
	}

	public String getMethod1()
	{
		return this.method1;
	}

	public void setMethod1(String method1)
	{
		this.method1 = method1;
	}

	public String getReagent1()
	{
		return this.reagent1;
	}

	public void setReagent1(String reagent1)
	{
		this.reagent1 = reagent1;
	}

	public String getManufacturer2()
	{
		return this.manufacturer2;
	}

	public void setManufacturer2(String manufacturer2)
	{
		this.manufacturer2 = manufacturer2;
	}

	public String getMethod2()
	{
		return this.method2;
	}

	public void setMethod2(String method2)
	{
		this.method2 = method2;
	}

	public String getReagent2()
	{
		return this.reagent2;
	}

	public void setReagent2(String reagent2)
	{
		this.reagent2 = reagent2;
	}

	public String getRemark()
	{
		return this.remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public Date getRecordTime()
	{
		return this.recordTime;
	}

	public void setRecordTime(Date recordTime)
	{
		this.recordTime = recordTime;
	}

	public String getRecordName()
	{
		return this.recordName;
	}

	public void setRecordName(String recordName)
	{
		this.recordName = recordName;
	}

}
