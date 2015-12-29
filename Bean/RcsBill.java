package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * RcsBill generated by hbm2java
 */
public class RcsBill implements java.io.Serializable
{

	private int id;
	private int areaId;
	private String areaCode;
	private String areaName;
	private String batchNo;
	private String sendMan;
	private Date sendDate;
	private String sendUnit;
	private Character acceptType;
	private Integer nums;
	private Integer manNums;
	private String remark;
	private Date recordTime;
	private String recordName;
	private Set<RcsSampleInfo> rcsSampleInfos = new HashSet<RcsSampleInfo>(0);

	public RcsBill()
	{
	}

	public RcsBill(int id, int areaId, String batchNo)
	{
		this.id = id;
		this.areaId = areaId;
		this.batchNo = batchNo;
	}

	public RcsBill(int id, int areaId, String areaCode, String areaName, String batchNo, String sendMan, Date sendDate,
			String sendUnit, Character acceptType, Integer nums, Integer manNums, String remark, Date recordTime,
			String recordName, Set<RcsSampleInfo> rcsSampleInfos)
	{
		this.id = id;
		this.areaId = areaId;
		this.areaCode = areaCode;
		this.areaName = areaName;
		this.batchNo = batchNo;
		this.sendMan = sendMan;
		this.sendDate = sendDate;
		this.sendUnit = sendUnit;
		this.acceptType = acceptType;
		this.nums = nums;
		this.manNums = manNums;
		this.remark = remark;
		this.recordTime = recordTime;
		this.recordName = recordName;
		this.rcsSampleInfos = rcsSampleInfos;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getAreaId()
	{
		return this.areaId;
	}

	public void setAreaId(int areaId)
	{
		this.areaId = areaId;
	}

	public String getAreaCode()
	{
		return this.areaCode;
	}

	public void setAreaCode(String areaCode)
	{
		this.areaCode = areaCode;
	}

	public String getAreaName()
	{
		return this.areaName;
	}

	public void setAreaName(String areaName)
	{
		this.areaName = areaName;
	}

	public String getBatchNo()
	{
		return this.batchNo;
	}

	public void setBatchNo(String batchNo)
	{
		this.batchNo = batchNo;
	}

	public String getSendMan()
	{
		return this.sendMan;
	}

	public void setSendMan(String sendMan)
	{
		this.sendMan = sendMan;
	}

	public Date getSendDate()
	{
		return this.sendDate;
	}

	public void setSendDate(Date sendDate)
	{
		this.sendDate = sendDate;
	}

	public String getSendUnit()
	{
		return this.sendUnit;
	}

	public void setSendUnit(String sendUnit)
	{
		this.sendUnit = sendUnit;
	}

	public Character getAcceptType()
	{
		return this.acceptType;
	}

	public void setAcceptType(Character acceptType)
	{
		this.acceptType = acceptType;
	}

	public Integer getNums()
	{
		return this.nums;
	}

	public void setNums(Integer nums)
	{
		this.nums = nums;
	}

	public Integer getManNums()
	{
		return this.manNums;
	}

	public void setManNums(Integer manNums)
	{
		this.manNums = manNums;
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

	public Set<RcsSampleInfo> getRcsSampleInfos()
	{
		return this.rcsSampleInfos;
	}

	public void setRcsSampleInfos(Set<RcsSampleInfo> rcsSampleInfos)
	{
		this.rcsSampleInfos = rcsSampleInfos;
	}

}
