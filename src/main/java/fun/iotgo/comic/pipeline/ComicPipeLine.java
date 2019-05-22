
package fun.iotgo.comic.pipeline;

import com.alibaba.fastjson.JSON;
import fun.iotgo.comic.bean.ComicInfo;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

public class ComicPipeLine implements Pipeline {

  @Override
  public void process(ResultItems resultItems, Task task) {
    ComicInfo comicInfo = (ComicInfo) resultItems.get("comicInfo");
//    Dao.insert(news);//将数据插入数据库
    System.out.println("comicInfo : "+JSON.toJSONString(comicInfo));
  }

}
