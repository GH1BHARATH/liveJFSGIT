package com.ezshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ezshop.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, String>{
//	/**
//  * Finds a product by using the productName as search criteria.
//  * @param productNameParam
//  * @return  A list of products whose name is an exact match with the given productName.
//  * If no products are found, this method returns an empty list.
//  */
	@Query("select product from Product product where product.productName = :productNameParam")
	public List<Product> findByProductName(@Param("productNameParam") String productName);
}

//ProductRepository  productRepository = new ProductRepositoryImpl(
/*
 * class ProductRepositoryImpl<Product,String> implements ProductRepository{
 * 
 * @Override public List<com.ezshop.entity.Product> findAll() { // TODO
 * Auto-generated method stub return null; }
 * 
 * @Override public List<com.ezshop.entity.Product> findAll(Sort sort) { // TODO
 * Auto-generated method stub return null; }
 * 
 * @Override public List<com.ezshop.entity.Product>
 * findAllById(Iterable<java.lang.String> ids) { // TODO Auto-generated method
 * stub return null; }
 * 
 * @Override public <S extends com.ezshop.entity.Product> List<S>
 * saveAll(Iterable<S> entities) { // TODO Auto-generated method stub return
 * null; }
 * 
 * @Override public void flush() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public <S extends com.ezshop.entity.Product> S saveAndFlush(S
 * entity) { // TODO Auto-generated method stub return null; }
 * 
 * @Override public void deleteInBatch(Iterable<com.ezshop.entity.Product>
 * entities) { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void deleteAllInBatch() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public com.ezshop.entity.Product getOne(java.lang.String id) { //
 * TODO Auto-generated method stub return null; }
 * 
 * @Override public <S extends com.ezshop.entity.Product> List<S>
 * findAll(Example<S> example) { // TODO Auto-generated method stub return null;
 * }
 * 
 * @Override public <S extends com.ezshop.entity.Product> List<S>
 * findAll(Example<S> example, Sort sort) { // TODO Auto-generated method stub
 * return null; }
 * 
 * @Override public Page<com.ezshop.entity.Product> findAll(Pageable pageable) {
 * // TODO Auto-generated method stub return null; }
 * 
 * @Override public <S extends com.ezshop.entity.Product> S save(S entity) { //
 * TODO Auto-generated method stub return null; }
 * 
 * @Override public Optional<com.ezshop.entity.Product>
 * findById(java.lang.String id) { // TODO Auto-generated method stub return
 * null; }
 * 
 * @Override public boolean existsById(java.lang.String id) { // TODO
 * Auto-generated method stub return false; }
 * 
 * @Override public long count() { // TODO Auto-generated method stub return 0;
 * }
 * 
 * @Override public void deleteById(java.lang.String id) { // TODO
 * Auto-generated method stub
 * 
 * }
 * 
 * @Override public void delete(com.ezshop.entity.Product entity) { // TODO
 * Auto-generated method stub
 * 
 * }
 * 
 * @Override public void deleteAll(Iterable<? extends com.ezshop.entity.Product>
 * entities) { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void deleteAll() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public <S extends com.ezshop.entity.Product> Optional<S>
 * findOne(Example<S> example) { // TODO Auto-generated method stub return null;
 * }
 * 
 * @Override public <S extends com.ezshop.entity.Product> Page<S>
 * findAll(Example<S> example, Pageable pageable) { // TODO Auto-generated
 * method stub return null; }
 * 
 * @Override public <S extends com.ezshop.entity.Product> long count(Example<S>
 * example) { // TODO Auto-generated method stub return 0; }
 * 
 * @Override public <S extends com.ezshop.entity.Product> boolean
 * exists(Example<S> example) { // TODO Auto-generated method stub return false;
 * }
 * 
 * }
 */