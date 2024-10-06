//package com.jpaexample.customersdetails;
//
//import java.util.List;
//
//import org.springframework.stereotype.Repository;
//
//import com.jpaexample.customer.Customer;
//
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.persistence.TypedQuery;
//import jakarta.transaction.Transactional;
//
//@Repository
//@Transactional
//public class CustomerJpaRepository {
//	
//	@PersistenceContext
//	private EntityManager entityManager;
//	
//	public void insert(Customer customer) {
//		entityManager.merge(customer);
//	}
//	
//	public Customer findById(long id) {
//		return entityManager.find(Customer.class, id);
//	}
//
//	public void deleteById(long id) {
//		
//		Customer customer = entityManager.find(Customer.class, id);
//		entityManager.remove(customer);
//		
//	}
//	
//	
//	
//	
//	public  void update(Customer customer, Long cId) {
//        // Find the existing student entity by sId
//        Customer existingCustomer = entityManager.find(Customer.class, cId);
//
//        if (existingCustomer != null) {
//            // Update fields of the existing entity with values from the new student object
//             existingCustomer.setName(customer.getName());
//            existingCustomer.setEmail(customer.getEmail());
//
//            // No need to call merge() as existingStudent is managed
//            entityManager.merge(existingCustomer); // Optional
//        }
//    }
//  
//  public List<Customer> findCustomerByName(String name) {
//        // JPQL query to find students by college name
//        TypedQuery<Customer> query = entityManager.createQuery(
//            "SELECT s FROM Customer c WHERE c.name = :name", Customer.class);
//        query.setParameter("name", name);
//        
//        // Execute query and return the result list
//        return query.getResultList();
//    }
//
//
//
//
//
//
//
//	
//	
//	
////	public Customer findById(long id) {
////		return entityManager.find(Customer.class, id);
////	}
//	
////	public void deleteById(long id) {
////		Customer customer = entityManager.find(Customer.class, id);
////		entityManager.remove(customer);
////		
////	}
//}
//}
package com.jpaexample.html.courses;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseRepo {

    @PersistenceContext
    private EntityManager entityManager;
    
    public void insert(Course course) {
        entityManager.merge(course); // Use merge to insert or update
    }

    public List<Course> getAllCourses() {
        return entityManager.createQuery("SELECT s FROM Student s", Course.class).getResultList();
    }

    public Course getCourseById(long id) {
        return entityManager.find(Course.class, id);
    }

    public void saveCourse(Course course) {
        entityManager.merge(course);
    }

    public void updateCourse(Course course) {
        entityManager.merge(course);
    }

    public void deleteCourse(long id) {
    	Course course = entityManager.find(Course.class, id);
        if (course != null) {
            entityManager.remove(course);
        }
    }

	public Object findById(Long courseId) {
		// TODO Auto-generated method stub
		return null;
	}
}