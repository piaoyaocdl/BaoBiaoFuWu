package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * ResFaTest generated by hbm2java
 */
public class ResFaTest implements java.io.Serializable
{

	private int id;
	private int billId;
	private String name;
	private String method;
	private String antibody;
	private String result;
	private String remark;
	private String recordName;
	private Date recordTime;

	public ResFaTest()
	{
	}

	public ResFaTest(int id, int billId, String name, String result)
	{
		this.id = id;
		this.billId = billId;
		this.name = name;
		this.result = result;
	}

	public ResFaTest(int id, int billId, String name, String method, String antibody, String result, String remark,
			String recordName, Date recordTime)
	{
		this.id = id;
		this.billId = billId;
		this.name = name;
		this.method = method;
		this.antibody = antibody;
		this.result = result;
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

	public int getBillId()
	{
		return this.billId;
	}

	public void setBillId(int billId)
	{
		this.billId = billId;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getMethod()
	{
		return this.method;
	}

	public void setMethod(String method)
	{
		this.method = method;
	}

	public String getAntibody()
	{
		return this.antibody;
	}

	public void setAntibody(String antibody)
	{
		this.antibody = antibody;
	}

	public String getResult()
	{
		return this.result;
	}

	public void setResult(String result)
	{
		this.result = result;
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
