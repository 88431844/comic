
package fun.iotgo.comic.pageProcessor;

import fun.iotgo.comic.bean.ComicInfo;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

public class ComicProcessor implements PageProcessor {

  private Site site = Site.me().setRetryTimes(3).setSleepTime(100);

  @Override
  public void process(Page page) {
    page.addTargetRequests(page.getHtml().css("div.pager-content").links().all());
    ComicInfo comicInfo = new ComicInfo();
//    news.setAuthor(page.getHtml().xpath("//a[@class='article-author-name']/text()").toString());
//    news.setContent(
//        page.getHtml().xpath("//div[@class='article article-text']/@data-text").toString());
//    news.setTime(page.getHtml().xpath("//span[@class='article-date']/text()").toString());
//    page.putField("news", news);
    page.putField("comicInfo",comicInfo);
  }

  @Override
  public Site getSite() {
    return site;
  }
}