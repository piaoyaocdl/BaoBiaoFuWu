package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

/**
 * PbcatedtId generated by hbm2java
 */
public class PbcatedtId implements java.io.Serializable
{

	private String pbeName;
	private String pbeEdit;
	private short pbeType;
	private Integer pbeCntr;
	private short pbeSeqn;
	private Integer pbeFlag;
	private String pbeWork;

	public PbcatedtId()
	{
	}

	public PbcatedtId(String pbeName, short pbeType, short pbeSeqn)
	{
		this.pbeName = pbeName;
		this.pbeType = pbeType;
		this.pbeSeqn = pbeSeqn;
	}

	public PbcatedtId(String pbeName, String pbeEdit, short pbeType, Integer pbeCntr, short pbeSeqn, Integer pbeFlag,
			String pbeWork)
	{
		this.pbeName = pbeName;
		this.pbeEdit = pbeEdit;
		this.pbeType = pbeType;
		this.pbeCntr = pbeCntr;
		this.pbeSeqn = pbeSeqn;
		this.pbeFlag = pbeFlag;
		this.pbeWork = pbeWork;
	}

	public String getPbeName()
	{
		return this.pbeName;
	}

	public void setPbeName(String pbeName)
	{
		this.pbeName = pbeName;
	}

	public String getPbeEdit()
	{
		return this.pbeEdit;
	}

	public void setPbeEdit(String pbeEdit)
	{
		this.pbeEdit = pbeEdit;
	}

	public short getPbeType()
	{
		return this.pbeType;
	}

	public void setPbeType(short pbeType)
	{
		this.pbeType = pbeType;
	}

	public Integer getPbeCntr()
	{
		return this.pbeCntr;
	}

	public void setPbeCntr(Integer pbeCntr)
	{
		this.pbeCntr = pbeCntr;
	}

	public short getPbeSeqn()
	{
		return this.pbeSeqn;
	}

	public void setPbeSeqn(short pbeSeqn)
	{
		this.pbeSeqn = pbeSeqn;
	}

	public Integer getPbeFlag()
	{
		return this.pbeFlag;
	}

	public void setPbeFlag(Integer pbeFlag)
	{
		this.pbeFlag = pbeFlag;
	}

	public String getPbeWork()
	{
		return this.pbeWork;
	}

	public void setPbeWork(String pbeWork)
	{
		this.pbeWork = pbeWork;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PbcatedtId))
			return false;
		PbcatedtId castOther = (PbcatedtId) other;

		return ((this.getPbeName() == castOther.getPbeName()) || (this.getPbeName() != null
				&& castOther.getPbeName() != null && this.getPbeName().equals(castOther.getPbeName())))
				&& ((this.getPbeEdit() == castOther.getPbeEdit()) || (this.getPbeEdit() != null
						&& castOther.getPbeEdit() != null && this.getPbeEdit().equals(castOther.getPbeEdit())))
				&& (this.getPbeType() == castOther.getPbeType())
				&& ((this.getPbeCntr() == castOther.getPbeCntr()) || (this.getPbeCntr() != null
						&& castOther.getPbeCntr() != null && this.getPbeCntr().equals(castOther.getPbeCntr())))
				&& (this.getPbeSeqn() == castOther.getPbeSeqn())
				&& ((this.getPbeFlag() == castOther.getPbeFlag()) || (this.getPbeFlag() != null
						&& castOther.getPbeFlag() != null && this.getPbeFlag().equals(castOther.getPbeFlag())))
				&& ((this.getPbeWork() == castOther.getPbeWork()) || (this.getPbeWork() != null
						&& castOther.getPbeWork() != null && this.getPbeWork().equals(castOther.getPbeWork())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result + (getPbeName() == null ? 0 : this.getPbeName().hashCode());
		result = 37 * result + (getPbeEdit() == null ? 0 : this.getPbeEdit().hashCode());
		result = 37 * result + this.getPbeType();
		result = 37 * result + (getPbeCntr() == null ? 0 : this.getPbeCntr().hashCode());
		result = 37 * result + this.getPbeSeqn();
		result = 37 * result + (getPbeFlag() == null ? 0 : this.getPbeFlag().hashCode());
		result = 37 * result + (getPbeWork() == null ? 0 : this.getPbeWork().hashCode());
		return result;
	}

}
