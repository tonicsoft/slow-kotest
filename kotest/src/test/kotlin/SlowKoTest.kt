import io.kotest.core.spec.style.DescribeSpec

class SlowKoTest: DescribeSpec({
    describe("kotest") {
        it("should take about 4 seconds to run this test on a top end laptop") {
            val i = 0
        }
    }
})