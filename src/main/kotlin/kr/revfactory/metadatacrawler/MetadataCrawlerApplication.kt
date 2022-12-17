package kr.revfactory.metadatacrawler

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MetadataCrawlerApplication

fun main(args: Array<String>) {
	runApplication<MetadataCrawlerApplication>(*args)
}
