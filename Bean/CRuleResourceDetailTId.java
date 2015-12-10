package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * CRuleResourceDetailTId generated by hbm2java
 */
public class CRuleResourceDetailTId implements java.io.Serializable
{

	private int id;
	private int ruleId;
	private String sampleNo;
	private String point;
	private String resourceSbt;
	private String resourceSsop;
	private String useFlag;
	private String recordName;
	private Date recordDate;
	private String remark;

	public CRuleResourceDetailTId()
	{
	}

	public CRuleResourceDetailTId(int id, int ruleId)
	{
		this.id = id;
		this.ruleId = ruleId;
	}

	public CRuleResourceDetailTId(int id, int ruleId, String sampleNo, String point, String resourceSbt,
			String resourceSsop, String useFlag, String recordName, Date recordDate, String remark)
	{
		this.id = id;
		this.ruleId = ruleId;
		this.sampleNo = sampleNo;
		this.point = point;
		this.resourceSbt = resourceSbt;
		this.resourceSsop = resourceSsop;
		this.useFlag = useFlag;
		this.recordName = recordName;
		this.recordDate = recordDate;
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

	public String getPoint()
	{
		return this.point;
	}

	public void setPoint(String point)
	{
		this.point = point;
	}

	public String getResourceSbt()
	{
		return this.resourceSbt;
	}

	public void setResourceSbt(String resourceSbt)
	{
		this.resourceSbt = resourceSbt;
	}

	public String getResourceSsop()
	{
		return this.resourceSsop;
	}

	public void setResourceSsop(String resourceSsop)
	{
		this.resourceSsop = resourceSsop;
	}

	public String getUseFlag()
	{
		return this.useFlag;
	}

	public void setUseFlag(String useFlag)
	{
		this.useFlag = useFlag;
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

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CRuleResourceDetailTId))
			return false;
		CRuleResourceDetailTId castOther = (CRuleResourceDetailTId) other;

		return (this.getId() == castOther.getId()) && (this.getRuleId() == castOther.getRuleId())
				&& ((this.getSampleNo() == castOther.getSampleNo()) || (this.getSampleNo() != null
						&& castOther.getSampleNo() != null && this.getSampleNo().equals(castOther.getSampleNo())))
				&& ((this.getPoint() == castOther.getPoint()) || (this.getPoint() != null
						&& castOther.getPoint() != null && this.getPoint().equals(castOther.getPoint())))
				&& ((this.getResourceSbt() == castOther.getResourceSbt())
						|| (this.getResourceSbt() != null && castOther.getResourceSbt() != null
								&& this.getResourceSbt().equals(castOther.getResourceSbt())))
				&& ((this.getResourceSsop() == castOther.getResourceSsop())
						|| (this.getResourceSsop() != null && castOther.getResourceSsop() != null
								&& this.getResourceSsop().equals(castOther.getResourceSsop())))
				&& ((this.getUseFlag() == castOther.getUseFlag()) || (this.getUseFlag() != null
						&& castOther.getUseFlag() != null && this.getUseFlag().equals(castOther.getUseFlag())))
				&& ((this.getRecordName() == castOther.getRecordName()) || (this.getRecordName() != null
						&& castOther.getRecordName() != null && this.getRecordName().equals(castOther.getRecordName())))
				&& ((this.getRecordDate() == castOther.getRecordDate()) || (this.getRecordDate() != null
						&& castOther.getRecordDate() != null && this.getRecordDate().equals(castOther.getRecordDate())))
				&& ((this.getRemark() == castOther.getRemark()) || (this.getRemark() != null
						&& castOther.getRemark() != null && this.getRemark().equals(castOther.getRemark())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + this.getRuleId();
		result = 37 * result + (getSampleNo() == null ? 0 : this.getSampleNo().hashCode());
		result = 37 * result + (getPoint() == null ? 0 : this.getPoint().hashCode());
		result = 37 * result + (getResourceSbt() == null ? 0 : this.getResourceSbt().hashCode());
		result = 37 * result + (getResourceSsop() == null ? 0 : this.getResourceSsop().hashCode());
		result = 37 * result + (getUseFlag() == null ? 0 : this.getUseFlag().hashCode());
		result = 37 * result + (getRecordName() == null ? 0 : this.getRecordName().hashCode());
		result = 37 * result + (getRecordDate() == null ? 0 : this.getRecordDate().hashCode());
		result = 37 * result + (getRemark() == null ? 0 : this.getRemark().hashCode());
		return result;
	}

}