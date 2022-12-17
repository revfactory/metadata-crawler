package kr.revfactory.metadatacrawler.service

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import kr.revfactory.metadatacrawler.domain.WebInfo
import kr.revfactory.metadatacrawler.repository.WebInfoRepository

class WebInfoServiceTest : StringSpec({

    val mockRepository = mockk<WebInfoRepository>()
    val service = WebInfoService(mockRepository)

    "getWebInfo should return correct web info for example.com" {
        val url = "https://www.daum.net"
        val expected = WebInfo(
            url = "https://www.daum.net",
            title = "Daum",
            imageUrl = "https://i1.daumcdn.net/svc/image/U03/common_icon/5587C4E4012FCD0001",
            description = "이용자 선택권을 강화한 뉴스, 세상의 모든 정보를 연결하는 검색. Daum에서 나의 관심 콘텐츠를 즐겨보세요."
        )
        every { mockRepository.save(any()) } returns expected
        val actual = service.getWebInfo(url)
        actual shouldBe expected
    }

})
