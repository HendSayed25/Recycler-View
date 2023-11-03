package com.example.recyclerview

class SettingItem
{
    var Title:String?=null
    var SubTitle:String?=null
    var image:Int?=null
    constructor(title:String,subTitle:String,image:Int)
    {
        this.Title=title
        this.SubTitle=subTitle
        this.image=image
    }
    fun set_Title(title:String)
    {
        this.Title=title
    }
    fun get_Title():String
    {
        return (this.Title!!)
    }
    fun set_subTitle(subtitle:String)
    {
        this.SubTitle=subtitle
    }
    fun get_SubTitle():String
    {
        return (this.SubTitle!!)
    }
    fun set_image(img:Int)
    {
        this.image=img
    }
    fun get_image():Int
    {
        return (this.image!!)
    }
}