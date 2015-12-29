package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * StrResult generated by hbm2java
 */
public class StrResult implements java.io.Serializable
{

	private int id;
	private int billId;
	private String sampleNo;
	private String pointName;
	private String value1;
	private String value2;
	private String value3;
	private String value4;
	private String peak1;
	private String peak2;
	private String peak3;
	private String peak4;
	private String an;
	private String cq;
	private char status;
	private String remark;
	private Date recordTime;
	private String recordName;

	public StrResult()
	{
	}

	public StrResult(int id, int billId, String sampleNo, String pointName, char status)
	{
		this.id = id;
		this.billId = billId;
		this.sampleNo = sampleNo;
		this.pointName = pointName;
		this.status = status;
	}

	public StrResult(int id, int billId, String sampleNo, String pointName, String value1, String value2, String value3,
			String value4, String peak1, String peak2, String peak3, String peak4, String an, String cq, char status,
			String remark, Date recordTime, String recordName)
	{
		this.id = id;
		this.billId = billId;
		this.sampleNo = sampleNo;
		this.pointName = pointName;
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
		this.value4 = value4;
		this.peak1 = peak1;
		this.peak2 = peak2;
		this.peak3 = peak3;
		this.peak4 = peak4;
		this.an = an;
		this.cq = cq;
		this.status = status;
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

	public String getSampleNo()
	{
		return this.sampleNo;
	}

	public void setSampleNo(String sampleNo)
	{
		this.sampleNo = sampleNo;
	}

	public String getPointName()
	{
		return this.pointName;
	}

	public void setPointName(String pointName)
	{
		this.pointName = pointName;
	}

	public String getValue1()
	{
		return this.value1;
	}

	public void setValue1(String value1)
	{
		this.value1 = value1;
	}

	public String getValue2()
	{
		return this.value2;
	}

	public void setValue2(String value2)
	{
		this.value2 = value2;
	}

	public String getValue3()
	{
		return this.value3;
	}

	public void setValue3(String value3)
	{
		this.value3 = value3;
	}

	public String getValue4()
	{
		return this.value4;
	}

	public void setValue4(String value4)
	{
		this.value4 = value4;
	}

	public String getPeak1()
	{
		return this.peak1;
	}

	public void setPeak1(String peak1)
	{
		this.peak1 = peak1;
	}

	public String getPeak2()
	{
		return this.peak2;
	}

	public void setPeak2(String peak2)
	{
		this.peak2 = peak2;
	}

	public String getPeak3()
	{
		return this.peak3;
	}

	public void setPeak3(String peak3)
	{
		this.peak3 = peak3;
	}

	public String getPeak4()
	{
		return this.peak4;
	}

	public void setPeak4(String peak4)
	{
		this.peak4 = peak4;
	}

	public String getAn()
	{
		return this.an;
	}

	public void setAn(String an)
	{
		this.an = an;
	}

	public String getCq()
	{
		return this.cq;
	}

	public void setCq(String cq)
	{
		this.cq = cq;
	}

	public char getStatus()
	{
		return this.status;
	}

	public void setStatus(char status)
	{
		this.status = status;
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
