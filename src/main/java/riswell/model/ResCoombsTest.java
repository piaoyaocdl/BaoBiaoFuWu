package riswell.model;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * ResCoombsTest generated by hbm2java
 */
public class ResCoombsTest implements java.io.Serializable
{

	private int id;
	private CheckBill checkBill;
	private String abName;
	private String result;
	private Character directId;
	private String remark;
	private String recordName;
	private Date recordTime;

	public ResCoombsTest()
	{
	}

	public ResCoombsTest(int id, CheckBill checkBill)
	{
		this.id = id;
		this.checkBill = checkBill;
	}

	public ResCoombsTest(int id, CheckBill checkBill, String abName, String result, Character directId, String remark,
			String recordName, Date recordTime)
	{
		this.id = id;
		this.checkBill = checkBill;
		this.abName = abName;
		this.result = result;
		this.directId = directId;
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

	public CheckBill getCheckBill()
	{
		return this.checkBill;
	}

	public void setCheckBill(CheckBill checkBill)
	{
		this.checkBill = checkBill;
	}

	public String getAbName()
	{
		return this.abName;
	}

	public void setAbName(String abName)
	{
		this.abName = abName;
	}

	public String getResult()
	{
		return this.result;
	}

	public void setResult(String result)
	{
		this.result = result;
	}

	public Character getDirectId()
	{
		return this.directId;
	}

	public void setDirectId(Character directId)
	{
		this.directId = directId;
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

}
