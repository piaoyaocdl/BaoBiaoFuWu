package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CReagent generated by hbm2java
 */
public class CReagent implements java.io.Serializable
{

	private int id;
	private CClient CClient;
	private String name;
	private String zjf;
	private String format;
	private String minUnit;
	private String unit;
	private String content;
	private String approvalNo;
	private Integer alarmNums;
	private Integer alarmDays;
	private Character status;
	private String remark;
	private String recordName;
	private Date recordTime;
	private Character labId;
	private Character template;
	private Character secrumId;
	private Set<ReagentBatch> reagentBatches = new HashSet<ReagentBatch>(0);

	public CReagent()
	{
	}

	public CReagent(int id, CClient CClient, String name, String unit)
	{
		this.id = id;
		this.CClient = CClient;
		this.name = name;
		this.unit = unit;
	}

	public CReagent(int id, CClient CClient, String name, String zjf, String format, String minUnit, String unit,
			String content, String approvalNo, Integer alarmNums, Integer alarmDays, Character status, String remark,
			String recordName, Date recordTime, Character labId, Character template, Character secrumId,
			Set<ReagentBatch> reagentBatches)
	{
		this.id = id;
		this.CClient = CClient;
		this.name = name;
		this.zjf = zjf;
		this.format = format;
		this.minUnit = minUnit;
		this.unit = unit;
		this.content = content;
		this.approvalNo = approvalNo;
		this.alarmNums = alarmNums;
		this.alarmDays = alarmDays;
		this.status = status;
		this.remark = remark;
		this.recordName = recordName;
		this.recordTime = recordTime;
		this.labId = labId;
		this.template = template;
		this.secrumId = secrumId;
		this.reagentBatches = reagentBatches;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public CClient getCClient()
	{
		return this.CClient;
	}

	public void setCClient(CClient CClient)
	{
		this.CClient = CClient;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getZjf()
	{
		return this.zjf;
	}

	public void setZjf(String zjf)
	{
		this.zjf = zjf;
	}

	public String getFormat()
	{
		return this.format;
	}

	public void setFormat(String format)
	{
		this.format = format;
	}

	public String getMinUnit()
	{
		return this.minUnit;
	}

	public void setMinUnit(String minUnit)
	{
		this.minUnit = minUnit;
	}

	public String getUnit()
	{
		return this.unit;
	}

	public void setUnit(String unit)
	{
		this.unit = unit;
	}

	public String getContent()
	{
		return this.content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public String getApprovalNo()
	{
		return this.approvalNo;
	}

	public void setApprovalNo(String approvalNo)
	{
		this.approvalNo = approvalNo;
	}

	public Integer getAlarmNums()
	{
		return this.alarmNums;
	}

	public void setAlarmNums(Integer alarmNums)
	{
		this.alarmNums = alarmNums;
	}

	public Integer getAlarmDays()
	{
		return this.alarmDays;
	}

	public void setAlarmDays(Integer alarmDays)
	{
		this.alarmDays = alarmDays;
	}

	public Character getStatus()
	{
		return this.status;
	}

	public void setStatus(Character status)
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

	public Character getTemplate()
	{
		return this.template;
	}

	public void setTemplate(Character template)
	{
		this.template = template;
	}

	public Character getSecrumId()
	{
		return this.secrumId;
	}

	public void setSecrumId(Character secrumId)
	{
		this.secrumId = secrumId;
	}

	public Set<ReagentBatch> getReagentBatches()
	{
		return this.reagentBatches;
	}

	public void setReagentBatches(Set<ReagentBatch> reagentBatches)
	{
		this.reagentBatches = reagentBatches;
	}

}
