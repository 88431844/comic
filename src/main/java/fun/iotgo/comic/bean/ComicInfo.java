
package fun.iotgo.comic.bean;
import lombok.Data;
@Data
public class ComicInfo {

  /**
   * 漫画标题
   */
  private String title;
  /**
   * 第几话
   */
  private String chapter;
  /**
   * 第几页
   */
  private String pageSum;
  /**
   * 图片地址
   */
  private String img;

}