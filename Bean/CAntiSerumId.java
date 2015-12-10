package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * CAntiSerumId generated by hbm2java
 */
public class CAntiSerumId implements java.io.Serializable
{

	private int id;
	private String kind;
	private String name;
	private String remark;
	private String recordName;
	private Date recordTime;

	public CAntiSerumId()
	{
	}

	public CAntiSerumId(int id, String kind, String name)
	{
		this.id = id;
		this.kind = kind;
		this.name = name;
	}

	public CAntiSerumId(int id, String kind, String name, String remark, String recordName, Date recordTime)
	{
		this.id = id;
		this.kind = kind;
		this.name = name;
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

	public String getKind()
	{
		return this.kind;
	}

	public void setKind(String kind)
	{
		this.kind = kind;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
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

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CAntiSerumId))
			return false;
		CAntiSerumId castOther = (CAntiSerumId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getKind() == castOther.getKind()) || (this.getKind() != null && castOther.getKind() != null
						&& this.getKind().equals(castOther.getKind())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getRemark() == castOther.getRemark()) || (this.getRemark() != null
						&& castOther.getRemark() != null && this.getRemark().equals(castOther.getRemark())))
				&& ((this.getRecordName() == castOther.getRecordName()) || (this.getRecordName() != null
						&& castOther.getRecordName() != null && this.getRecordName().equals(castOther.getRecordName())))
				&& ((this.getRecordTime() == castOther.getRecordTime())
						|| (this.getRecordTime() != null && castOther.getRecordTime() != null
								&& this.getRecordTime().equals(castOther.getRecordTime())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getKind() == null ? 0 : this.getKind().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getRemark() == null ? 0 : this.getRemark().hashCode());
		result = 37 * result + (getRecordName() == null ? 0 : this.getRecordName().hashCode());
		result = 37 * result + (getRecordTime() == null ? 0 : this.getRecordTime().hashCode());
		return result;
	}

}
