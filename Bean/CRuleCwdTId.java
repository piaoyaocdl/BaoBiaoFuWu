package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * CRuleCwdTId generated by hbm2java
 */
public class CRuleCwdTId implements java.io.Serializable
{

	private int id;
	private String ruleName;
	private String ruleType;
	private String ruleFlag;
	private String recordName;
	private Date recordTime;
	private String remark;

	public CRuleCwdTId()
	{
	}

	public CRuleCwdTId(int id)
	{
		this.id = id;
	}

	public CRuleCwdTId(int id, String ruleName, String ruleType, String ruleFlag, String recordName, Date recordTime,
			String remark)
	{
		this.id = id;
		this.ruleName = ruleName;
		this.ruleType = ruleType;
		this.ruleFlag = ruleFlag;
		this.recordName = recordName;
		this.recordTime = recordTime;
		this.remark = remark;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getRuleName()
	{
		return this.ruleName;
	}

	public void setRuleName(String ruleName)
	{
		this.ruleName = ruleName;
	}

	public String getRuleType()
	{
		return this.ruleType;
	}

	public void setRuleType(String ruleType)
	{
		this.ruleType = ruleType;
	}

	public String getRuleFlag()
	{
		return this.ruleFlag;
	}

	public void setRuleFlag(String ruleFlag)
	{
		this.ruleFlag = ruleFlag;
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

	public String getRemark()
	{
		return this.remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CRuleCwdTId))
			return false;
		CRuleCwdTId castOther = (CRuleCwdTId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getRuleName() == castOther.getRuleName()) || (this.getRuleName() != null
						&& castOther.getRuleName() != null && this.getRuleName().equals(castOther.getRuleName())))
				&& ((this.getRuleType() == castOther.getRuleType()) || (this.getRuleType() != null
						&& castOther.getRuleType() != null && this.getRuleType().equals(castOther.getRuleType())))
				&& ((this.getRuleFlag() == castOther.getRuleFlag()) || (this.getRuleFlag() != null
						&& castOther.getRuleFlag() != null && this.getRuleFlag().equals(castOther.getRuleFlag())))
				&& ((this.getRecordName() == castOther.getRecordName()) || (this.getRecordName() != null
						&& castOther.getRecordName() != null && this.getRecordName().equals(castOther.getRecordName())))
				&& ((this.getRecordTime() == castOther.getRecordTime()) || (this.getRecordTime() != null
						&& castOther.getRecordTime() != null && this.getRecordTime().equals(castOther.getRecordTime())))
				&& ((this.getRemark() == castOther.getRemark()) || (this.getRemark() != null
						&& castOther.getRemark() != null && this.getRemark().equals(castOther.getRemark())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getRuleName() == null ? 0 : this.getRuleName().hashCode());
		result = 37 * result + (getRuleType() == null ? 0 : this.getRuleType().hashCode());
		result = 37 * result + (getRuleFlag() == null ? 0 : this.getRuleFlag().hashCode());
		result = 37 * result + (getRecordName() == null ? 0 : this.getRecordName().hashCode());
		result = 37 * result + (getRecordTime() == null ? 0 : this.getRecordTime().hashCode());
		result = 37 * result + (getRemark() == null ? 0 : this.getRemark().hashCode());
		return result;
	}

}
