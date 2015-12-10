package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * ResBloodPl generated by hbm2java
 */
public class ResBloodPl implements java.io.Serializable
{

	private int id;
	private CheckBill checkBill;
	private String bloodNo;
	private String bloodType;
	private String rhdRes;
	private String method;
	private String result;
	private String remark;
	private String recordName;
	private Date recordTime;

	public ResBloodPl()
	{
	}

	public ResBloodPl(int id, CheckBill checkBill, String bloodNo, String bloodType, String rhdRes)
	{
		this.id = id;
		this.checkBill = checkBill;
		this.bloodNo = bloodNo;
		this.bloodType = bloodType;
		this.rhdRes = rhdRes;
	}

	public ResBloodPl(int id, CheckBill checkBill, String bloodNo, String bloodType, String rhdRes, String method,
			String result, String remark, String recordName, Date recordTime)
	{
		this.id = id;
		this.checkBill = checkBill;
		this.bloodNo = bloodNo;
		this.bloodType = bloodType;
		this.rhdRes = rhdRes;
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

	public String getBloodNo()
	{
		return this.bloodNo;
	}

	public void setBloodNo(String bloodNo)
	{
		this.bloodNo = bloodNo;
	}

	public String getBloodType()
	{
		return this.bloodType;
	}

	public void setBloodType(String bloodType)
	{
		this.bloodType = bloodType;
	}

	public String getRhdRes()
	{
		return this.rhdRes;
	}

	public void setRhdRes(String rhdRes)
	{
		this.rhdRes = rhdRes;
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