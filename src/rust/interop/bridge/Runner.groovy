//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjiramramji

package rust.interop.bridge

class Runner {
    static void main(String[] args) {
        def bridge = new NativeInterop()
        def url = "https://interoperability.onrender.com/filter"
        def testJson = '{"page": "1"}'

        println "Interoperability FFI (Groovy CLI)"

        try {
            def response = bridge.fetchInteroperability(url, testJson)
            println response
        } catch (Exception e) {
            println "Error: ${e.message}"
            e.printStackTrace()
        }
    }
}

//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjiramramji