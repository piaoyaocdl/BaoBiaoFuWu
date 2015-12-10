package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * ReactionProg generated by hbm2java
 */
public class ReactionProg implements java.io.Serializable
{

	private int id;
	private String code;
	private String name;
	private String content;
	private String remark;
	private String recordName;
	private Date recordTime;

	public ReactionProg()
	{
	}

	public ReactionProg(int id, String code)
	{
		this.id = id;
		this.code = code;
	}

	public ReactionProg(int id, String code, String name, String content, String remark, String recordName,
			Date recordTime)
	{
		this.id = id;
		this.code = code;
		this.name = name;
		this.content = content;
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

	public String getContent()
	{
		return this.content;
	}

	public void setContent(String content)
	{
		this.content = content;
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
