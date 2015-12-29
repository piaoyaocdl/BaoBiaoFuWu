package riswell.model;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * ResDaTest generated by hbm2java
 */
public class ResDaTest implements java.io.Serializable
{

	private int id;
	private CheckBill checkBill;
	private String abName;
	private String method;
	private String result;
	private String remark;
	private String recordName;
	private Date recordTime;

	public ResDaTest()
	{
	}

	public ResDaTest(int id, CheckBill checkBill)
	{
		this.id = id;
		this.checkBill = checkBill;
	}

	public ResDaTest(int id, CheckBill checkBill, String abName, String method, String result, String remark,
			String recordName, Date recordTime)
	{
		this.id = id;
		this.checkBill = checkBill;
		this.abName = abName;
		this.method = method;
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

	public CheckBill getCheckBill()
	{
		return this.checkBill;
	}

	public void setCheckBill(CheckBill checkBill)
	{
		this.checkBill = checkBill;
	}

	public String getAbName()
	{
		return this.abName;
	}

	public void setAbName(String abName)
	{
		this.abName = abName;
	}

	public String getMethod()
	{
		return this.method;
	}

	public void setMethod(String method)
	{
		this.method = method;
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
