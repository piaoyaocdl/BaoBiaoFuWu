package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * RcsResult generated by hbm2java
 */
public class RcsResult implements java.io.Serializable
{

	private int id;
	private String sampleNo;
	private String hlaA;
	private String hlaB;
	private String hlaDrb1;
	private String hlaAt;
	private String hlaBt;
	private String hlaDrb1t;
	private String hlaAg;
	private String hlaBg;
	private String hlaDrb1g;
	private String remark;
	private String recordName;
	private Date recordTime;

	public RcsResult()
	{
	}

	public RcsResult(int id, String sampleNo)
	{
		this.id = id;
		this.sampleNo = sampleNo;
	}

	public RcsResult(int id, String sampleNo, String hlaA, String hlaB, String hlaDrb1, String hlaAt, String hlaBt,
			String hlaDrb1t, String hlaAg, String hlaBg, String hlaDrb1g, String remark, String recordName,
			Date recordTime)
	{
		this.id = id;
		this.sampleNo = sampleNo;
		this.hlaA = hlaA;
		this.hlaB = hlaB;
		this.hlaDrb1 = hlaDrb1;
		this.hlaAt = hlaAt;
		this.hlaBt = hlaBt;
		this.hlaDrb1t = hlaDrb1t;
		this.hlaAg = hlaAg;
		this.hlaBg = hlaBg;
		this.hlaDrb1g = hlaDrb1g;
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

	public String getSampleNo()
	{
		return this.sampleNo;
	}

	public void setSampleNo(String sampleNo)
	{
		this.sampleNo = sampleNo;
	}

	public String getHlaA()
	{
		return this.hlaA;
	}

	public void setHlaA(String hlaA)
	{
		this.hlaA = hlaA;
	}

	public String getHlaB()
	{
		return this.hlaB;
	}

	public void setHlaB(String hlaB)
	{
		this.hlaB = hlaB;
	}

	public String getHlaDrb1()
	{
		return this.hlaDrb1;
	}

	public void setHlaDrb1(String hlaDrb1)
	{
		this.hlaDrb1 = hlaDrb1;
	}

	public String getHlaAt()
	{
		return this.hlaAt;
	}

	public void setHlaAt(String hlaAt)
	{
		this.hlaAt = hlaAt;
	}

	public String getHlaBt()
	{
		return this.hlaBt;
	}

	public void setHlaBt(String hlaBt)
	{
		this.hlaBt = hlaBt;
	}

	public String getHlaDrb1t()
	{
		return this.hlaDrb1t;
	}

	public void setHlaDrb1t(String hlaDrb1t)
	{
		this.hlaDrb1t = hlaDrb1t;
	}

	public String getHlaAg()
	{
		return this.hlaAg;
	}

	public void setHlaAg(String hlaAg)
	{
		this.hlaAg = hlaAg;
	}

	public String getHlaBg()
	{
		return this.hlaBg;
	}

	public void setHlaBg(String hlaBg)
	{
		this.hlaBg = hlaBg;
	}

	public String getHlaDrb1g()
	{
		return this.hlaDrb1g;
	}

	public void setHlaDrb1g(String hlaDrb1g)
	{
		this.hlaDrb1g = hlaDrb1g;
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
