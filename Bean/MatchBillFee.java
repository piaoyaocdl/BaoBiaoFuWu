package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * MatchBillFee generated by hbm2java
 */
public class MatchBillFee implements java.io.Serializable
{

	private int id;
	private Integer billId;
	private String sampleNo;
	private Character checkItem;
	private String point;
	private String name;
	private String itemCode;
	private Integer nums;
	private BigDecimal price;
	private String remark;
	private Date recordTime;
	private String recordName;
	private Integer sampleId;

	public MatchBillFee()
	{
	}

	public MatchBillFee(int id)
	{
		this.id = id;
	}

	public MatchBillFee(int id, Integer billId, String sampleNo, Character checkItem, String point, String name,
			String itemCode, Integer nums, BigDecimal price, String remark, Date recordTime, String recordName,
			Integer sampleId)
	{
		this.id = id;
		this.billId = billId;
		this.sampleNo = sampleNo;
		this.checkItem = checkItem;
		this.point = point;
		this.name = name;
		this.itemCode = itemCode;
		this.nums = nums;
		this.price = price;
		this.remark = remark;
		this.recordTime = recordTime;
		this.recordName = recordName;
		this.sampleId = sampleId;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Integer getBillId()
	{
		return this.billId;
	}

	public void setBillId(Integer billId)
	{
		this.billId = billId;
	}

	public String getSampleNo()
	{
		return this.sampleNo;
	}

	public void setSampleNo(String sampleNo)
	{
		this.sampleNo = sampleNo;
	}

	public Character getCheckItem()
	{
		return this.checkItem;
	}

	public void setCheckItem(Character checkItem)
	{
		this.checkItem = checkItem;
	}

	public String getPoint()
	{
		return this.point;
	}

	public void setPoint(String point)
	{
		this.point = point;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getItemCode()
	{
		return this.itemCode;
	}

	public void setItemCode(String itemCode)
	{
		this.itemCode = itemCode;
	}

	public Integer getNums()
	{
		return this.nums;
	}

	public void setNums(Integer nums)
	{
		this.nums = nums;
	}

	public BigDecimal getPrice()
	{
		return this.price;
	}

	public void setPrice(BigDecimal price)
	{
		this.price = price;
	}

	public String getRemark()
	{
		return this.remark;
	}

	public void setRemark(String remark)
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

	public Integer getSampleId()
	{
		return this.sampleId;
	}

	public void setSampleId(Integer sampleId)
	{
		this.sampleId = sampleId;
	}

}
