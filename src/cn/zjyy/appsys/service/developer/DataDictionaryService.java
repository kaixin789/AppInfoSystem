package cn.zjyy.appsys.service.developer;
import java.util.List;
import cn.zjyy.appsys.pojo.DataDictionary;
public interface DataDictionaryService {
	
	/**
	 * 根据typeCode查询相应的数据字典列表
	 * @param typeCode
	 * @return
	 * @throws Exception
	 */
	public List<DataDictionary> getDataDictionaryList(String typeCode)throws Exception;
}
