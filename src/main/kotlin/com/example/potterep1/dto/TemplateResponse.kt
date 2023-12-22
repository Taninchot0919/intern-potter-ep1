package com.example.potterep1.dto

/*
*
* The result must be like this
* {
*     code: Int,
*     data: data
* }
*
*/

data class TemplateResponse(
    val code: Int,
    val data: Any?
)