package com.test.cmp_bookpedia.book.presentation.book_list

import com.test.cmp_bookpedia.book.domain.Book

// What can change on the screen that the user has an impact on
sealed interface BookListAction {
    data class OnSearchQueryChange(val query: String): BookListAction
    data class OnBookClick(val book: Book): BookListAction
    data class OnTabSelected(val index: Int): BookListAction
}