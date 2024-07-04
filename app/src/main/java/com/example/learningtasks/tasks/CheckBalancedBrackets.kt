package com.example.learningtasks.tasks

fun main() {
    val bracketsCheck = BracketsCheck()
    val input = "{{()}[]}"
    val balanced = bracketsCheck.check(input)
    if (balanced)
        println("Balanced")
    else
        println("Not Balanced")
}

class BracketsCheck {
    fun check(brackets: String): Boolean {
        var bracket = -1

        val characters = CharArray(brackets.length)

        for (ch in brackets.toCharArray()) {
            when (ch) {'(', '{', '[' -> characters[++bracket] = ch

                else -> {

                    if (bracket >= 0 && ((characters[bracket] == '(' && ch == ')') || (characters[bracket] == '{' && ch == '}') || (characters[bracket] == '[' && ch == ']')))
                        bracket--
                    else
                        return false
                }
            }
        }
        return bracket == -1
    }
}

//
//object BalancedBrackets {
//    fun areBracketsBalanced(set: String): Boolean {
//
//        for (i in set.indices) {
//            val input = set[i]
//
//            if (input == '(' || input == '[' || input == '{') {
//                stack.push(input)
//                continue
//            }
//
//            if (stack.isEmpty())
//                return false
//            val check: Char = when (input) {
//                ')' -> {
//                    val check = stack.pop()
//                    if (check == '{' || check == '[')
//                        return false
//                    check
//                }
//
//                '}' -> {
//                    val check = stack.pop()
//                    if (check == '(' || check == '[')
//                        return false
//                    check
//                }
//
//                ']' -> {
//                    val check = stack.pop()
//                    if (check == '(' || check == '{')
//                        return false
//                    check
//                }
//
//                else -> continue
//            }
//        }
//
//        return stack.isEmpty()
//    }
//}

//
//val expr = "([{}])"
//if (areBracketsBalanced(expr)) println("Balanced ")
//else println("Not Balanced ")





