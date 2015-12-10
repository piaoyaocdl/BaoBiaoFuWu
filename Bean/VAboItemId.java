package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

/**
 * VAboItemId generated by hbm2java
 */
public class VAboItemId implements java.io.Serializable
{

	private int id;
	private int billId;
	private String name;
	private String bloodType;
	private String rhdRes;

	public VAboItemId()
	{
	}

	public VAboItemId(int id, int billId, String bloodType)
	{
		this.id = id;
		this.billId = billId;
		this.bloodType = bloodType;
	}

	public VAboItemId(int id, int billId, String name, String bloodType, String rhdRes)
	{
		this.id = id;
		this.billId = billId;
		this.name = name;
		this.bloodType = bloodType;
		this.rhdRes = rhdRes;
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

	public String getBloodType()
	{
		return this.bloodType;
	}

	public void setBloodType(String bloodType)
	{
		this.bloodType = bloodType;
	}

	public String getRhdRes()
	{
		return this.rhdRes;
	}

	public void setRhdRes(String rhdRes)
	{
		this.rhdRes = rhdRes;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VAboItemId))
			return false;
		VAboItemId castOther = (VAboItemId) other;

		return (this.getId() == castOther.getId()) && (this.getBillId() == castOther.getBillId())
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getBloodType() == castOther.getBloodType()) || (this.getBloodType() != null
						&& castOther.getBloodType() != null && this.getBloodType().equals(castOther.getBloodType())))
				&& ((this.getRhdRes() == castOther.getRhdRes()) || (this.getRhdRes() != null
						&& castOther.getRhdRes() != null && this.getRhdRes().equals(castOther.getRhdRes())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + this.getBillId();
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getBloodType() == null ? 0 : this.getBloodType().hashCode());
		result = 37 * result + (getRhdRes() == null ? 0 : this.getRhdRes().hashCode());
		return result;
	}

}