package kr.revfactory.metadatacrawler.service

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.springframework.stereotype.Service

@Service
class SiteMetadataService {
    fun getSiteMetadata(url: String): Map<String, String> {
        val metadata = mutableMapOf<String, String>()

        // Use Jsoup to parse the HTML of the website
        val doc: Document = Jsoup.connect(url).get()

        // Get the title of the website
        val title = doc.title()
        metadata["title"] = title

        // Get the representative image of the website
        val images = doc.select("meta[property=og:image]")
        if (images.size > 0) {
            val imageUrl = images.first()?.attr("content") ?: ""
            metadata["image"] = imageUrl
        } else {
            // If there is no og:image tag, use the first image on the page
            val image = doc.select("img").first()
            if (image != null) {
                val imageUrl = image.absUrl("src")
                metadata["image"] = imageUrl
            }
        }

        // Get the description of the website
        val description = doc.select("meta[name=description]").first()?.attr("content")
        if (description != null) {
            metadata["description"] = description
        }

        return metadata
    }
}
