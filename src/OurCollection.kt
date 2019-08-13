fun <T> Iterable<T>.ourAll(predicate: (T) -> Boolean): Boolean {
    if (this is Collection && isEmpty()) return true
    for (element in this) if (!predicate(element)) return false
    return true
}


fun <T> Iterable<T>.ourAny(predicate: (T) -> Boolean): Boolean {
    if (this is Collection && isEmpty()) return false
    for (element in this) if (predicate(element)) return true
    return false
}

fun <T> Iterable<T>.ourAny(): Boolean {
    if (this is Collection) return !isEmpty()
    return iterator().hasNext()
}