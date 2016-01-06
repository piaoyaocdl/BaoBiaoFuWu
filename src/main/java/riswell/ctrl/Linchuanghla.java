package riswell.ctrl;

import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import riswell.dao.MatchBillDao;
import riswell.model.MatchBill;
import riswell.util.BaoBiaoGongJu;
import riswell.util.BaoBiaoGongJu.TiHuanType;
import riswell.util.GongJu;


@Controller
@RequestMapping("/linchuanghla")
public class Linchuanghla
{
	@Autowired
	MatchBillDao matchbilldao;
	
	
	@RequestMapping("/jianceshenqingdan/dayinshouyangbiao")
	@ResponseBody
	public ResponseEntity<byte[]>  dayinshoyangbiao(String jiancexiangmu,String[] jiancedanbianhao) throws IOException
	{
		System.out.println("1111111111111111111111");
		Document doc = null;
		
			// 获取模板
			doc = BaoBiaoGongJu.getDocument("LinchuangHLA-Jiancexinxidan-Shouyangbiao.xml");
			Element root = doc.getRootElement();
			// 获取数据

	MatchBill bill= matchbilldao.findOne(Integer.parseInt( jiancedanbianhao[0]));

			
			
			
			
			Element ele1 = BaoBiaoGongJu.getElement(root, "yangbenbianhao", TiHuanType.TEXT);
			ele1.setText(bill.getBillName());


		

		String wjm = Double.toString(Math.random()).substring(2) + Long.toString(System.currentTimeMillis()) + ".doc";
		
		
		
		BaoBiaoGongJu.xieXML(GongJu.getXiangMuLuJing() + "临时文件/" + wjm, doc);

		ResponseEntity<byte[]> ls = GongJu.xiazai(wjm, "临时文件", "临床HLA-实验分析-模板5.doc");
		return ls;
	}
	
	
	
	
	@RequestMapping("/shiyanjieguofenxi")
	@ResponseBody
	public ResponseEntity<byte[]> repo1(int id, int mobanhao) throws IOException
	{
		Document doc = null;
		if (mobanhao == 5)
		{
			// 获取模板
			doc = BaoBiaoGongJu.getDocument("linchuanghla-shiyanjieguofenxin-moban5.xml");
			Element root = doc.getRootElement();
			// 获取数据

			MatchBill bill= matchbilldao.findOne(id);
			
			
			
			Element ele1 = BaoBiaoGongJu.getElement(root, "yuanshibianhao", TiHuanType.ID);
			ele1.setText("1111");

			Element ele2 = BaoBiaoGongJu.getElement(root, "huanzhexingming", TiHuanType.ID);
			ele2.setText(bill.getName());

			Element ele3 = BaoBiaoGongJu.getElement(root, "xingbie", TiHuanType.ID);
			if (bill.getSex()=='1')
			{
				ele3.setText("男");
			}else if (bill.getSex()=='2') {
				ele3.setText("女");
			}else {
				ele3.setText("未知");
			}
			

			Element ele4 = BaoBiaoGongJu.getElement(root, "chushengriqi", TiHuanType.ID);
			ele4.setText("4444");
			Element ele5 = BaoBiaoGongJu.getElement(root, "yangbenbianhao", TiHuanType.ID);
			ele5.setText("5555");
			Element ele6 = BaoBiaoGongJu.getElement(root, "yizhiyiyuan", TiHuanType.ID);
			ele6.setText("6666");
			Element ele7 = BaoBiaoGongJu.getElement(root, "yangbenleiyuan", TiHuanType.ID);
			ele7.setText("7777");

		}

		String wjm = Double.toString(Math.random()).substring(2) + Long.toString(System.currentTimeMillis()) + ".doc";
		BaoBiaoGongJu.xieXML(GongJu.getXiangMuLuJing() + "临时文件/" + wjm, doc);

		ResponseEntity<byte[]> ls = GongJu.xiazai(wjm, "临时文件", "临床HLA-实验分析-模板5.doc");
		return ls;
	}
}
