package kr.ac.anu.storyleave.core.ui

sealed interface CommonUiState<out T> {
    data object Loading : CommonUiState<Nothing>

    data class Content<T>(
        val value: T,
    ) : CommonUiState<T>

    data class Empty(
        val message: String? = null,
    ) : CommonUiState<Nothing>

    data class Error(
        val message: String,
        val cause: Throwable? = null,
    ) : CommonUiState<Nothing>
}
