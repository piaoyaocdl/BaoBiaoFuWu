package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * BillReagent generated by hbm2java
 */
public class BillReagent implements java.io.Serializable
{

	private int id;
	private CheckBill checkBill;
	private int batchId;
	private String reagentName;
	private String reagentBatchNo;
	private String remark;
	private Date recordTime;
	private String recordName;
	private Character printId;
	private Character autoId;

	public BillReagent()
	{
	}

	public BillReagent(int id, CheckBill checkBill, int batchId)
	{
		this.id = id;
		this.checkBill = checkBill;
		this.batchId = batchId;
	}

	public BillReagent(int id, CheckBill checkBill, int batchId, String reagentName, String reagentBatchNo,
			String remark, Date recordTime, String recordName, Character printId, Character autoId)
	{
		this.id = id;
		this.checkBill = checkBill;
		this.batchId = batchId;
		this.reagentName = reagentName;
		this.reagentBatchNo = reagentBatchNo;
		this.remark = remark;
		this.recordTime = recordTime;
		this.recordName = recordName;
		this.printId = printId;
		this.autoId = autoId;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public CheckBill getCheckBill()
	{
		return this.checkBill;
	}

	public void setCheckBill(CheckBill checkBill)
	{
		this.checkBill = checkBill;
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

	public Character getPrintId()
	{
		return this.printId;
	}

	public void setPrintId(Character printId)
	{
		this.printId = printId;
	}

	public Character getAutoId()
	{
		return this.autoId;
	}

	public void setAutoId(Character autoId)
	{
		this.autoId = autoId;
	}

}
