package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * CHospital generated by hbm2java
 */
public class CHospital implements java.io.Serializable
{

	private int id;
	private String SName;
	private String name;
	private String linkman;
	private String address;
	private String telephone;
	private String zjf;
	private char status;
	private String remark;
	private String recordName;
	private Date recordTime;
	private Character labId;
	private Character feeType;
	private String area;

	public CHospital()
	{
	}

	public CHospital(int id, String SName, char status)
	{
		this.id = id;
		this.SName = SName;
		this.status = status;
	}

	public CHospital(int id, String SName, String name, String linkman, String address, String telephone, String zjf,
			char status, String remark, String recordName, Date recordTime, Character labId, Character feeType,
			String area)
	{
		this.id = id;
		this.SName = SName;
		this.name = name;
		this.linkman = linkman;
		this.address = address;
		this.telephone = telephone;
		this.zjf = zjf;
		this.status = status;
		this.remark = remark;
		this.recordName = recordName;
		this.recordTime = recordTime;
		this.labId = labId;
		this.feeType = feeType;
		this.area = area;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getSName()
	{
		return this.SName;
	}

	public void setSName(String SName)
	{
		this.SName = SName;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getLinkman()
	{
		return this.linkman;
	}

	public void setLinkman(String linkman)
	{
		this.linkman = linkman;
	}

	public String getAddress()
	{
		return this.address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getTelephone()
	{
		return this.telephone;
	}

	public void setTelephone(String telephone)
	{
		this.telephone = telephone;
	}

	public String getZjf()
	{
		return this.zjf;
	}

	public void setZjf(String zjf)
	{
		this.zjf = zjf;
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

	public Character getLabId()
	{
		return this.labId;
	}

	public void setLabId(Character labId)
	{
		this.labId = labId;
	}

	public Character getFeeType()
	{
		return this.feeType;
	}

	public void setFeeType(Character feeType)
	{
		this.feeType = feeType;
	}

	public String getArea()
	{
		return this.area;
	}

	public void setArea(String area)
	{
		this.area = area;
	}

}