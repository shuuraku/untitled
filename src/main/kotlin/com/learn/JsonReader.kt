package com.learn

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {
    //使用readText()讀取網路連線網址所有資料存處到字串中，簡單的方法。
    val url = URL("\thttps://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=4b1b1eab-9338-4bcf-8b23-27e015f1714a&rid=49090d61-285a-4a17-a9c2-73a32b13f623")
    println(url.readText())

    /*利用Kotlin的with方法簡潔化
    最終簡潔後
    with(url.openConnection() as HttpURLConnection){
        val br = inputStream.bufferedReader().lines().forEach {
            println(it)
        }

        /*使用with後初步簡潔化
        val br = inputStream.bufferedReader()
        var line = br.readLine()
        val json = StringBuffer()
        while (line != null){
            json.append(line)
            line = br.readLine()
        }
        println(json.toString())*/
    }

    /*比照java那樣
    val connetion = url.openConnection() as HttpURLConnection
    val br = BufferedReader(InputStreamReader(connetion.inputStream))
    var line = br.readLine()
    val json = StringBuffer()
    while (line != null){
        json.append(line)
        line = br.readLine()
    }
    println(json.toString()) */*/
}