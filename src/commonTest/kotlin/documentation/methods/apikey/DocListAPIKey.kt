package documentation.methods.apikey

import documentation.client
import runBlocking
import kotlin.test.Ignore
import kotlin.test.Test


@Ignore
internal class DocListAPIKey {

//    suspend fun ClientSearch.listAPIKeys(
//        requestOptions: __RequestOptions?__ = null
//    ): ResponseListAPIKey

    @Test
    fun snippet1() {
        runBlocking {
            client.listAPIKeys()
        }
    }
}