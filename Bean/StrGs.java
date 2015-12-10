package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * StrGs generated by hbm2java
 */
public class StrGs implements java.io.Serializable
{

	private int id;
	private Date operDate;
	private String gsEquip;
	private Integer templateId;
	private String boardNo;
	private Integer gsSetup;
	private Integer multiple;
	private Integer gsProg;
	private String progName;
	private String operName;
	private String checkName;
	private Date checkDate;
	private String remark;
	private Date recordTime;
	private String recordName;

	public StrGs()
	{
	}

	public StrGs(int id, Date operDate, String operName)
	{
		this.id = id;
		this.operDate = operDate;
		this.operName = operName;
	}

	public StrGs(int id, Date operDate, String gsEquip, Integer templateId, String boardNo, Integer gsSetup,
			Integer multiple, Integer gsProg, String progName, String operName, String checkName, Date checkDate,
			String remark, Date recordTime, String recordName)
	{
		this.id = id;
		this.operDate = operDate;
		this.gsEquip = gsEquip;
		this.templateId = templateId;
		this.boardNo = boardNo;
		this.gsSetup = gsSetup;
		this.multiple = multiple;
		this.gsProg = gsProg;
		this.progName = progName;
		this.operName = operName;
		this.checkName = checkName;
		this.checkDate = checkDate;
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

	public Date getOperDate()
	{
		return this.operDate;
	}

	public void setOperDate(Date operDate)
	{
		this.operDate = operDate;
	}

	public String getGsEquip()
	{
		return this.gsEquip;
	}

	public void setGsEquip(String gsEquip)
	{
		this.gsEquip = gsEquip;
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

	public Integer getGsSetup()
	{
		return this.gsSetup;
	}

	public void setGsSetup(Integer gsSetup)
	{
		this.gsSetup = gsSetup;
	}

	public Integer getMultiple()
	{
		return this.multiple;
	}

	public void setMultiple(Integer multiple)
	{
		this.multiple = multiple;
	}

	public Integer getGsProg()
	{
		return this.gsProg;
	}

	public void setGsProg(Integer gsProg)
	{
		this.gsProg = gsProg;
	}

	public String getProgName()
	{
		return this.progName;
	}

	public void setProgName(String progName)
	{
		this.progName = progName;
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

}