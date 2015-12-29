package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

/**
 * PbcatfmtId generated by hbm2java
 */
public class PbcatfmtId implements java.io.Serializable
{

	private String pbfName;
	private String pbfFrmt;
	private short pbfType;
	private Integer pbfCntr;

	public PbcatfmtId()
	{
	}

	public PbcatfmtId(String pbfName, String pbfFrmt, short pbfType)
	{
		this.pbfName = pbfName;
		this.pbfFrmt = pbfFrmt;
		this.pbfType = pbfType;
	}

	public PbcatfmtId(String pbfName, String pbfFrmt, short pbfType, Integer pbfCntr)
	{
		this.pbfName = pbfName;
		this.pbfFrmt = pbfFrmt;
		this.pbfType = pbfType;
		this.pbfCntr = pbfCntr;
	}

	public String getPbfName()
	{
		return this.pbfName;
	}

	public void setPbfName(String pbfName)
	{
		this.pbfName = pbfName;
	}

	public String getPbfFrmt()
	{
		return this.pbfFrmt;
	}

	public void setPbfFrmt(String pbfFrmt)
	{
		this.pbfFrmt = pbfFrmt;
	}

	public short getPbfType()
	{
		return this.pbfType;
	}

	public void setPbfType(short pbfType)
	{
		this.pbfType = pbfType;
	}

	public Integer getPbfCntr()
	{
		return this.pbfCntr;
	}

	public void setPbfCntr(Integer pbfCntr)
	{
		this.pbfCntr = pbfCntr;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PbcatfmtId))
			return false;
		PbcatfmtId castOther = (PbcatfmtId) other;

		return ((this.getPbfName() == castOther.getPbfName()) || (this.getPbfName() != null
				&& castOther.getPbfName() != null && this.getPbfName().equals(castOther.getPbfName())))
				&& ((this.getPbfFrmt() == castOther.getPbfFrmt()) || (this.getPbfFrmt() != null
						&& castOther.getPbfFrmt() != null && this.getPbfFrmt().equals(castOther.getPbfFrmt())))
				&& (this.getPbfType() == castOther.getPbfType())
				&& ((this.getPbfCntr() == castOther.getPbfCntr()) || (this.getPbfCntr() != null
						&& castOther.getPbfCntr() != null && this.getPbfCntr().equals(castOther.getPbfCntr())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result + (getPbfName() == null ? 0 : this.getPbfName().hashCode());
		result = 37 * result + (getPbfFrmt() == null ? 0 : this.getPbfFrmt().hashCode());
		result = 37 * result + this.getPbfType();
		result = 37 * result + (getPbfCntr() == null ? 0 : this.getPbfCntr().hashCode());
		return result;
	}

}
