package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * FeeItem generated by hbm2java
 */
public class FeeItem implements java.io.Serializable
{

	private int id;
	private String code;
	private String name;
	private String unit;
	private BigDecimal price;
	private String zjf;
	private String remark;
	private String recordName;
	private Date recordTime;
	private Character labId;

	public FeeItem()
	{
	}

	public FeeItem(int id, String code, String name, String unit, BigDecimal price)
	{
		this.id = id;
		this.code = code;
		this.name = name;
		this.unit = unit;
		this.price = price;
	}

	public FeeItem(int id, String code, String name, String unit, BigDecimal price, String zjf, String remark,
			String recordName, Date recordTime, Character labId)
	{
		this.id = id;
		this.code = code;
		this.name = name;
		this.unit = unit;
		this.price = price;
		this.zjf = zjf;
		this.remark = remark;
		this.recordName = recordName;
		this.recordTime = recordTime;
		this.labId = labId;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getCode()
	{
		return this.code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getUnit()
	{
		return this.unit;
	}

	public void setUnit(String unit)
	{
		this.unit = unit;
	}

	public BigDecimal getPrice()
	{
		return this.price;
	}

	public void setPrice(BigDecimal price)
	{
		this.price = price;
	}

	public String getZjf()
	{
		return this.zjf;
	}

	public void setZjf(String zjf)
	{
		this.zjf = zjf;
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

	public Character getLabId()
	{
		return this.labId;
	}

	public void setLabId(Character labId)
	{
		this.labId = labId;
	}

}
