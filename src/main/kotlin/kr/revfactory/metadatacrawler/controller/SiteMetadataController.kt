package kr.revfactory.metadatacrawler.controller

import kr.revfactory.metadatacrawler.service.SiteMetadataService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SiteMetadataController(private val siteMetadataService: SiteMetadataService) {

    @GetMapping("/site-metadata")
    fun getSiteMetadata(@RequestParam url: String): Map<String, String> {
        return siteMetadataService.getSiteMetadata(url)
    }
}
