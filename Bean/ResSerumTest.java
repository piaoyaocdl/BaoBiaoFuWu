package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * ResSerumTest generated by hbm2java
 */
public class ResSerumTest implements java.io.Serializable
{

	private int id;
	private CheckBill checkBill;
	private String abName;
	private String result1;
	private String result2;
	private String result3;
	private String result4;
	private String result5;
	private String result6;
	private String result7;
	private String remark;
	private String recordName;
	private Date recordTime;

	public ResSerumTest()
	{
	}

	public ResSerumTest(int id, CheckBill checkBill)
	{
		this.id = id;
		this.checkBill = checkBill;
	}

	public ResSerumTest(int id, CheckBill checkBill, String abName, String result1, String result2, String result3,
			String result4, String result5, String result6, String result7, String remark, String recordName,
			Date recordTime)
	{
		this.id = id;
		this.checkBill = checkBill;
		this.abName = abName;
		this.result1 = result1;
		this.result2 = result2;
		this.result3 = result3;
		this.result4 = result4;
		this.result5 = result5;
		this.result6 = result6;
		this.result7 = result7;
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

	public String getResult1()
	{
		return this.result1;
	}

	public void setResult1(String result1)
	{
		this.result1 = result1;
	}

	public String getResult2()
	{
		return this.result2;
	}

	public void setResult2(String result2)
	{
		this.result2 = result2;
	}

	public String getResult3()
	{
		return this.result3;
	}

	public void setResult3(String result3)
	{
		this.result3 = result3;
	}

	public String getResult4()
	{
		return this.result4;
	}

	public void setResult4(String result4)
	{
		this.result4 = result4;
	}

	public String getResult5()
	{
		return this.result5;
	}

	public void setResult5(String result5)
	{
		this.result5 = result5;
	}

	public String getResult6()
	{
		return this.result6;
	}

	public void setResult6(String result6)
	{
		this.result6 = result6;
	}

	public String getResult7()
	{
		return this.result7;
	}

	public void setResult7(String result7)
	{
		this.result7 = result7;
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
