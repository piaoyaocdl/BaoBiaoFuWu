package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * CImgtTId generated by hbm2java
 */
public class CImgtTId implements java.io.Serializable
{

	private int id;
	private String ssopImgt;
	private String imgtFlag;
	private String recordName;
	private Date recordTime;
	private String remark;
	private String ssopvimgt;
	private String sbtvimgt;

	public CImgtTId()
	{
	}

	public CImgtTId(int id, String imgtFlag)
	{
		this.id = id;
		this.imgtFlag = imgtFlag;
	}

	public CImgtTId(int id, String ssopImgt, String imgtFlag, String recordName, Date recordTime, String remark,
			String ssopvimgt, String sbtvimgt)
	{
		this.id = id;
		this.ssopImgt = ssopImgt;
		this.imgtFlag = imgtFlag;
		this.recordName = recordName;
		this.recordTime = recordTime;
		this.remark = remark;
		this.ssopvimgt = ssopvimgt;
		this.sbtvimgt = sbtvimgt;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getSsopImgt()
	{
		return this.ssopImgt;
	}

	public void setSsopImgt(String ssopImgt)
	{
		this.ssopImgt = ssopImgt;
	}

	public String getImgtFlag()
	{
		return this.imgtFlag;
	}

	public void setImgtFlag(String imgtFlag)
	{
		this.imgtFlag = imgtFlag;
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

	public String getSsopvimgt()
	{
		return this.ssopvimgt;
	}

	public void setSsopvimgt(String ssopvimgt)
	{
		this.ssopvimgt = ssopvimgt;
	}

	public String getSbtvimgt()
	{
		return this.sbtvimgt;
	}

	public void setSbtvimgt(String sbtvimgt)
	{
		this.sbtvimgt = sbtvimgt;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CImgtTId))
			return false;
		CImgtTId castOther = (CImgtTId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getSsopImgt() == castOther.getSsopImgt()) || (this.getSsopImgt() != null
						&& castOther.getSsopImgt() != null && this.getSsopImgt().equals(castOther.getSsopImgt())))
				&& ((this.getImgtFlag() == castOther.getImgtFlag()) || (this.getImgtFlag() != null
						&& castOther.getImgtFlag() != null && this.getImgtFlag().equals(castOther.getImgtFlag())))
				&& ((this.getRecordName() == castOther.getRecordName()) || (this.getRecordName() != null
						&& castOther.getRecordName() != null && this.getRecordName().equals(castOther.getRecordName())))
				&& ((this.getRecordTime() == castOther.getRecordTime()) || (this.getRecordTime() != null
						&& castOther.getRecordTime() != null && this.getRecordTime().equals(castOther.getRecordTime())))
				&& ((this.getRemark() == castOther.getRemark()) || (this.getRemark() != null
						&& castOther.getRemark() != null && this.getRemark().equals(castOther.getRemark())))
				&& ((this.getSsopvimgt() == castOther.getSsopvimgt()) || (this.getSsopvimgt() != null
						&& castOther.getSsopvimgt() != null && this.getSsopvimgt().equals(castOther.getSsopvimgt())))
				&& ((this.getSbtvimgt() == castOther.getSbtvimgt()) || (this.getSbtvimgt() != null
						&& castOther.getSbtvimgt() != null && this.getSbtvimgt().equals(castOther.getSbtvimgt())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getSsopImgt() == null ? 0 : this.getSsopImgt().hashCode());
		result = 37 * result + (getImgtFlag() == null ? 0 : this.getImgtFlag().hashCode());
		result = 37 * result + (getRecordName() == null ? 0 : this.getRecordName().hashCode());
		result = 37 * result + (getRecordTime() == null ? 0 : this.getRecordTime().hashCode());
		result = 37 * result + (getRemark() == null ? 0 : this.getRemark().hashCode());
		result = 37 * result + (getSsopvimgt() == null ? 0 : this.getSsopvimgt().hashCode());
		result = 37 * result + (getSbtvimgt() == null ? 0 : this.getSbtvimgt().hashCode());
		return result;
	}

}
