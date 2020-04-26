package com.example.moment

class ListData {

    fun createData(): MutableList<Data> {
        return mutableListOf(
            Data("千味拉面千味拉面千味拉面千味拉面千味拉面千味拉面千味拉面千味拉面千味拉面千味拉面", "bingyang", "13312341234", "绿地世纪城"),
            Data("必胜客宅急送", "xiongmaopisa", "13312341234", "木星"),
            Data("麦当劳", "kaoniurou", "13312341234", "冰粉那就"),
            Data("肯德基", "longfeikaorou", "13312341234", "地球上"),
            Data("黄焖鸡", "mizhikaorou", "13312341234", "火星"),
            Data("必胜客宅急送", "xiongmaopisa", "13312341234", "木星"),
            Data("麦当劳", "kaoniurou", "13312341234", "冰粉那就"),
            Data("肯德基", "longfeikaorou", "13312341234", "地球上"),
//            Data("黄焖鸡", "mizhikaorou", "13312341234", "火星"),
//            Data("千味拉面千味拉面千味拉面千味拉面千味拉面千味拉面千味拉面千味拉面千味拉面千味拉面", "bingyang", "13312341234", "绿地世纪城"),
//            Data("必胜客宅急送", "xiongmaopisa", "13312341234", "木星"),
//            Data("麦当劳", "kaoniurou", "13312341234", "冰粉那就"),
//            Data("肯德基", "longfeikaorou", "13312341234", "地球上"),
//            Data("黄焖鸡", "mizhikaorou", "13312341234", "火星"),
//            Data("必胜客宅急送", "xiongmaopisa", "13312341234", "木星"),
//            Data("麦当劳", "kaoniurou", "13312341234", "冰粉那就"),
//            Data("肯德基", "longfeikaorou", "13312341234", "地球上"),
            Data("黄焖鸡", "mizhikaorou", "13312341234", "火星")
        )
    }

    data class Data(
        val name: String,
        val image: String,
        val tel: String,
        val location: String

    )
}