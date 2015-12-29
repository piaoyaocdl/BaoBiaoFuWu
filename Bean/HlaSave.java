package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * HlaSave generated by hbm2java
 */
public class HlaSave implements java.io.Serializable
{

	private int id;
	private Date operDate;
	private char operType;
	private Character rcsId;
	private String boardNo;
	private String operName;
	private String checkName;
	private Date checkDate;
	private String remark;
	private Date recordTime;
	private String recordName;

	public HlaSave()
	{
	}

	public HlaSave(int id, Date operDate, char operType, String boardNo, String operName)
	{
		this.id = id;
		this.operDate = operDate;
		this.operType = operType;
		this.boardNo = boardNo;
		this.operName = operName;
	}

	public HlaSave(int id, Date operDate, char operType, Character rcsId, String boardNo, String operName,
			String checkName, Date checkDate, String remark, Date recordTime, String recordName)
	{
		this.id = id;
		this.operDate = operDate;
		this.operType = operType;
		this.rcsId = rcsId;
		this.boardNo = boardNo;
		this.operName = operName;
		this.checkName = checkName;
		this.checkDate = checkDate;
		this.remark = remark;
		this.recordTime = recordTime;
		this.recordName = recordName;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Date getOperDate()
	{
		return this.operDate;
	}

	public void setOperDate(Date operDate)
	{
		this.operDate = operDate;
	}

	public char getOperType()
	{
		return this.operType;
	}

	public void setOperType(char operType)
	{
		this.operType = operType;
	}

	public Character getRcsId()
	{
		return this.rcsId;
	}

	public void setRcsId(Character rcsId)
	{
		this.rcsId = rcsId;
	}

	public String getBoardNo()
	{
		return this.boardNo;
	}

	public void setBoardNo(String boardNo)
	{
		this.boardNo = boardNo;
	}

	public String getOperName()
	{
		return this.operName;
	}

	public void setOperName(String operName)
	{
		this.operName = operName;
	}

	public String getCheckName()
	{
		return this.checkName;
	}

	public void setCheckName(String checkName)
	{
		this.checkName = checkName;
	}

	public Date getCheckDate()
	{
		return this.checkDate;
	}

	public void setCheckDate(Date checkDate)
	{
		this.checkDate = checkDate;
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

}
