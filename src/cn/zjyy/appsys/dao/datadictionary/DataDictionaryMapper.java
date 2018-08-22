package cn.zjyy.appsys.dao.datadictionary;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.zjyy.appsys.pojo.DataDictionary;
public interface DataDictionaryMapper {
	public List<DataDictionary> getDataDictionaryList(@Param("typeCode")String typeCode)throws Exception;
}
