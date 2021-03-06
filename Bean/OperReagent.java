package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * OperReagent generated by hbm2java
 */
public class OperReagent implements java.io.Serializable
{

	private int id;
	private int operId;
	private char operType;
	private int batchId;
	private String reagentName;
	private String reagentBatchNo;
	private Character printId;
	private String remark;
	private Date recordTime;
	private String recordName;
	private Character autoId;
	private Character state;

	public OperReagent()
	{
	}

	public OperReagent(int id, int operId, char operType, int batchId)
	{
		this.id = id;
		this.operId = operId;
		this.operType = operType;
		this.batchId = batchId;
	}

	public OperReagent(int id, int operId, char operType, int batchId, String reagentName, String reagentBatchNo,
			Character printId, String remark, Date recordTime, String recordName, Character autoId, Character state)
	{
		this.id = id;
		this.operId = operId;
		this.operType = operType;
		this.batchId = batchId;
		this.reagentName = reagentName;
		this.reagentBatchNo = reagentBatchNo;
		this.printId = printId;
		this.remark = remark;
		this.recordTime = recordTime;
		this.recordName = recordName;
		this.autoId = autoId;
		this.state = state;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getOperId()
	{
		return this.operId;
	}

	public void setOperId(int operId)
	{
		this.operId = operId;
	}

	public char getOperType()
	{
		return this.operType;
	}

	public void setOperType(char operType)
	{
		this.operType = operType;
	}

	public int getBatchId()
	{
		return this.batchId;
	}

	public void setBatchId(int batchId)
	{
		this.batchId = batchId;
	}

	public String getReagentName()
	{
		return this.reagentName;
	}

	public void setReagentName(String reagentName)
	{
		this.reagentName = reagentName;
	}

	public String getReagentBatchNo()
	{
		return this.reagentBatchNo;
	}

	public void setReagentBatchNo(String reagentBatchNo)
	{
		this.reagentBatchNo = reagentBatchNo;
	}

	public Character getPrintId()
	{
		return this.printId;
	}

	public void setPrintId(Character printId)
	{
		this.printId = printId;
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

	public Character getAutoId()
	{
		return this.autoId;
	}

	public void setAutoId(Character autoId)
	{
		this.autoId = autoId;
	}

	public Character getState()
	{
		return this.state;
	}

	public void setState(Character state)
	{
		this.state = state;
	}

}
