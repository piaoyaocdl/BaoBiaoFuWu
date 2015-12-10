package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * EquipmentMaintain generated by hbm2java
 */
public class EquipmentMaintain implements java.io.Serializable
{

	private int id;
	private int equipmentId;
	private String institution;
	private String item;
	private String actor;
	private String content;
	private Date startDate;
	private Date endDate;
	private Character result;
	private String remark;
	private String recordName;
	private Date recordTime;

	public EquipmentMaintain()
	{
	}

	public EquipmentMaintain(int id, int equipmentId, String institution, String item)
	{
		this.id = id;
		this.equipmentId = equipmentId;
		this.institution = institution;
		this.item = item;
	}

	public EquipmentMaintain(int id, int equipmentId, String institution, String item, String actor, String content,
			Date startDate, Date endDate, Character result, String remark, String recordName, Date recordTime)
	{
		this.id = id;
		this.equipmentId = equipmentId;
		this.institution = institution;
		this.item = item;
		this.actor = actor;
		this.content = content;
		this.startDate = startDate;
		this.endDate = endDate;
		this.result = result;
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

	public int getEquipmentId()
	{
		return this.equipmentId;
	}

	public void setEquipmentId(int equipmentId)
	{
		this.equipmentId = equipmentId;
	}

	public String getInstitution()
	{
		return this.institution;
	}

	public void setInstitution(String institution)
	{
		this.institution = institution;
	}

	public String getItem()
	{
		return this.item;
	}

	public void setItem(String item)
	{
		this.item = item;
	}

	public String getActor()
	{
		return this.actor;
	}

	public void setActor(String actor)
	{
		this.actor = actor;
	}

	public String getContent()
	{
		return this.content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public Date getStartDate()
	{
		return this.startDate;
	}

	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}

	public Date getEndDate()
	{
		return this.endDate;
	}

	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}

	public Character getResult()
	{
		return this.result;
	}

	public void setResult(Character result)
	{
		this.result = result;
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