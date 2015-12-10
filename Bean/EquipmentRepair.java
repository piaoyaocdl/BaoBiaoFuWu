package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * EquipmentRepair generated by hbm2java
 */
public class EquipmentRepair implements java.io.Serializable
{

	private int id;
	private int equipmentId;
	private Date repairDate;
	private String repairUnit;
	private String repairMan;
	private String content;
	private Character result;
	private String remark;
	private String recordName;
	private Date recordTime;

	public EquipmentRepair()
	{
	}

	public EquipmentRepair(int id, int equipmentId, Date repairDate)
	{
		this.id = id;
		this.equipmentId = equipmentId;
		this.repairDate = repairDate;
	}

	public EquipmentRepair(int id, int equipmentId, Date repairDate, String repairUnit, String repairMan,
			String content, Character result, String remark, String recordName, Date recordTime)
	{
		this.id = id;
		this.equipmentId = equipmentId;
		this.repairDate = repairDate;
		this.repairUnit = repairUnit;
		this.repairMan = repairMan;
		this.content = content;
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

	public Date getRepairDate()
	{
		return this.repairDate;
	}

	public void setRepairDate(Date repairDate)
	{
		this.repairDate = repairDate;
	}

	public String getRepairUnit()
	{
		return this.repairUnit;
	}

	public void setRepairUnit(String repairUnit)
	{
		this.repairUnit = repairUnit;
	}

	public String getRepairMan()
	{
		return this.repairMan;
	}

	public void setRepairMan(String repairMan)
	{
		this.repairMan = repairMan;
	}

	public String getContent()
	{
		return this.content;
	}

	public void setContent(String content)
	{
		this.content = content;
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
