package riswell.modular.zuzhipeixing.linchuanghla.ctrl;

import java.io.IOException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import riswell.util.BaoBiaoGongJu;
import riswell.util.BaoBiaoGongJu.TiHuanType;
import riswell.util.GongJu;

@Controller
@RequestMapping("/zuzhipeixing/linchuanghla")
public class JianCeShenQingDanCtrl
{

	
	
	/**
	 * 下载报表
	 * 
	 * @param json
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/xiazaibaobiao")
	@ResponseBody
	public ResponseEntity<byte[]> xiazaibaobiao(String json) throws IOException
	{
	

		Document doc = BaoBiaoGongJu.getDocument("shiyan.xml");
		Element root = doc.getRootElement();
		Element ele = BaoBiaoGongJu.getElement(root, "tihuan", TiHuanType.ID);
		Element pa = ele.getParent();

		
			
			Element e;
			Element cl = (Element) ele.clone();
			String pt;

			e = BaoBiaoGongJu.getElement(cl, "aaaa", TiHuanType.TEXT);
			
			e.setText("");

			e = BaoBiaoGongJu.getElement(cl, "bbbb", TiHuanType.TEXT);
			
			e.setText("");

			e = BaoBiaoGongJu.getElement(cl, "cccc", TiHuanType.TEXT);
			
			e.setText("");

			pa.add(cl);

		
		pa.remove(ele);
		String wjm = Double.toString(Math.random()).substring(2) + Long.toString(System.currentTimeMillis()) + ".doc";
		BaoBiaoGongJu.xieXML(GongJu.getXiangMuLuJing() + "临时文件/" + wjm, doc);

		ResponseEntity<byte[]> ls = GongJu.xiazai(wjm, "临时文件", "");
		return ls;
	}
}
