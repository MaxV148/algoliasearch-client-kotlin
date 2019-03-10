import kotlinx.coroutines.runBlocking
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract
import kotlin.reflect.KClass
import kotlin.test.*


internal infix fun <T> T.shouldEqual(expected: T) {
    assertEquals(expected, this)
}

internal infix fun <T> T.shouldNotEqual(expected: T) {
    assertNotEquals(expected, this)
}

internal fun Any?.shouldBeNull() {
    assertNull(this)
}

@UseExperimental(ExperimentalContracts::class)
internal fun <T : Any> T?.shouldNotBeNull(): T {
    contract {
        returns() implies (this@shouldNotBeNull != null)
    }
    assertNotNull(this)
    return this
}

internal fun Boolean.shouldBeTrue() {
    assertTrue(this)
}

internal fun Boolean.shouldBeFalse() {
    assertFalse(this)
}

internal infix fun <T> Collection<T>?.shouldContain(element: T) {
    (this?.contains(element) ?: false).shouldBeTrue()
}

internal infix fun <T> Collection<T>?.shouldNotContain(element: T) {
    (this?.contains(element) ?: false).shouldBeFalse()
}

internal fun <T> Collection<T>.shouldBeEmpty() {
    this.isEmpty().shouldBeTrue()
}

internal fun <T> Collection<T>.shouldNotBeEmpty() {
    this.isNotEmpty().shouldBeTrue()
}

internal infix fun <K, V> Map<K, V>?.shouldContainKey(key: K) {
    (this?.containsKey(key) ?: false).shouldBeTrue()
}

internal infix fun <K, V> Map<K, V>?.shouldNotContainKey(key: K) {
    (this?.containsKey(key) ?: false).shouldBeFalse()
}

internal infix fun <K, V> Map<K, V>?.shouldContainValue(value: V) {
    (this?.containsValue(value) ?: false).shouldBeTrue()
}

internal infix fun <K, V> Map<K, V>?.shouldNotContainValue(value: V) {
    (this?.containsValue(value) ?: false).shouldBeFalse()
}

internal fun <K, V> Map<K, V>.shouldBeEmpty() {
    this.isEmpty().shouldBeTrue()
}

internal fun <K, V> Map<K, V>.shouldNotBeEmpty() {
    this.isNotEmpty().shouldBeTrue()
}

internal infix fun <T : Throwable> KClass<T>.shouldFailWith(block: suspend () -> Unit): T {
    return assertFailsWith(this, null) {
        runBlocking {
            block()
        }
    }
}