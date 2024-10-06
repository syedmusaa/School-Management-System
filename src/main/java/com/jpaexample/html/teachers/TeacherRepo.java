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
package com.jpaexample.html.teachers;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TeacherRepo {

    @PersistenceContext
    private EntityManager entityManager;
    
    public void insert(Teacher teacher) {
        entityManager.merge(teacher); // Use merge to insert or update
    }

    public List<Teacher> getAllTeachers() {
        return entityManager.createQuery("SELECT t FROM Teacher t", Teacher.class).getResultList();
    }

    public Teacher getTeacherById(long id) {
        return entityManager.find(Teacher.class, id);
    }

    public void saveTeacher(Teacher teacher) {
        entityManager.merge(teacher);
    }

    public void updateTeacher(Teacher teacher) {
        entityManager.merge(teacher);
    }

    public void deleteTeacher(long id) {
    	Teacher teacher = entityManager.find(Teacher.class, id);
        if (teacher != null) {
            entityManager.remove(teacher);
        }
    }
}