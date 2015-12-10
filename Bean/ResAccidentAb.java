package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * ResAccidentAb generated by hbm2java
 */
public class ResAccidentAb implements java.io.Serializable
{

	private int id;
	private CheckBill checkBill;
	private String name;
	private String method;
	private String rsYs2;
	private String rsYs3;
	private String rsYs4;
	private String rsYs5;
	private String rsNj1;
	private String rsNj2;
	private String rsNj3;
	private String rsNj4;
	private String rsNj5;
	private String rsLiss1;
	private String rsLiss2;
	private String rsLiss3;
	private String rsYs1;
	private String remark;
	private String recordName;
	private Date recordTime;

	public ResAccidentAb()
	{
	}

	public ResAccidentAb(int id, CheckBill checkBill, String name, String rsYs1)
	{
		this.id = id;
		this.checkBill = checkBill;
		this.name = name;
		this.rsYs1 = rsYs1;
	}

	public ResAccidentAb(int id, CheckBill checkBill, String name, String method, String rsYs2, String rsYs3,
			String rsYs4, String rsYs5, String rsNj1, String rsNj2, String rsNj3, String rsNj4, String rsNj5,
			String rsLiss1, String rsLiss2, String rsLiss3, String rsYs1, String remark, String recordName,
			Date recordTime)
	{
		this.id = id;
		this.checkBill = checkBill;
		this.name = name;
		this.method = method;
		this.rsYs2 = rsYs2;
		this.rsYs3 = rsYs3;
		this.rsYs4 = rsYs4;
		this.rsYs5 = rsYs5;
		this.rsNj1 = rsNj1;
		this.rsNj2 = rsNj2;
		this.rsNj3 = rsNj3;
		this.rsNj4 = rsNj4;
		this.rsNj5 = rsNj5;
		this.rsLiss1 = rsLiss1;
		this.rsLiss2 = rsLiss2;
		this.rsLiss3 = rsLiss3;
		this.rsYs1 = rsYs1;
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

	public String getRsYs2()
	{
		return this.rsYs2;
	}

	public void setRsYs2(String rsYs2)
	{
		this.rsYs2 = rsYs2;
	}

	public String getRsYs3()
	{
		return this.rsYs3;
	}

	public void setRsYs3(String rsYs3)
	{
		this.rsYs3 = rsYs3;
	}

	public String getRsYs4()
	{
		return this.rsYs4;
	}

	public void setRsYs4(String rsYs4)
	{
		this.rsYs4 = rsYs4;
	}

	public String getRsYs5()
	{
		return this.rsYs5;
	}

	public void setRsYs5(String rsYs5)
	{
		this.rsYs5 = rsYs5;
	}

	public String getRsNj1()
	{
		return this.rsNj1;
	}

	public void setRsNj1(String rsNj1)
	{
		this.rsNj1 = rsNj1;
	}

	public String getRsNj2()
	{
		return this.rsNj2;
	}

	public void setRsNj2(String rsNj2)
	{
		this.rsNj2 = rsNj2;
	}

	public String getRsNj3()
	{
		return this.rsNj3;
	}

	public void setRsNj3(String rsNj3)
	{
		this.rsNj3 = rsNj3;
	}

	public String getRsNj4()
	{
		return this.rsNj4;
	}

	public void setRsNj4(String rsNj4)
	{
		this.rsNj4 = rsNj4;
	}

	public String getRsNj5()
	{
		return this.rsNj5;
	}

	public void setRsNj5(String rsNj5)
	{
		this.rsNj5 = rsNj5;
	}

	public String getRsLiss1()
	{
		return this.rsLiss1;
	}

	public void setRsLiss1(String rsLiss1)
	{
		this.rsLiss1 = rsLiss1;
	}

	public String getRsLiss2()
	{
		return this.rsLiss2;
	}

	public void setRsLiss2(String rsLiss2)
	{
		this.rsLiss2 = rsLiss2;
	}

	public String getRsLiss3()
	{
		return this.rsLiss3;
	}

	public void setRsLiss3(String rsLiss3)
	{
		this.rsLiss3 = rsLiss3;
	}

	public String getRsYs1()
	{
		return this.rsYs1;
	}

	public void setRsYs1(String rsYs1)
	{
		this.rsYs1 = rsYs1;
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
