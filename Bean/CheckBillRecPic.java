package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * CheckBillRecPic generated by hbm2java
 */
public class CheckBillRecPic implements java.io.Serializable
{

	private int id;
	private CheckBill checkBill;
	private String dispName;
	private String name;
	private String remark;
	private Date recordTime;
	private String recordName;

	public CheckBillRecPic()
	{
	}

	public CheckBillRecPic(int id, CheckBill checkBill)
	{
		this.id = id;
		this.checkBill = checkBill;
	}

	public CheckBillRecPic(int id, CheckBill checkBill, String dispName, String name, String remark, Date recordTime,
			String recordName)
	{
		this.id = id;
		this.checkBill = checkBill;
		this.dispName = dispName;
		this.name = name;
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

	public CheckBill getCheckBill()
	{
		return this.checkBill;
	}

	public void setCheckBill(CheckBill checkBill)
	{
		this.checkBill = checkBill;
	}

	public String getDispName()
	{
		return this.dispName;
	}

	public void setDispName(String dispName)
	{
		this.dispName = dispName;
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