package riswell.model;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * SamplePic generated by hbm2java
 */
public class SamplePic implements java.io.Serializable
{

	private int id;
	private SampleInfo sampleInfo;
	private String sampleNo;
	private String name;
	private String remark;
	private Date recordTime;
	private String recordName;

	public SamplePic()
	{
	}

	public SamplePic(int id)
	{
		this.id = id;
	}

	public SamplePic(int id, SampleInfo sampleInfo, String sampleNo, String name, String remark, Date recordTime,
			String recordName)
	{
		this.id = id;
		this.sampleInfo = sampleInfo;
		this.sampleNo = sampleNo;
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

	public SampleInfo getSampleInfo()
	{
		return this.sampleInfo;
	}

	public void setSampleInfo(SampleInfo sampleInfo)
	{
		this.sampleInfo = sampleInfo;
	}

	public String getSampleNo()
	{
		return this.sampleNo;
	}

	public void setSampleNo(String sampleNo)
	{
		this.sampleNo = sampleNo;
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
