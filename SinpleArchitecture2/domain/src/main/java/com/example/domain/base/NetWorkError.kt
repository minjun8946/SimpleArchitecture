package com.example.domain.base

import java.lang.RuntimeException

class Unknown : RuntimeException()
class NotFound(msg: String) : RuntimeException()