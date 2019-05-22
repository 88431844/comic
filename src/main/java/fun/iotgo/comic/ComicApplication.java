package fun.iotgo.comic;

import static fun.iotgo.comic.util.Const.THREAD;
import static sun.plugin.javascript.navig.JSType.URL;

import fun.iotgo.comic.pageProcessor.ComicProcessor;
import fun.iotgo.comic.pipeline.ComicPipeLine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import us.codecraft.webmagic.Spider;

@SpringBootApplication
public class ComicApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComicApplication.class, args);

		Spider.create(new ComicProcessor())
				// 从"http://baozoumanhua.com/text"开始抓
				.addUrl(URL).addPipeline(new ComicPipeLine())
				// 开启5个线程抓取
				.thread(THREAD)
				// 启动爬虫
				.run();
	}

}
