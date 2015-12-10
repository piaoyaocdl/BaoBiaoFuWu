package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * HlaReportRec generated by hbm2java
 */
public class HlaReportRec implements java.io.Serializable
{

	private int id;
	private int billId;
	private char labId;
	private char reportId;
	private String reportName;
	private Date reportDate;
	private String remark;
	private Date recordTime;
	private String recordName;

	public HlaReportRec()
	{
	}

	public HlaReportRec(int id, int billId, char labId, char reportId)
	{
		this.id = id;
		this.billId = billId;
		this.labId = labId;
		this.reportId = reportId;
	}

	public HlaReportRec(int id, int billId, char labId, char reportId, String reportName, Date reportDate,
			String remark, Date recordTime, String recordName)
	{
		this.id = id;
		this.billId = billId;
		this.labId = labId;
		this.reportId = reportId;
		this.reportName = reportName;
		this.reportDate = reportDate;
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

	public int getBillId()
	{
		return this.billId;
	}

	public void setBillId(int billId)
	{
		this.billId = billId;
	}

	public char getLabId()
	{
		return this.labId;
	}

	public void setLabId(char labId)
	{
		this.labId = labId;
	}

	public char getReportId()
	{
		return this.reportId;
	}

	public void setReportId(char reportId)
	{
		this.reportId = reportId;
	}

	public String getReportName()
	{
		return this.reportName;
	}

	public void setReportName(String reportName)
	{
		this.reportName = reportName;
	}

	public Date getReportDate()
	{
		return this.reportDate;
	}

	public void setReportDate(Date reportDate)
	{
		this.reportDate = reportDate;
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
