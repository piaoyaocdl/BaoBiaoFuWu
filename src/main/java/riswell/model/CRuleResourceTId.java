package riswell.model;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * CRuleResourceTId generated by hbm2java
 */
public class CRuleResourceTId implements java.io.Serializable
{

	private int id;
	private String ruleName;
	private String useFlag;
	private String ruleType;
	private String recordName;
	private Date recordTime;
	private String remark;

	public CRuleResourceTId()
	{
	}

	public CRuleResourceTId(int id, String useFlag)
	{
		this.id = id;
		this.useFlag = useFlag;
	}

	public CRuleResourceTId(int id, String ruleName, String useFlag, String ruleType, String recordName,
			Date recordTime, String remark)
	{
		this.id = id;
		this.ruleName = ruleName;
		this.useFlag = useFlag;
		this.ruleType = ruleType;
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

	public String getUseFlag()
	{
		return this.useFlag;
	}

	public void setUseFlag(String useFlag)
	{
		this.useFlag = useFlag;
	}

	public String getRuleType()
	{
		return this.ruleType;
	}

	public void setRuleType(String ruleType)
	{
		this.ruleType = ruleType;
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
		if (!(other instanceof CRuleResourceTId))
			return false;
		CRuleResourceTId castOther = (CRuleResourceTId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getRuleName() == castOther.getRuleName()) || (this.getRuleName() != null
						&& castOther.getRuleName() != null && this.getRuleName().equals(castOther.getRuleName())))
				&& ((this.getUseFlag() == castOther.getUseFlag()) || (this.getUseFlag() != null
						&& castOther.getUseFlag() != null && this.getUseFlag().equals(castOther.getUseFlag())))
				&& ((this.getRuleType() == castOther.getRuleType()) || (this.getRuleType() != null
						&& castOther.getRuleType() != null && this.getRuleType().equals(castOther.getRuleType())))
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
		result = 37 * result + (getUseFlag() == null ? 0 : this.getUseFlag().hashCode());
		result = 37 * result + (getRuleType() == null ? 0 : this.getRuleType().hashCode());
		result = 37 * result + (getRecordName() == null ? 0 : this.getRecordName().hashCode());
		result = 37 * result + (getRecordTime() == null ? 0 : this.getRecordTime().hashCode());
		result = 37 * result + (getRemark() == null ? 0 : this.getRemark().hashCode());
		return result;
	}

}
