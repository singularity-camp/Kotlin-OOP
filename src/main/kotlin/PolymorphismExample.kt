interface Contract

open class A : Contract

open class B : A()

open class C : B()

fun main() {
    someFun(A())
    someFun(B())
    someFun(C())
}

fun someFun(a: Contract) {

}