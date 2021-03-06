package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * RbMade generated by hbm2java
 */
public class RbMade implements java.io.Serializable
{

	private int id;
	private Date madeDate;
	private Date invalidDate;
	private Character qcId;
	private String operator;
	private String checker;
	private String remark;
	private String recordName;
	private Date recordTime;

	public RbMade()
	{
	}

	public RbMade(int id, Date madeDate, Date invalidDate)
	{
		this.id = id;
		this.madeDate = madeDate;
		this.invalidDate = invalidDate;
	}

	public RbMade(int id, Date madeDate, Date invalidDate, Character qcId, String operator, String checker,
			String remark, String recordName, Date recordTime)
	{
		this.id = id;
		this.madeDate = madeDate;
		this.invalidDate = invalidDate;
		this.qcId = qcId;
		this.operator = operator;
		this.checker = checker;
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

	public Date getMadeDate()
	{
		return this.madeDate;
	}

	public void setMadeDate(Date madeDate)
	{
		this.madeDate = madeDate;
	}

	public Date getInvalidDate()
	{
		return this.invalidDate;
	}

	public void setInvalidDate(Date invalidDate)
	{
		this.invalidDate = invalidDate;
	}

	public Character getQcId()
	{
		return this.qcId;
	}

	public void setQcId(Character qcId)
	{
		this.qcId = qcId;
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
