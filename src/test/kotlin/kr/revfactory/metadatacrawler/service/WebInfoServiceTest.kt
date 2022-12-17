package kr.revfactory.metadatacrawler.service

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import kr.revfactory.metadatacrawler.domain.WebInfo

class WebInfoServiceTest : StringSpec({

    val service = WebInfoService()

    "getWebInfo should return correct web info for example.com" {
        val url = "https://www.daum.net"
        val expected = WebInfo(
            "Daum",
            "https://i1.daumcdn.net/svc/image/U03/common_icon/5587C4E4012FCD0001",
            "이용자 선택권을 강화한 뉴스, 세상의 모든 정보를 연결하는 검색. Daum에서 나의 관심 콘텐츠를 즐겨보세요."
        )
        val actual = service.getWebInfo(url)
        actual shouldBe expected
    }

})
