package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * HlaLumi generated by hbm2java
 */
public class HlaLumi implements java.io.Serializable
{

	private int id;
	private Date operDate;
	private String scEquip;
	private Integer templateId;
	private String boardNo;
	private String operName;
	private String checkName;
	private Date checkDate;
	private String remark;
	private Date recordTime;
	private String recordName;
	private String pcrNo;

	public HlaLumi()
	{
	}

	public HlaLumi(int id, Date operDate, String boardNo, String operName)
	{
		this.id = id;
		this.operDate = operDate;
		this.boardNo = boardNo;
		this.operName = operName;
	}

	public HlaLumi(int id, Date operDate, String scEquip, Integer templateId, String boardNo, String operName,
			String checkName, Date checkDate, String remark, Date recordTime, String recordName, String pcrNo)
	{
		this.id = id;
		this.operDate = operDate;
		this.scEquip = scEquip;
		this.templateId = templateId;
		this.boardNo = boardNo;
		this.operName = operName;
		this.checkName = checkName;
		this.checkDate = checkDate;
		this.remark = remark;
		this.recordTime = recordTime;
		this.recordName = recordName;
		this.pcrNo = pcrNo;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Date getOperDate()
	{
		return this.operDate;
	}

	public void setOperDate(Date operDate)
	{
		this.operDate = operDate;
	}

	public String getScEquip()
	{
		return this.scEquip;
	}

	public void setScEquip(String scEquip)
	{
		this.scEquip = scEquip;
	}

	public Integer getTemplateId()
	{
		return this.templateId;
	}

	public void setTemplateId(Integer templateId)
	{
		this.templateId = templateId;
	}

	public String getBoardNo()
	{
		return this.boardNo;
	}

	public void setBoardNo(String boardNo)
	{
		this.boardNo = boardNo;
	}

	public String getOperName()
	{
		return this.operName;
	}

	public void setOperName(String operName)
	{
		this.operName = operName;
	}

	public String getCheckName()
	{
		return this.checkName;
	}

	public void setCheckName(String checkName)
	{
		this.checkName = checkName;
	}

	public Date getCheckDate()
	{
		return this.checkDate;
	}

	public void setCheckDate(Date checkDate)
	{
		this.checkDate = checkDate;
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

	public String getPcrNo()
	{
		return this.pcrNo;
	}

	public void setPcrNo(String pcrNo)
	{
		this.pcrNo = pcrNo;
	}

}
