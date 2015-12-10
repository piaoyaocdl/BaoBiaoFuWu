package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * HlaSgResult generated by hbm2java
 */
public class HlaSgResult implements java.io.Serializable
{

	private int id;
	private String sampleNo;
	private String result;
	private String remark;
	private Date recordTime;
	private String recordName;

	public HlaSgResult()
	{
	}

	public HlaSgResult(int id, String sampleNo)
	{
		this.id = id;
		this.sampleNo = sampleNo;
	}

	public HlaSgResult(int id, String sampleNo, String result, String remark, Date recordTime, String recordName)
	{
		this.id = id;
		this.sampleNo = sampleNo;
		this.result = result;
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

	public String getSampleNo()
	{
		return this.sampleNo;
	}

	public void setSampleNo(String sampleNo)
	{
		this.sampleNo = sampleNo;
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
