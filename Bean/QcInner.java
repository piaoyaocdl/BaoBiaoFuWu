package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * QcInner generated by hbm2java
 */
public class QcInner implements java.io.Serializable
{

	private int id;
	private String qcItem;
	private Date qcDate;
	private Integer reagentId;
	private String reagentName;
	private String batchNo;
	private int batchId;
	private String result;
	private String operator;
	private String checker;
	private String result1;
	private String result2;
	private String result3;
	private String result4;
	private String result5;
	private String remark;
	private String recordName;
	private Date recordTime;
	private Character status;

	public QcInner()
	{
	}

	public QcInner(int id, String qcItem, Date qcDate, int batchId)
	{
		this.id = id;
		this.qcItem = qcItem;
		this.qcDate = qcDate;
		this.batchId = batchId;
	}

	public QcInner(int id, String qcItem, Date qcDate, Integer reagentId, String reagentName, String batchNo,
			int batchId, String result, String operator, String checker, String result1, String result2, String result3,
			String result4, String result5, String remark, String recordName, Date recordTime, Character status)
	{
		this.id = id;
		this.qcItem = qcItem;
		this.qcDate = qcDate;
		this.reagentId = reagentId;
		this.reagentName = reagentName;
		this.batchNo = batchNo;
		this.batchId = batchId;
		this.result = result;
		this.operator = operator;
		this.checker = checker;
		this.result1 = result1;
		this.result2 = result2;
		this.result3 = result3;
		this.result4 = result4;
		this.result5 = result5;
		this.remark = remark;
		this.recordName = recordName;
		this.recordTime = recordTime;
		this.status = status;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getQcItem()
	{
		return this.qcItem;
	}

	public void setQcItem(String qcItem)
	{
		this.qcItem = qcItem;
	}

	public Date getQcDate()
	{
		return this.qcDate;
	}

	public void setQcDate(Date qcDate)
	{
		this.qcDate = qcDate;
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

	public int getBatchId()
	{
		return this.batchId;
	}

	public void setBatchId(int batchId)
	{
		this.batchId = batchId;
	}

	public String getResult()
	{
		return this.result;
	}

	public void setResult(String result)
	{
		this.result = result;
	}

	public String getOperator()
	{
		return this.operator;
	}

	public void setOperator(String operator)
	{
		this.operator = operator;
	}

	public String getChecker()
	{
		return this.checker;
	}

	public void setChecker(String checker)
	{
		this.checker = checker;
	}

	public String getResult1()
	{
		return this.result1;
	}

	public void setResult1(String result1)
	{
		this.result1 = result1;
	}

	public String getResult2()
	{
		return this.result2;
	}

	public void setResult2(String result2)
	{
		this.result2 = result2;
	}

	public String getResult3()
	{
		return this.result3;
	}

	public void setResult3(String result3)
	{
		this.result3 = result3;
	}

	public String getResult4()
	{
		return this.result4;
	}

	public void setResult4(String result4)
	{
		this.result4 = result4;
	}

	public String getResult5()
	{
		return this.result5;
	}

	public void setResult5(String result5)
	{
		this.result5 = result5;
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

	public Character getStatus()
	{
		return this.status;
	}

	public void setStatus(Character status)
	{
		this.status = status;
	}

}
