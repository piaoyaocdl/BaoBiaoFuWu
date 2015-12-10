package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * ReagentPrepare generated by hbm2java
 */
public class ReagentPrepare implements java.io.Serializable
{

	private int id;
	private Date preDate;
	private String kind;
	private String batchNo;
	private Integer vol;
	private Integer water;
	private Integer clNum;
	private String operator;
	private String remark;
	private String recordName;
	private Date recordTime;

	public ReagentPrepare()
	{
	}

	public ReagentPrepare(int id, Date preDate)
	{
		this.id = id;
		this.preDate = preDate;
	}

	public ReagentPrepare(int id, Date preDate, String kind, String batchNo, Integer vol, Integer water, Integer clNum,
			String operator, String remark, String recordName, Date recordTime)
	{
		this.id = id;
		this.preDate = preDate;
		this.kind = kind;
		this.batchNo = batchNo;
		this.vol = vol;
		this.water = water;
		this.clNum = clNum;
		this.operator = operator;
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

	public Date getPreDate()
	{
		return this.preDate;
	}

	public void setPreDate(Date preDate)
	{
		this.preDate = preDate;
	}

	public String getKind()
	{
		return this.kind;
	}

	public void setKind(String kind)
	{
		this.kind = kind;
	}

	public String getBatchNo()
	{
		return this.batchNo;
	}

	public void setBatchNo(String batchNo)
	{
		this.batchNo = batchNo;
	}

	public Integer getVol()
	{
		return this.vol;
	}

	public void setVol(Integer vol)
	{
		this.vol = vol;
	}

	public Integer getWater()
	{
		return this.water;
	}

	public void setWater(Integer water)
	{
		this.water = water;
	}

	public Integer getClNum()
	{
		return this.clNum;
	}

	public void setClNum(Integer clNum)
	{
		this.clNum = clNum;
	}

	public String getOperator()
	{
		return this.operator;
	}

	public void setOperator(String operator)
	{
		this.operator = operator;
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