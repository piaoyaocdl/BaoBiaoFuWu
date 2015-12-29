package riswell.model;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CheckBill generated by hbm2java
 */
public class CheckBill implements java.io.Serializable
{

	private int id;
	private String billNo;
	private String billKind;
	private Integer hospitalId;
	private String hospitalName;
	private String reqDoctor;
	private Date reqDate;
	private Date sendDate;
	private Date acceptDate;
	private String acceptMan;
	private Integer templateId;
	private String name;
	private Character sex;
	private String patientNo;
	private String age;
	private String hositalNo;
	private String bedNo;
	private String fatherName;
	private Integer fatherAge;
	private String montherName;
	private Integer montherAge;
	private String address;
	private String telphone;
	private String previousPregnancy;
	private String diagnose;
	private String shortDesc;
	private Integer weeks;
	private String abo;
	private Character rhd;
	private String rhdPhenotype;
	private Character antiglobulin;
	private Character accidentAntibody;
	private String others;
	private String husbandName;
	private String husbandAbo;
	private Character husbandRhd;
	private Integer plt;
	private Integer prePlt;
	private Date preDate;
	private Date planDate;
	private Integer planNum;
	private Character feeType;
	private Character itemAa;
	private Character itemAb;
	private Character itemRh;
	private Character itemAc;
	private Character itemAbo;
	private Character itemTrans;
	private Character itemCross;
	private Character itemPlCross;
	private Character itemPl;
	private Character itemOther;
	private Character status;
	private String effect;
	private char feeId;
	private String billName;
	private Character backReason;
	private Character backCheck;
	private String remark;
	private Date recordTime;
	private String recordName;
	private Character itemCoombs;
	private Character itemCool;
	private String itemCrossNum;
	private String motherAbo;
	private String fatherAbo;
	private String itemOtherTxt;
	private String reportNo;
	private String getReportTime;
	private String invoiceNo;
	private String invoiceType;
	private Set<CheckBillFee> checkBillFees = new HashSet<CheckBillFee>(0);
	private Set<ResDaTest> resDaTests = new HashSet<ResDaTest>(0);
	private Set<BillReport> billReports = new HashSet<BillReport>(0);
	private Set<CheckBillSample> checkBillSamples = new HashSet<CheckBillSample>(0);
	private Set<ResCrossMatch> resCrossMatches = new HashSet<ResCrossMatch>(0);
	private Set<ResBloodType> resBloodTypes = new HashSet<ResBloodType>(0);
	private Set<Sample> samples = new HashSet<Sample>(0);
	private Set<ResRedTest> resRedTests = new HashSet<ResRedTest>(0);
	private Set<ResBloodPl> resBloodPls = new HashSet<ResBloodPl>(0);
	private Set<ResCoombsTest> resCoombsTests = new HashSet<ResCoombsTest>(0);
	private Set<CheckBillRecPic> checkBillRecPics = new HashSet<CheckBillRecPic>(0);
	private Set<ReactionTableRecord> reactionTableRecords = new HashSet<ReactionTableRecord>(0);
	private Set<ResAbTiter> resAbTiters = new HashSet<ResAbTiter>(0);
	private Set<BillReagent> billReagents = new HashSet<BillReagent>(0);
	private Set<ResAccidentAb> resAccidentAbs = new HashSet<ResAccidentAb>(0);
	private Set<ResSerumTest> resSerumTests = new HashSet<ResSerumTest>(0);

	public CheckBill()
	{
	}

	public CheckBill(int id, String billNo, String billKind, String name, char feeId)
	{
		this.id = id;
		this.billNo = billNo;
		this.billKind = billKind;
		this.name = name;
		this.feeId = feeId;
	}

	public CheckBill(int id, String billNo, String billKind, Integer hospitalId, String hospitalName, String reqDoctor,
			Date reqDate, Date sendDate, Date acceptDate, String acceptMan, Integer templateId, String name,
			Character sex, String patientNo, String age, String hositalNo, String bedNo, String fatherName,
			Integer fatherAge, String montherName, Integer montherAge, String address, String telphone,
			String previousPregnancy, String diagnose, String shortDesc, Integer weeks, String abo, Character rhd,
			String rhdPhenotype, Character antiglobulin, Character accidentAntibody, String others, String husbandName,
			String husbandAbo, Character husbandRhd, Integer plt, Integer prePlt, Date preDate, Date planDate,
			Integer planNum, Character feeType, Character itemAa, Character itemAb, Character itemRh, Character itemAc,
			Character itemAbo, Character itemTrans, Character itemCross, Character itemPlCross, Character itemPl,
			Character itemOther, Character status, String effect, char feeId, String billName, Character backReason,
			Character backCheck, String remark, Date recordTime, String recordName, Character itemCoombs,
			Character itemCool, String itemCrossNum, String motherAbo, String fatherAbo, String itemOtherTxt,
			String reportNo, String getReportTime, String invoiceNo, String invoiceType,
			Set<CheckBillFee> checkBillFees, Set<ResDaTest> resDaTests, Set<BillReport> billReports,
			Set<CheckBillSample> checkBillSamples, Set<ResCrossMatch> resCrossMatches, Set<ResBloodType> resBloodTypes,
			Set<Sample> samples, Set<ResRedTest> resRedTests, Set<ResBloodPl> resBloodPls,
			Set<ResCoombsTest> resCoombsTests, Set<CheckBillRecPic> checkBillRecPics,
			Set<ReactionTableRecord> reactionTableRecords, Set<ResAbTiter> resAbTiters, Set<BillReagent> billReagents,
			Set<ResAccidentAb> resAccidentAbs, Set<ResSerumTest> resSerumTests)
	{
		this.id = id;
		this.billNo = billNo;
		this.billKind = billKind;
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.reqDoctor = reqDoctor;
		this.reqDate = reqDate;
		this.sendDate = sendDate;
		this.acceptDate = acceptDate;
		this.acceptMan = acceptMan;
		this.templateId = templateId;
		this.name = name;
		this.sex = sex;
		this.patientNo = patientNo;
		this.age = age;
		this.hositalNo = hositalNo;
		this.bedNo = bedNo;
		this.fatherName = fatherName;
		this.fatherAge = fatherAge;
		this.montherName = montherName;
		this.montherAge = montherAge;
		this.address = address;
		this.telphone = telphone;
		this.previousPregnancy = previousPregnancy;
		this.diagnose = diagnose;
		this.shortDesc = shortDesc;
		this.weeks = weeks;
		this.abo = abo;
		this.rhd = rhd;
		this.rhdPhenotype = rhdPhenotype;
		this.antiglobulin = antiglobulin;
		this.accidentAntibody = accidentAntibody;
		this.others = others;
		this.husbandName = husbandName;
		this.husbandAbo = husbandAbo;
		this.husbandRhd = husbandRhd;
		this.plt = plt;
		this.prePlt = prePlt;
		this.preDate = preDate;
		this.planDate = planDate;
		this.planNum = planNum;
		this.feeType = feeType;
		this.itemAa = itemAa;
		this.itemAb = itemAb;
		this.itemRh = itemRh;
		this.itemAc = itemAc;
		this.itemAbo = itemAbo;
		this.itemTrans = itemTrans;
		this.itemCross = itemCross;
		this.itemPlCross = itemPlCross;
		this.itemPl = itemPl;
		this.itemOther = itemOther;
		this.status = status;
		this.effect = effect;
		this.feeId = feeId;
		this.billName = billName;
		this.backReason = backReason;
		this.backCheck = backCheck;
		this.remark = remark;
		this.recordTime = recordTime;
		this.recordName = recordName;
		this.itemCoombs = itemCoombs;
		this.itemCool = itemCool;
		this.itemCrossNum = itemCrossNum;
		this.motherAbo = motherAbo;
		this.fatherAbo = fatherAbo;
		this.itemOtherTxt = itemOtherTxt;
		this.reportNo = reportNo;
		this.getReportTime = getReportTime;
		this.invoiceNo = invoiceNo;
		this.invoiceType = invoiceType;
		this.checkBillFees = checkBillFees;
		this.resDaTests = resDaTests;
		this.billReports = billReports;
		this.checkBillSamples = checkBillSamples;
		this.resCrossMatches = resCrossMatches;
		this.resBloodTypes = resBloodTypes;
		this.samples = samples;
		this.resRedTests = resRedTests;
		this.resBloodPls = resBloodPls;
		this.resCoombsTests = resCoombsTests;
		this.checkBillRecPics = checkBillRecPics;
		this.reactionTableRecords = reactionTableRecords;
		this.resAbTiters = resAbTiters;
		this.billReagents = billReagents;
		this.resAccidentAbs = resAccidentAbs;
		this.resSerumTests = resSerumTests;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getBillNo()
	{
		return this.billNo;
	}

	public void setBillNo(String billNo)
	{
		this.billNo = billNo;
	}

	public String getBillKind()
	{
		return this.billKind;
	}

	public void setBillKind(String billKind)
	{
		this.billKind = billKind;
	}

	public Integer getHospitalId()
	{
		return this.hospitalId;
	}

	public void setHospitalId(Integer hospitalId)
	{
		this.hospitalId = hospitalId;
	}

	public String getHospitalName()
	{
		return this.hospitalName;
	}

	public void setHospitalName(String hospitalName)
	{
		this.hospitalName = hospitalName;
	}

	public String getReqDoctor()
	{
		return this.reqDoctor;
	}

	public void setReqDoctor(String reqDoctor)
	{
		this.reqDoctor = reqDoctor;
	}

	public Date getReqDate()
	{
		return this.reqDate;
	}

	public void setReqDate(Date reqDate)
	{
		this.reqDate = reqDate;
	}

	public Date getSendDate()
	{
		return this.sendDate;
	}

	public void setSendDate(Date sendDate)
	{
		this.sendDate = sendDate;
	}

	public Date getAcceptDate()
	{
		return this.acceptDate;
	}

	public void setAcceptDate(Date acceptDate)
	{
		this.acceptDate = acceptDate;
	}

	public String getAcceptMan()
	{
		return this.acceptMan;
	}

	public void setAcceptMan(String acceptMan)
	{
		this.acceptMan = acceptMan;
	}

	public Integer getTemplateId()
	{
		return this.templateId;
	}

	public void setTemplateId(Integer templateId)
	{
		this.templateId = templateId;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Character getSex()
	{
		return this.sex;
	}

	public void setSex(Character sex)
	{
		this.sex = sex;
	}

	public String getPatientNo()
	{
		return this.patientNo;
	}

	public void setPatientNo(String patientNo)
	{
		this.patientNo = patientNo;
	}

	public String getAge()
	{
		return this.age;
	}

	public void setAge(String age)
	{
		this.age = age;
	}

	public String getHositalNo()
	{
		return this.hositalNo;
	}

	public void setHositalNo(String hositalNo)
	{
		this.hositalNo = hositalNo;
	}

	public String getBedNo()
	{
		return this.bedNo;
	}

	public void setBedNo(String bedNo)
	{
		this.bedNo = bedNo;
	}

	public String getFatherName()
	{
		return this.fatherName;
	}

	public void setFatherName(String fatherName)
	{
		this.fatherName = fatherName;
	}

	public Integer getFatherAge()
	{
		return this.fatherAge;
	}

	public void setFatherAge(Integer fatherAge)
	{
		this.fatherAge = fatherAge;
	}

	public String getMontherName()
	{
		return this.montherName;
	}

	public void setMontherName(String montherName)
	{
		this.montherName = montherName;
	}

	public Integer getMontherAge()
	{
		return this.montherAge;
	}

	public void setMontherAge(Integer montherAge)
	{
		this.montherAge = montherAge;
	}

	public String getAddress()
	{
		return this.address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getTelphone()
	{
		return this.telphone;
	}

	public void setTelphone(String telphone)
	{
		this.telphone = telphone;
	}

	public String getPreviousPregnancy()
	{
		return this.previousPregnancy;
	}

	public void setPreviousPregnancy(String previousPregnancy)
	{
		this.previousPregnancy = previousPregnancy;
	}

	public String getDiagnose()
	{
		return this.diagnose;
	}

	public void setDiagnose(String diagnose)
	{
		this.diagnose = diagnose;
	}

	public String getShortDesc()
	{
		return this.shortDesc;
	}

	public void setShortDesc(String shortDesc)
	{
		this.shortDesc = shortDesc;
	}

	public Integer getWeeks()
	{
		return this.weeks;
	}

	public void setWeeks(Integer weeks)
	{
		this.weeks = weeks;
	}

	public String getAbo()
	{
		return this.abo;
	}

	public void setAbo(String abo)
	{
		this.abo = abo;
	}

	public Character getRhd()
	{
		return this.rhd;
	}

	public void setRhd(Character rhd)
	{
		this.rhd = rhd;
	}

	public String getRhdPhenotype()
	{
		return this.rhdPhenotype;
	}

	public void setRhdPhenotype(String rhdPhenotype)
	{
		this.rhdPhenotype = rhdPhenotype;
	}

	public Character getAntiglobulin()
	{
		return this.antiglobulin;
	}

	public void setAntiglobulin(Character antiglobulin)
	{
		this.antiglobulin = antiglobulin;
	}

	public Character getAccidentAntibody()
	{
		return this.accidentAntibody;
	}

	public void setAccidentAntibody(Character accidentAntibody)
	{
		this.accidentAntibody = accidentAntibody;
	}

	public String getOthers()
	{
		return this.others;
	}

	public void setOthers(String others)
	{
		this.others = others;
	}

	public String getHusbandName()
	{
		return this.husbandName;
	}

	public void setHusbandName(String husbandName)
	{
		this.husbandName = husbandName;
	}

	public String getHusbandAbo()
	{
		return this.husbandAbo;
	}

	public void setHusbandAbo(String husbandAbo)
	{
		this.husbandAbo = husbandAbo;
	}

	public Character getHusbandRhd()
	{
		return this.husbandRhd;
	}

	public void setHusbandRhd(Character husbandRhd)
	{
		this.husbandRhd = husbandRhd;
	}

	public Integer getPlt()
	{
		return this.plt;
	}

	public void setPlt(Integer plt)
	{
		this.plt = plt;
	}

	public Integer getPrePlt()
	{
		return this.prePlt;
	}

	public void setPrePlt(Integer prePlt)
	{
		this.prePlt = prePlt;
	}

	public Date getPreDate()
	{
		return this.preDate;
	}

	public void setPreDate(Date preDate)
	{
		this.preDate = preDate;
	}

	public Date getPlanDate()
	{
		return this.planDate;
	}

	public void setPlanDate(Date planDate)
	{
		this.planDate = planDate;
	}

	public Integer getPlanNum()
	{
		return this.planNum;
	}

	public void setPlanNum(Integer planNum)
	{
		this.planNum = planNum;
	}

	public Character getFeeType()
	{
		return this.feeType;
	}

	public void setFeeType(Character feeType)
	{
		this.feeType = feeType;
	}

	public Character getItemAa()
	{
		return this.itemAa;
	}

	public void setItemAa(Character itemAa)
	{
		this.itemAa = itemAa;
	}

	public Character getItemAb()
	{
		return this.itemAb;
	}

	public void setItemAb(Character itemAb)
	{
		this.itemAb = itemAb;
	}

	public Character getItemRh()
	{
		return this.itemRh;
	}

	public void setItemRh(Character itemRh)
	{
		this.itemRh = itemRh;
	}

	public Character getItemAc()
	{
		return this.itemAc;
	}

	public void setItemAc(Character itemAc)
	{
		this.itemAc = itemAc;
	}

	public Character getItemAbo()
	{
		return this.itemAbo;
	}

	public void setItemAbo(Character itemAbo)
	{
		this.itemAbo = itemAbo;
	}

	public Character getItemTrans()
	{
		return this.itemTrans;
	}

	public void setItemTrans(Character itemTrans)
	{
		this.itemTrans = itemTrans;
	}

	public Character getItemCross()
	{
		return this.itemCross;
	}

	public void setItemCross(Character itemCross)
	{
		this.itemCross = itemCross;
	}

	public Character getItemPlCross()
	{
		return this.itemPlCross;
	}

	public void setItemPlCross(Character itemPlCross)
	{
		this.itemPlCross = itemPlCross;
	}

	public Character getItemPl()
	{
		return this.itemPl;
	}

	public void setItemPl(Character itemPl)
	{
		this.itemPl = itemPl;
	}

	public Character getItemOther()
	{
		return this.itemOther;
	}

	public void setItemOther(Character itemOther)
	{
		this.itemOther = itemOther;
	}

	public Character getStatus()
	{
		return this.status;
	}

	public void setStatus(Character status)
	{
		this.status = status;
	}

	public String getEffect()
	{
		return this.effect;
	}

	public void setEffect(String effect)
	{
		this.effect = effect;
	}

	public char getFeeId()
	{
		return this.feeId;
	}

	public void setFeeId(char feeId)
	{
		this.feeId = feeId;
	}

	public String getBillName()
	{
		return this.billName;
	}

	public void setBillName(String billName)
	{
		this.billName = billName;
	}

	public Character getBackReason()
	{
		return this.backReason;
	}

	public void setBackReason(Character backReason)
	{
		this.backReason = backReason;
	}

	public Character getBackCheck()
	{
		return this.backCheck;
	}

	public void setBackCheck(Character backCheck)
	{
		this.backCheck = backCheck;
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

	public Character getItemCoombs()
	{
		return this.itemCoombs;
	}

	public void setItemCoombs(Character itemCoombs)
	{
		this.itemCoombs = itemCoombs;
	}

	public Character getItemCool()
	{
		return this.itemCool;
	}

	public void setItemCool(Character itemCool)
	{
		this.itemCool = itemCool;
	}

	public String getItemCrossNum()
	{
		return this.itemCrossNum;
	}

	public void setItemCrossNum(String itemCrossNum)
	{
		this.itemCrossNum = itemCrossNum;
	}

	public String getMotherAbo()
	{
		return this.motherAbo;
	}

	public void setMotherAbo(String motherAbo)
	{
		this.motherAbo = motherAbo;
	}

	public String getFatherAbo()
	{
		return this.fatherAbo;
	}

	public void setFatherAbo(String fatherAbo)
	{
		this.fatherAbo = fatherAbo;
	}

	public String getItemOtherTxt()
	{
		return this.itemOtherTxt;
	}

	public void setItemOtherTxt(String itemOtherTxt)
	{
		this.itemOtherTxt = itemOtherTxt;
	}

	public String getReportNo()
	{
		return this.reportNo;
	}

	public void setReportNo(String reportNo)
	{
		this.reportNo = reportNo;
	}

	public String getGetReportTime()
	{
		return this.getReportTime;
	}

	public void setGetReportTime(String getReportTime)
	{
		this.getReportTime = getReportTime;
	}

	public String getInvoiceNo()
	{
		return this.invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo)
	{
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceType()
	{
		return this.invoiceType;
	}

	public void setInvoiceType(String invoiceType)
	{
		this.invoiceType = invoiceType;
	}

	public Set<CheckBillFee> getCheckBillFees()
	{
		return this.checkBillFees;
	}

	public void setCheckBillFees(Set<CheckBillFee> checkBillFees)
	{
		this.checkBillFees = checkBillFees;
	}

	public Set<ResDaTest> getResDaTests()
	{
		return this.resDaTests;
	}

	public void setResDaTests(Set<ResDaTest> resDaTests)
	{
		this.resDaTests = resDaTests;
	}

	public Set<BillReport> getBillReports()
	{
		return this.billReports;
	}

	public void setBillReports(Set<BillReport> billReports)
	{
		this.billReports = billReports;
	}

	public Set<CheckBillSample> getCheckBillSamples()
	{
		return this.checkBillSamples;
	}

	public void setCheckBillSamples(Set<CheckBillSample> checkBillSamples)
	{
		this.checkBillSamples = checkBillSamples;
	}

	public Set<ResCrossMatch> getResCrossMatches()
	{
		return this.resCrossMatches;
	}

	public void setResCrossMatches(Set<ResCrossMatch> resCrossMatches)
	{
		this.resCrossMatches = resCrossMatches;
	}

	public Set<ResBloodType> getResBloodTypes()
	{
		return this.resBloodTypes;
	}

	public void setResBloodTypes(Set<ResBloodType> resBloodTypes)
	{
		this.resBloodTypes = resBloodTypes;
	}

	public Set<Sample> getSamples()
	{
		return this.samples;
	}

	public void setSamples(Set<Sample> samples)
	{
		this.samples = samples;
	}

	public Set<ResRedTest> getResRedTests()
	{
		return this.resRedTests;
	}

	public void setResRedTests(Set<ResRedTest> resRedTests)
	{
		this.resRedTests = resRedTests;
	}

	public Set<ResBloodPl> getResBloodPls()
	{
		return this.resBloodPls;
	}

	public void setResBloodPls(Set<ResBloodPl> resBloodPls)
	{
		this.resBloodPls = resBloodPls;
	}

	public Set<ResCoombsTest> getResCoombsTests()
	{
		return this.resCoombsTests;
	}

	public void setResCoombsTests(Set<ResCoombsTest> resCoombsTests)
	{
		this.resCoombsTests = resCoombsTests;
	}

	public Set<CheckBillRecPic> getCheckBillRecPics()
	{
		return this.checkBillRecPics;
	}

	public void setCheckBillRecPics(Set<CheckBillRecPic> checkBillRecPics)
	{
		this.checkBillRecPics = checkBillRecPics;
	}

	public Set<ReactionTableRecord> getReactionTableRecords()
	{
		return this.reactionTableRecords;
	}

	public void setReactionTableRecords(Set<ReactionTableRecord> reactionTableRecords)
	{
		this.reactionTableRecords = reactionTableRecords;
	}

	public Set<ResAbTiter> getResAbTiters()
	{
		return this.resAbTiters;
	}

	public void setResAbTiters(Set<ResAbTiter> resAbTiters)
	{
		this.resAbTiters = resAbTiters;
	}

	public Set<BillReagent> getBillReagents()
	{
		return this.billReagents;
	}

	public void setBillReagents(Set<BillReagent> billReagents)
	{
		this.billReagents = billReagents;
	}

	public Set<ResAccidentAb> getResAccidentAbs()
	{
		return this.resAccidentAbs;
	}

	public void setResAccidentAbs(Set<ResAccidentAb> resAccidentAbs)
	{
		this.resAccidentAbs = resAccidentAbs;
	}

	public Set<ResSerumTest> getResSerumTests()
	{
		return this.resSerumTests;
	}

	public void setResSerumTests(Set<ResSerumTest> resSerumTests)
	{
		this.resSerumTests = resSerumTests;
	}

}
