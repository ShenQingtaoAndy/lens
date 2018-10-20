/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sqt.photo.repository;

import com.sqt.photo.entitys.Photo;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author 212579464
 */
public interface PhotoRepository extends PagingAndSortingRepository<Photo, String>{
    
}
