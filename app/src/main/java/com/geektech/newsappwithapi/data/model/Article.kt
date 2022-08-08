package com.geektech.newsappwithapi.data.model

data class Article(
    val author: String, // Павел Комаровский
    val content: String, // , : -, , . , () .{"id":469760,"type":"num","link":"https://vc.ru/finance/469760-proklyate-shchitkoinov-kak-insaydery-nazhivayutsya-na-prodazhe-svoih-monet-kripto-homyakam","gtm":"","prevCount":… [+997 chars]
    val description: String, // Если вы пользуетесь Телеграмом, то вы знаете: он просто кишит крипто-гуру, которым не терпится поделиться с вами советом по покупке самой новомодной и перспективной монеты, ракетой рвущейся к небесам. В этой статье мы разбираемся, почему к этим советам вряд л…
    val publishedAt: String, // 2022-08-08T06:30:14Z
    val source: Source,
    val title: String, // Проклятье щиткоинов: как инсайдеры наживаются на продаже своих монет крипто-хомякам — Финансы на vc.ru - vc.ru
    val url: String, // https://vc.ru/finance/469760-proklyate-shchitkoinov-kak-insaydery-nazhivayutsya-na-prodazhe-svoih-monet-kripto-homyakam
    val urlToImage: String // https://vc.ru/cover/fb/c/469760/1659940214/cover.jpg
)