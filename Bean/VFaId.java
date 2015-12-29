package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

/**
 * VFaId generated by hbm2java
 */
public class VFaId implements java.io.Serializable
{

	private int id;
	private int billId;
	private String name;
	private String result;
	private String antibody;

	public VFaId()
	{
	}

	public VFaId(int id, int billId, String result)
	{
		this.id = id;
		this.billId = billId;
		this.result = result;
	}

	public VFaId(int id, int billId, String name, String result, String antibody)
	{
		this.id = id;
		this.billId = billId;
		this.name = name;
		this.result = result;
		this.antibody = antibody;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getBillId()
	{
		return this.billId;
	}

	public void setBillId(int billId)
	{
		this.billId = billId;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getResult()
	{
		return this.result;
	}

	public void setResult(String result)
	{
		this.result = result;
	}

	public String getAntibody()
	{
		return this.antibody;
	}

	public void setAntibody(String antibody)
	{
		this.antibody = antibody;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VFaId))
			return false;
		VFaId castOther = (VFaId) other;

		return (this.getId() == castOther.getId()) && (this.getBillId() == castOther.getBillId())
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getResult() == castOther.getResult()) || (this.getResult() != null
						&& castOther.getResult() != null && this.getResult().equals(castOther.getResult())))
				&& ((this.getAntibody() == castOther.getAntibody()) || (this.getAntibody() != null
						&& castOther.getAntibody() != null && this.getAntibody().equals(castOther.getAntibody())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + this.getBillId();
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getResult() == null ? 0 : this.getResult().hashCode());
		result = 37 * result + (getAntibody() == null ? 0 : this.getAntibody().hashCode());
		return result;
	}

}
