package com.itbear.impression.repositories;

import com.itbear.impression.entities.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author：Bear
 * @site：https://www.yuque.com/bearpess
 * @email：bearpess@gmail.com
 * @created 2021-07-24 18:26:35 星期六
 * <p>
 * features：
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

//    @Query(value = "select * from category ", nativeQuery = true)
//    Category getCategoryName();


}
