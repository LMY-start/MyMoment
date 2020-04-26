package com.example.moment.recycleView

import com.example.moment.model.Comment
import com.example.moment.model.Image
import com.example.moment.model.MomentMessage
import com.example.moment.model.Sender

class DataUtils {

    val words = "Material is the metaphor." +
            "A material metaphor is the unifying theory of a rationalized space and a system of motion.\n\n" +
            "物质隐喻是合理空间和运动系统的统一理论。" +
            "材料是以触觉为基础的，灵感来源于对纸和墨水的研究"

    fun createMomentMessagesData(): List<MomentMessage> {
        return mutableListOf(
            MomentMessage(
                words,
                listOf(
                    Image("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRDy7HZaHxn15wWj6pXE4uMKAqHTC_uBgBlIzeeQSj2QaGgUzUmHg"),
                    Image("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTlJRALAf-76JPOLohBKzBg8Ab4Q5pWeQhF5igSfBflE_UYbqu7"),
                    Image("http://i.ytimg.com/vi/rGWI7mjmnNk/hqdefault.jpg")
                ),
                Sender(
                    "jport",
                    "Joe Portman",
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w"
                ),
                listOf(
                    Comment(
                        "Good",
                        Sender(
                            "outman",
                            "Super hero",
                            "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w"
                        )
                    )
//                    Comment(
//                        "Good +1",
//                        Sender(
//                            "outman1",
//                            "Super hero",
//                            "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w"
//                        )
//                    ),
//                    Comment(
//                        "Good +2",
//                        Sender(
//                            "outman2",
//                            "Super hero",
//                            "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w"
//                        )
//                    )
                )
            ), MomentMessage(
                "沙发1",
                listOf(
                    Image("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRDy7HZaHxn15wWj6pXE4uMKAqHTC_uBgBlIzeeQSj2QaGgUzUmHg"),
                    Image("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTlJRALAf-76JPOLohBKzBg8Ab4Q5pWeQhF5igSfBflE_UYbqu7"),
                    Image("http://i.ytimg.com/vi/rGWI7mjmnNk/hqdefault.jpg")
                ),
                Sender(
                    "jport",
                    "Joe Portman",
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w"
                ),
                listOf(
                    Comment(
                        "Good1",
                        Sender(
                            "outman",
                            "Super hero",
                            "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w"
                        )
                    )
                )
            ), MomentMessage(
                "沙发2",
                listOf(
                    Image("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRDy7HZaHxn15wWj6pXE4uMKAqHTC_uBgBlIzeeQSj2QaGgUzUmHg"),
                    Image("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTlJRALAf-76JPOLohBKzBg8Ab4Q5pWeQhF5igSfBflE_UYbqu7"),
                    Image("http://i.ytimg.com/vi/rGWI7mjmnNk/hqdefault.jpg")
                ),
                Sender(
                    "jport",
                    "Joe Portman",
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w"
                ),
                listOf(
                    Comment(
                        "Good2",
                        Sender(
                            "outman",
                            "Super hero",
                            "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w"
                        )
                    )
                )
//            ), MomentMessage(
//                "沙发",
//                listOf(
//                    Image("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRDy7HZaHxn15wWj6pXE4uMKAqHTC_uBgBlIzeeQSj2QaGgUzUmHg"),
//                    Image("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTlJRALAf-76JPOLohBKzBg8Ab4Q5pWeQhF5igSfBflE_UYbqu7"),
//                    Image("http://i.ytimg.com/vi/rGWI7mjmnNk/hqdefault.jpg")
//                ),
//                Sender(
//                    "jport",
//                    "Joe Portman",
//                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w"
//                ),
//                listOf(
//                    Comment(
//                        "Good",
//                        Sender(
//                            "outman",
//                            "Super hero",
//                            "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w"
//                        )
//                    ),
//                    Comment(
//                        "Good +1",
//                        Sender(
//                            "outman1",
//                            "Super hero",
//                            "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w"
//                        )
//                    ),
//                    Comment(
//                        "Good +2",
//                        Sender(
//                            "outman2",
//                            "Super hero",
//                            "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w"
//                        )
//                    )
//                )
//            ), MomentMessage(
//                "沙发",
//                listOf(
//                    Image("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRDy7HZaHxn15wWj6pXE4uMKAqHTC_uBgBlIzeeQSj2QaGgUzUmHg"),
//                    Image("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTlJRALAf-76JPOLohBKzBg8Ab4Q5pWeQhF5igSfBflE_UYbqu7"),
//                    Image("http://i.ytimg.com/vi/rGWI7mjmnNk/hqdefault.jpg")
//                ),
//                Sender(
//                    "jport",
//                    "Joe Portman",
//                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w"
//                ),
//                listOf(
//                    Comment(
//                        "Good",
//                        Sender(
//                            "outman",
//                            "Super hero",
//                            "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRJm8UXZ0mYtjv1a48RKkFkdyd4kOWLJB0o_l7GuTS8-q8VF64w"
//                        )
//                    )
//                )
            )
        )
    }

    fun createCommentData(): List<Comment> {
        return createMomentMessagesData().map { data ->
            return data.comments
        }.toList()
    }
}