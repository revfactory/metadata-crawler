package kr.revfactory.metadatacrawler.controller

import kr.revfactory.metadatacrawler.domain.WebInfo
import kr.revfactory.metadatacrawler.service.WebInfoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class WebInfoController(private val webInfoService: WebInfoService) {

    @GetMapping("/webinfo")
    fun getWebInfo(@RequestParam url: String): WebInfo {
        return webInfoService.getWebInfo(url)
    }
}
