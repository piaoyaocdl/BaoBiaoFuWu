package riswell.model;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.sql.Clob;
import java.util.Date;

/**
 * CReplaceTId generated by hbm2java
 */
public class CReplaceTId implements java.io.Serializable
{

	private int id;
	private String originalNo;
	private String replaceNo;
	private Character useFlag;
	private Clob remark;
	private Date recordTime;
	private String recordName;
	private String original;
	private String replace;
	private Character startup;

	public CReplaceTId()
	{
	}

	public CReplaceTId(int id)
	{
		this.id = id;
	}

	public CReplaceTId(int id, String originalNo, String replaceNo, Character useFlag, Clob remark, Date recordTime,
			String recordName, String original, String replace, Character startup)
	{
		this.id = id;
		this.originalNo = originalNo;
		this.replaceNo = replaceNo;
		this.useFlag = useFlag;
		this.remark = remark;
		this.recordTime = recordTime;
		this.recordName = recordName;
		this.original = original;
		this.replace = replace;
		this.startup = startup;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getOriginalNo()
	{
		return this.originalNo;
	}

	public void setOriginalNo(String originalNo)
	{
		this.originalNo = originalNo;
	}

	public String getReplaceNo()
	{
		return this.replaceNo;
	}

	public void setReplaceNo(String replaceNo)
	{
		this.replaceNo = replaceNo;
	}

	public Character getUseFlag()
	{
		return this.useFlag;
	}

	public void setUseFlag(Character useFlag)
	{
		this.useFlag = useFlag;
	}

	public Clob getRemark()
	{
		return this.remark;
	}

	public void setRemark(Clob remark)
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

	public String getOriginal()
	{
		return this.original;
	}

	public void setOriginal(String original)
	{
		this.original = original;
	}

	public String getReplace()
	{
		return this.replace;
	}

	public void setReplace(String replace)
	{
		this.replace = replace;
	}

	public Character getStartup()
	{
		return this.startup;
	}

	public void setStartup(Character startup)
	{
		this.startup = startup;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CReplaceTId))
			return false;
		CReplaceTId castOther = (CReplaceTId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getOriginalNo() == castOther.getOriginalNo()) || (this.getOriginalNo() != null
						&& castOther.getOriginalNo() != null && this.getOriginalNo().equals(castOther.getOriginalNo())))
				&& ((this.getReplaceNo() == castOther.getReplaceNo()) || (this.getReplaceNo() != null
						&& castOther.getReplaceNo() != null && this.getReplaceNo().equals(castOther.getReplaceNo())))
				&& ((this.getUseFlag() == castOther.getUseFlag()) || (this.getUseFlag() != null
						&& castOther.getUseFlag() != null && this.getUseFlag().equals(castOther.getUseFlag())))
				&& ((this.getRemark() == castOther.getRemark()) || (this.getRemark() != null
						&& castOther.getRemark() != null && this.getRemark().equals(castOther.getRemark())))
				&& ((this.getRecordTime() == castOther.getRecordTime()) || (this.getRecordTime() != null
						&& castOther.getRecordTime() != null && this.getRecordTime().equals(castOther.getRecordTime())))
				&& ((this.getRecordName() == castOther.getRecordName()) || (this.getRecordName() != null
						&& castOther.getRecordName() != null && this.getRecordName().equals(castOther.getRecordName())))
				&& ((this.getOriginal() == castOther.getOriginal()) || (this.getOriginal() != null
						&& castOther.getOriginal() != null && this.getOriginal().equals(castOther.getOriginal())))
				&& ((this.getReplace() == castOther.getReplace()) || (this.getReplace() != null
						&& castOther.getReplace() != null && this.getReplace().equals(castOther.getReplace())))
				&& ((this.getStartup() == castOther.getStartup()) || (this.getStartup() != null
						&& castOther.getStartup() != null && this.getStartup().equals(castOther.getStartup())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getOriginalNo() == null ? 0 : this.getOriginalNo().hashCode());
		result = 37 * result + (getReplaceNo() == null ? 0 : this.getReplaceNo().hashCode());
		result = 37 * result + (getUseFlag() == null ? 0 : this.getUseFlag().hashCode());
		result = 37 * result + (getRemark() == null ? 0 : this.getRemark().hashCode());
		result = 37 * result + (getRecordTime() == null ? 0 : this.getRecordTime().hashCode());
		result = 37 * result + (getRecordName() == null ? 0 : this.getRecordName().hashCode());
		result = 37 * result + (getOriginal() == null ? 0 : this.getOriginal().hashCode());
		result = 37 * result + (getReplace() == null ? 0 : this.getReplace().hashCode());
		result = 37 * result + (getStartup() == null ? 0 : this.getStartup().hashCode());
		return result;
	}

}
