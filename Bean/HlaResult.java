package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * HlaResult generated by hbm2java
 */
public class HlaResult implements java.io.Serializable
{

	private int id;
	private String sampleNo;
	private String point;
	private String lowRes;
	private String lowAap;
	private String lowAs;
	private String highRes;
	private String lowPac;
	private String remark;
	private Date recordTime;
	private String recordName;
	private String remark2;

	public HlaResult()
	{
	}

	public HlaResult(int id, String sampleNo, String point)
	{
		this.id = id;
		this.sampleNo = sampleNo;
		this.point = point;
	}

	public HlaResult(int id, String sampleNo, String point, String lowRes, String lowAap, String lowAs, String highRes,
			String lowPac, String remark, Date recordTime, String recordName, String remark2)
	{
		this.id = id;
		this.sampleNo = sampleNo;
		this.point = point;
		this.lowRes = lowRes;
		this.lowAap = lowAap;
		this.lowAs = lowAs;
		this.highRes = highRes;
		this.lowPac = lowPac;
		this.remark = remark;
		this.recordTime = recordTime;
		this.recordName = recordName;
		this.remark2 = remark2;
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

	public String getPoint()
	{
		return this.point;
	}

	public void setPoint(String point)
	{
		this.point = point;
	}

	public String getLowRes()
	{
		return this.lowRes;
	}

	public void setLowRes(String lowRes)
	{
		this.lowRes = lowRes;
	}

	public String getLowAap()
	{
		return this.lowAap;
	}

	public void setLowAap(String lowAap)
	{
		this.lowAap = lowAap;
	}

	public String getLowAs()
	{
		return this.lowAs;
	}

	public void setLowAs(String lowAs)
	{
		this.lowAs = lowAs;
	}

	public String getHighRes()
	{
		return this.highRes;
	}

	public void setHighRes(String highRes)
	{
		this.highRes = highRes;
	}

	public String getLowPac()
	{
		return this.lowPac;
	}

	public void setLowPac(String lowPac)
	{
		this.lowPac = lowPac;
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

	public String getRemark2()
	{
		return this.remark2;
	}

	public void setRemark2(String remark2)
	{
		this.remark2 = remark2;
	}

}
