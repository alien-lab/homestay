package com.homestay.repository;

import com.homestay.entity.Agree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 慧慧姐 on 2017/3/24.
 */
@Repository
public interface AgreeRepository extends JpaRepository<Agree,Long>{

}
