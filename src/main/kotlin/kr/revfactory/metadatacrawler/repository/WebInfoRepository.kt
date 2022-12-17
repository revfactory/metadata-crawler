package kr.revfactory.metadatacrawler.repository

import kr.revfactory.metadatacrawler.domain.WebInfo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface WebInfoRepository : JpaRepository<WebInfo, Long>
