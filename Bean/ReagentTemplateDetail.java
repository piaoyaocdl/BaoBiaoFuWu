package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * ReagentTemplateDetail generated by hbm2java
 */
public class ReagentTemplateDetail implements java.io.Serializable
{

	private int id;
	private ReagentTemplate reagentTemplate;
	private Integer reagentId;
	private String reagentName;
	private String batchNo;
	private Integer batchId;
	private String remark;
	private String recordName;
	private Date recordTime;
	private Date prodDate;
	private Date validDate;
	private String dankongyongliang;

	public ReagentTemplateDetail()
	{
	}

	public ReagentTemplateDetail(int id, ReagentTemplate reagentTemplate)
	{
		this.id = id;
		this.reagentTemplate = reagentTemplate;
	}

	public ReagentTemplateDetail(int id, ReagentTemplate reagentTemplate, Integer reagentId, String reagentName,
			String batchNo, Integer batchId, String remark, String recordName, Date recordTime, Date prodDate,
			Date validDate, String dankongyongliang)
	{
		this.id = id;
		this.reagentTemplate = reagentTemplate;
		this.reagentId = reagentId;
		this.reagentName = reagentName;
		this.batchNo = batchNo;
		this.batchId = batchId;
		this.remark = remark;
		this.recordName = recordName;
		this.recordTime = recordTime;
		this.prodDate = prodDate;
		this.validDate = validDate;
		this.dankongyongliang = dankongyongliang;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public ReagentTemplate getReagentTemplate()
	{
		return this.reagentTemplate;
	}

	public void setReagentTemplate(ReagentTemplate reagentTemplate)
	{
		this.reagentTemplate = reagentTemplate;
	}

	public Integer getReagentId()
	{
		return this.reagentId;
	}

	public void setReagentId(Integer reagentId)
	{
		this.reagentId = reagentId;
	}

	public String getReagentName()
	{
		return this.reagentName;
	}

	public void setReagentName(String reagentName)
	{
		this.reagentName = reagentName;
	}

	public String getBatchNo()
	{
		return this.batchNo;
	}

	public void setBatchNo(String batchNo)
	{
		this.batchNo = batchNo;
	}

	public Integer getBatchId()
	{
		return this.batchId;
	}

	public void setBatchId(Integer batchId)
	{
		this.batchId = batchId;
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

	public Date getProdDate()
	{
		return this.prodDate;
	}

	public void setProdDate(Date prodDate)
	{
		this.prodDate = prodDate;
	}

	public Date getValidDate()
	{
		return this.validDate;
	}

	public void setValidDate(Date validDate)
	{
		this.validDate = validDate;
	}

	public String getDankongyongliang()
	{
		return this.dankongyongliang;
	}

	public void setDankongyongliang(String dankongyongliang)
	{
		this.dankongyongliang = dankongyongliang;
	}

}
