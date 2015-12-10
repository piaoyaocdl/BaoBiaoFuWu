package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

/**
 * VAbtId generated by hbm2java
 */
public class VAbtId implements java.io.Serializable
{

	private int id;
	private int billId;
	private String abType;
	private String name;
	private String method;
	private String methodName;
	private String result16;
	private String result32;
	private String result64;
	private String result128;
	private String result256;
	private String result512;
	private String result1024;

	public VAbtId()
	{
	}

	public VAbtId(int id, int billId, String abType)
	{
		this.id = id;
		this.billId = billId;
		this.abType = abType;
	}

	public VAbtId(int id, int billId, String abType, String name, String method, String methodName, String result16,
			String result32, String result64, String result128, String result256, String result512, String result1024)
	{
		this.id = id;
		this.billId = billId;
		this.abType = abType;
		this.name = name;
		this.method = method;
		this.methodName = methodName;
		this.result16 = result16;
		this.result32 = result32;
		this.result64 = result64;
		this.result128 = result128;
		this.result256 = result256;
		this.result512 = result512;
		this.result1024 = result1024;
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

	public String getAbType()
	{
		return this.abType;
	}

	public void setAbType(String abType)
	{
		this.abType = abType;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
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

	public String getResult16()
	{
		return this.result16;
	}

	public void setResult16(String result16)
	{
		this.result16 = result16;
	}

	public String getResult32()
	{
		return this.result32;
	}

	public void setResult32(String result32)
	{
		this.result32 = result32;
	}

	public String getResult64()
	{
		return this.result64;
	}

	public void setResult64(String result64)
	{
		this.result64 = result64;
	}

	public String getResult128()
	{
		return this.result128;
	}

	public void setResult128(String result128)
	{
		this.result128 = result128;
	}

	public String getResult256()
	{
		return this.result256;
	}

	public void setResult256(String result256)
	{
		this.result256 = result256;
	}

	public String getResult512()
	{
		return this.result512;
	}

	public void setResult512(String result512)
	{
		this.result512 = result512;
	}

	public String getResult1024()
	{
		return this.result1024;
	}

	public void setResult1024(String result1024)
	{
		this.result1024 = result1024;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VAbtId))
			return false;
		VAbtId castOther = (VAbtId) other;

		return (this.getId() == castOther.getId()) && (this.getBillId() == castOther.getBillId())
				&& ((this.getAbType() == castOther.getAbType()) || (this.getAbType() != null
						&& castOther.getAbType() != null && this.getAbType().equals(castOther.getAbType())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getMethod() == castOther.getMethod()) || (this.getMethod() != null
						&& castOther.getMethod() != null && this.getMethod().equals(castOther.getMethod())))
				&& ((this.getMethodName() == castOther.getMethodName()) || (this.getMethodName() != null
						&& castOther.getMethodName() != null && this.getMethodName().equals(castOther.getMethodName())))
				&& ((this.getResult16() == castOther.getResult16()) || (this.getResult16() != null
						&& castOther.getResult16() != null && this.getResult16().equals(castOther.getResult16())))
				&& ((this.getResult32() == castOther.getResult32()) || (this.getResult32() != null
						&& castOther.getResult32() != null && this.getResult32().equals(castOther.getResult32())))
				&& ((this.getResult64() == castOther.getResult64()) || (this.getResult64() != null
						&& castOther.getResult64() != null && this.getResult64().equals(castOther.getResult64())))
				&& ((this.getResult128() == castOther.getResult128()) || (this.getResult128() != null
						&& castOther.getResult128() != null && this.getResult128().equals(castOther.getResult128())))
				&& ((this.getResult256() == castOther.getResult256()) || (this.getResult256() != null
						&& castOther.getResult256() != null && this.getResult256().equals(castOther.getResult256())))
				&& ((this.getResult512() == castOther.getResult512()) || (this.getResult512() != null
						&& castOther.getResult512() != null && this.getResult512().equals(castOther.getResult512())))
				&& ((this.getResult1024() == castOther.getResult1024())
						|| (this.getResult1024() != null && castOther.getResult1024() != null
								&& this.getResult1024().equals(castOther.getResult1024())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + this.getBillId();
		result = 37 * result + (getAbType() == null ? 0 : this.getAbType().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getMethod() == null ? 0 : this.getMethod().hashCode());
		result = 37 * result + (getMethodName() == null ? 0 : this.getMethodName().hashCode());
		result = 37 * result + (getResult16() == null ? 0 : this.getResult16().hashCode());
		result = 37 * result + (getResult32() == null ? 0 : this.getResult32().hashCode());
		result = 37 * result + (getResult64() == null ? 0 : this.getResult64().hashCode());
		result = 37 * result + (getResult128() == null ? 0 : this.getResult128().hashCode());
		result = 37 * result + (getResult256() == null ? 0 : this.getResult256().hashCode());
		result = 37 * result + (getResult512() == null ? 0 : this.getResult512().hashCode());
		result = 37 * result + (getResult1024() == null ? 0 : this.getResult1024().hashCode());
		return result;
	}

}
