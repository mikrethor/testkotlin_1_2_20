package com.ablx.daycare.backend.repository

import com.ablx.daycare.backend.entity.MyEntity
import org.springframework.data.jpa.repository.JpaRepository

internal interface MyRepository : JpaRepository<MyEntity, Long>{


}