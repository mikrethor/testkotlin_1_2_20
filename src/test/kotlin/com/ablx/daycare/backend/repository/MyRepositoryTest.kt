package com.ablx.daycare.backend.repository

import org.assertj.core.api.Assertions
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner::class)
@DataJpaTest
class MyRepositoryTest {

    @Autowired
    private lateinit var repository: MyRepository

    @Test
    fun findOne() {
        val child= repository.findOne(1L)
        Assertions.assertThat(child.label)
                .isEqualTo("label")
    }


}