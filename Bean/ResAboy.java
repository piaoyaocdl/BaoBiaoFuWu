package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * ResAboy generated by hbm2java
 */
public class ResAboy implements java.io.Serializable
{

	private int id;
	private Integer billId;
	private String ryka;
	private String rykb;
	private String ka;
	private String kh;
	private String a2xb;
	private String axb1;
	private String axb2;
	private String bxb1;
	private String bxb2;
	private String oxb1;
	private String oxb2;
	private String remark;
	private String recordName;
	private Date recordTime;
	private Integer seqNo;

	public ResAboy()
	{
	}

	public ResAboy(int id)
	{
		this.id = id;
	}

	public ResAboy(int id, Integer billId, String ryka, String rykb, String ka, String kh, String a2xb, String axb1,
			String axb2, String bxb1, String bxb2, String oxb1, String oxb2, String remark, String recordName,
			Date recordTime, Integer seqNo)
	{
		this.id = id;
		this.billId = billId;
		this.ryka = ryka;
		this.rykb = rykb;
		this.ka = ka;
		this.kh = kh;
		this.a2xb = a2xb;
		this.axb1 = axb1;
		this.axb2 = axb2;
		this.bxb1 = bxb1;
		this.bxb2 = bxb2;
		this.oxb1 = oxb1;
		this.oxb2 = oxb2;
		this.remark = remark;
		this.recordName = recordName;
		this.recordTime = recordTime;
		this.seqNo = seqNo;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Integer getBillId()
	{
		return this.billId;
	}

	public void setBillId(Integer billId)
	{
		this.billId = billId;
	}

	public String getRyka()
	{
		return this.ryka;
	}

	public void setRyka(String ryka)
	{
		this.ryka = ryka;
	}

	public String getRykb()
	{
		return this.rykb;
	}

	public void setRykb(String rykb)
	{
		this.rykb = rykb;
	}

	public String getKa()
	{
		return this.ka;
	}

	public void setKa(String ka)
	{
		this.ka = ka;
	}

	public String getKh()
	{
		return this.kh;
	}

	public void setKh(String kh)
	{
		this.kh = kh;
	}

	public String getA2xb()
	{
		return this.a2xb;
	}

	public void setA2xb(String a2xb)
	{
		this.a2xb = a2xb;
	}

	public String getAxb1()
	{
		return this.axb1;
	}

	public void setAxb1(String axb1)
	{
		this.axb1 = axb1;
	}

	public String getAxb2()
	{
		return this.axb2;
	}

	public void setAxb2(String axb2)
	{
		this.axb2 = axb2;
	}

	public String getBxb1()
	{
		return this.bxb1;
	}

	public void setBxb1(String bxb1)
	{
		this.bxb1 = bxb1;
	}

	public String getBxb2()
	{
		return this.bxb2;
	}

	public void setBxb2(String bxb2)
	{
		this.bxb2 = bxb2;
	}

	public String getOxb1()
	{
		return this.oxb1;
	}

	public void setOxb1(String oxb1)
	{
		this.oxb1 = oxb1;
	}

	public String getOxb2()
	{
		return this.oxb2;
	}

	public void setOxb2(String oxb2)
	{
		this.oxb2 = oxb2;
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

	public Integer getSeqNo()
	{
		return this.seqNo;
	}

	public void setSeqNo(Integer seqNo)
	{
		this.seqNo = seqNo;
	}

}
