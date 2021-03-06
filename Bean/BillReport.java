package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * BillReport generated by hbm2java
 */
public class BillReport implements java.io.Serializable
{

	private int id;
	private CheckBill checkBill;
	private char status;
	private String path;
	private String remark;
	private Date recordTime;
	private String recordName;

	public BillReport()
	{
	}

	public BillReport(int id, CheckBill checkBill, char status)
	{
		this.id = id;
		this.checkBill = checkBill;
		this.status = status;
	}

	public BillReport(int id, CheckBill checkBill, char status, String path, String remark, Date recordTime,
			String recordName)
	{
		this.id = id;
		this.checkBill = checkBill;
		this.status = status;
		this.path = path;
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

	public char getStatus()
	{
		return this.status;
	}

	public void setStatus(char status)
	{
		this.status = status;
	}

	public String getPath()
	{
		return this.path;
	}

	public void setPath(String path)
	{
		this.path = path;
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
