package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

/**
 * VAabId generated by hbm2java
 */
public class VAabId implements java.io.Serializable
{

	private int id;
	private int billId;
	private String name;
	private String result;
	private String method;
	private String methodName;

	public VAabId()
	{
	}

	public VAabId(int id, int billId)
	{
		this.id = id;
		this.billId = billId;
	}

	public VAabId(int id, int billId, String name, String result, String method, String methodName)
	{
		this.id = id;
		this.billId = billId;
		this.name = name;
		this.result = result;
		this.method = method;
		this.methodName = methodName;
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

	public String getMethod()
	{
		return this.method;
	}

	public void setMethod(String method)
	{
		this.method = method;
	}

	public String getMethodName()
	{
		return this.methodName;
	}

	public void setMethodName(String methodName)
	{
		this.methodName = methodName;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VAabId))
			return false;
		VAabId castOther = (VAabId) other;

		return (this.getId() == castOther.getId()) && (this.getBillId() == castOther.getBillId())
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getResult() == castOther.getResult()) || (this.getResult() != null
						&& castOther.getResult() != null && this.getResult().equals(castOther.getResult())))
				&& ((this.getMethod() == castOther.getMethod()) || (this.getMethod() != null
						&& castOther.getMethod() != null && this.getMethod().equals(castOther.getMethod())))
				&& ((this.getMethodName() == castOther.getMethodName())
						|| (this.getMethodName() != null && castOther.getMethodName() != null
								&& this.getMethodName().equals(castOther.getMethodName())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + this.getBillId();
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getResult() == null ? 0 : this.getResult().hashCode());
		result = 37 * result + (getMethod() == null ? 0 : this.getMethod().hashCode());
		result = 37 * result + (getMethodName() == null ? 0 : this.getMethodName().hashCode());
		return result;
	}

}
