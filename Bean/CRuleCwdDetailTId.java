package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * CRuleCwdDetailTId generated by hbm2java
 */
public class CRuleCwdDetailTId implements java.io.Serializable
{

	private int id;
	private int ruleId;
	private String sampleNo;
	private String alleleName;
	private String point;
	private String ruleResult;
	private String ashiResult;
	private String cmdpResult;
	private String localResult;
	private String recordName;
	private Date recordDate;
	private String remark;
	private String ruleFlag;

	public CRuleCwdDetailTId()
	{
	}

	public CRuleCwdDetailTId(int id, int ruleId)
	{
		this.id = id;
		this.ruleId = ruleId;
	}

	public CRuleCwdDetailTId(int id, int ruleId, String sampleNo, String alleleName, String point, String ruleResult,
			String ashiResult, String cmdpResult, String localResult, String recordName, Date recordDate, String remark,
			String ruleFlag)
	{
		this.id = id;
		this.ruleId = ruleId;
		this.sampleNo = sampleNo;
		this.alleleName = alleleName;
		this.point = point;
		this.ruleResult = ruleResult;
		this.ashiResult = ashiResult;
		this.cmdpResult = cmdpResult;
		this.localResult = localResult;
		this.recordName = recordName;
		this.recordDate = recordDate;
		this.remark = remark;
		this.ruleFlag = ruleFlag;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getRuleId()
	{
		return this.ruleId;
	}

	public void setRuleId(int ruleId)
	{
		this.ruleId = ruleId;
	}

	public String getSampleNo()
	{
		return this.sampleNo;
	}

	public void setSampleNo(String sampleNo)
	{
		this.sampleNo = sampleNo;
	}

	public String getAlleleName()
	{
		return this.alleleName;
	}

	public void setAlleleName(String alleleName)
	{
		this.alleleName = alleleName;
	}

	public String getPoint()
	{
		return this.point;
	}

	public void setPoint(String point)
	{
		this.point = point;
	}

	public String getRuleResult()
	{
		return this.ruleResult;
	}

	public void setRuleResult(String ruleResult)
	{
		this.ruleResult = ruleResult;
	}

	public String getAshiResult()
	{
		return this.ashiResult;
	}

	public void setAshiResult(String ashiResult)
	{
		this.ashiResult = ashiResult;
	}

	public String getCmdpResult()
	{
		return this.cmdpResult;
	}

	public void setCmdpResult(String cmdpResult)
	{
		this.cmdpResult = cmdpResult;
	}

	public String getLocalResult()
	{
		return this.localResult;
	}

	public void setLocalResult(String localResult)
	{
		this.localResult = localResult;
	}

	public String getRecordName()
	{
		return this.recordName;
	}

	public void setRecordName(String recordName)
	{
		this.recordName = recordName;
	}

	public Date getRecordDate()
	{
		return this.recordDate;
	}

	public void setRecordDate(Date recordDate)
	{
		this.recordDate = recordDate;
	}

	public String getRemark()
	{
		return this.remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public String getRuleFlag()
	{
		return this.ruleFlag;
	}

	public void setRuleFlag(String ruleFlag)
	{
		this.ruleFlag = ruleFlag;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CRuleCwdDetailTId))
			return false;
		CRuleCwdDetailTId castOther = (CRuleCwdDetailTId) other;

		return (this.getId() == castOther.getId()) && (this.getRuleId() == castOther.getRuleId())
				&& ((this.getSampleNo() == castOther.getSampleNo()) || (this.getSampleNo() != null
						&& castOther.getSampleNo() != null && this.getSampleNo().equals(castOther.getSampleNo())))
				&& ((this.getAlleleName() == castOther.getAlleleName()) || (this.getAlleleName() != null
						&& castOther.getAlleleName() != null && this.getAlleleName().equals(castOther.getAlleleName())))
				&& ((this.getPoint() == castOther.getPoint()) || (this.getPoint() != null
						&& castOther.getPoint() != null && this.getPoint().equals(castOther.getPoint())))
				&& ((this.getRuleResult() == castOther.getRuleResult()) || (this.getRuleResult() != null
						&& castOther.getRuleResult() != null && this.getRuleResult().equals(castOther.getRuleResult())))
				&& ((this.getAshiResult() == castOther.getAshiResult()) || (this.getAshiResult() != null
						&& castOther.getAshiResult() != null && this.getAshiResult().equals(castOther.getAshiResult())))
				&& ((this.getCmdpResult() == castOther.getCmdpResult()) || (this.getCmdpResult() != null
						&& castOther.getCmdpResult() != null && this.getCmdpResult().equals(castOther.getCmdpResult())))
				&& ((this.getLocalResult() == castOther.getLocalResult())
						|| (this.getLocalResult() != null && castOther.getLocalResult() != null
								&& this.getLocalResult().equals(castOther.getLocalResult())))
				&& ((this.getRecordName() == castOther.getRecordName()) || (this.getRecordName() != null
						&& castOther.getRecordName() != null && this.getRecordName().equals(castOther.getRecordName())))
				&& ((this.getRecordDate() == castOther.getRecordDate()) || (this.getRecordDate() != null
						&& castOther.getRecordDate() != null && this.getRecordDate().equals(castOther.getRecordDate())))
				&& ((this.getRemark() == castOther.getRemark()) || (this.getRemark() != null
						&& castOther.getRemark() != null && this.getRemark().equals(castOther.getRemark())))
				&& ((this.getRuleFlag() == castOther.getRuleFlag()) || (this.getRuleFlag() != null
						&& castOther.getRuleFlag() != null && this.getRuleFlag().equals(castOther.getRuleFlag())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + this.getRuleId();
		result = 37 * result + (getSampleNo() == null ? 0 : this.getSampleNo().hashCode());
		result = 37 * result + (getAlleleName() == null ? 0 : this.getAlleleName().hashCode());
		result = 37 * result + (getPoint() == null ? 0 : this.getPoint().hashCode());
		result = 37 * result + (getRuleResult() == null ? 0 : this.getRuleResult().hashCode());
		result = 37 * result + (getAshiResult() == null ? 0 : this.getAshiResult().hashCode());
		result = 37 * result + (getCmdpResult() == null ? 0 : this.getCmdpResult().hashCode());
		result = 37 * result + (getLocalResult() == null ? 0 : this.getLocalResult().hashCode());
		result = 37 * result + (getRecordName() == null ? 0 : this.getRecordName().hashCode());
		result = 37 * result + (getRecordDate() == null ? 0 : this.getRecordDate().hashCode());
		result = 37 * result + (getRemark() == null ? 0 : this.getRemark().hashCode());
		result = 37 * result + (getRuleFlag() == null ? 0 : this.getRuleFlag().hashCode());
		return result;
	}

}