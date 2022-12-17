package kr.revfactory.metadatacrawler.service

import kr.revfactory.metadatacrawler.domain.WebInfo
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.springframework.stereotype.Service

@Service
class WebInfoService {
    fun getWebInfo(url: String): WebInfo {
        val doc: Document = Jsoup.connect(url).get()
        val title: String = doc.title()
        val imageUrl: String = doc.select("meta[property='og:image']").first()?.attr("content") ?: ""
        val description: String = doc.select("meta[name='description']").first()?.attr("content") ?: ""

        return WebInfo(title, imageUrl, description)
    }
}
